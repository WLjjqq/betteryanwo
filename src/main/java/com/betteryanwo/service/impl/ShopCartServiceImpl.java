package com.betteryanwo.service.impl;

import com.betteryanwo.dao.ShopCartDao;
import com.betteryanwo.entity.Cart;
import com.betteryanwo.entity.CartItem;
import com.betteryanwo.entity.Goods;
import com.betteryanwo.exception.OrderException;
import com.betteryanwo.service.CartItemService;
import com.betteryanwo.service.GoodsService;
import com.betteryanwo.service.ShopCartService;
import com.betteryanwo.util.OrderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by 六
 * Date:18-6-1
 */
@Service
public class ShopCartServiceImpl implements ShopCartService {
    @Autowired
    ShopCartDao shopCartDao;
    @Autowired
    GoodsService goodsService;
    @Autowired
    CartItemService cartItemService;
    /**
     * 根据ID获取购物车
     * @param id
     * @return
     */
    @Override
    public Cart getById(Long id) {
        return shopCartDao.getById(id);
    }

    /**
     * 根据用户ID获取购物车
     * @param userId
     * @return
     */
    @Override
    public Cart getByUserId(Long userId) {
        return shopCartDao.getAllByUserId(userId);
    }

    /**
     * 获取所有购物车
     * @return
     */
    @Override
    public List<Cart> getAll() {
        return shopCartDao.getAll();
    }

    /**
     * 根据条件筛选购物车
     * @param entity
     * @return
     */
    @Override
    public List<Cart> getAll(Cart entity) {
        return shopCartDao.getAllByCart(entity);
    }

    /**
     * 修改购物车
     * @param entity
     * @return
     */
    @Override
    @Transactional
    public int update(Cart entity) {
        return shopCartDao.update(entity);
    }

    /**
     * 添加购物车
     * @param entity
     * @return
     */
    @Override
    public int insert(Cart entity) {
        return shopCartDao.insert(entity);
    }

    @Override
    public Map<String, Object> insert(Long userId, Cart cart, Long goodsId, Integer itemNum) {
        String message = null;
        Goods goods = goodsService.getGoodsById(goodsId);
        if(null ==goods){
            throw new OrderException("未找到相对应的商品");
        }

        //查看库存
        int countGoods = goodsService.CountGoods(goodsId);
        if(countGoods<itemNum){
            throw new OrderException("库存不足");
        }
        //创建购物项
        CartItem cartItem = new CartItem();
        cartItem.setCartId(cart.getId());
        cartItem.setGoods(goods);
        cartItem.setPrice(new BigDecimal(goods.getGPrice()*itemNum));
        //有没有这个购物项
        boolean hasItem=initCartItem(userId,cart,cartItem,goods,itemNum,false);
        /* 如果购物项已存在则更新购物项,否则新添加一个购物项 */

        if (hasItem) {
            //修改购物车项
            cartItemService.update(cartItem);
        } else {
            //新增加购物车项
            cartItemService.insert(cartItem);
        }
        List<CartItem> cartItemList = cartItemService.getAllByCartId(cart.getId());
        cart.setCartItems(cartItemList);
        cart.setPrice(OrderUtil.calculateCart(cartItemList));
        update(cart);
        Map<String, Object> cartInfo = new HashMap<>();
        cartInfo.put("cart", cart);
        cartInfo.put("message", message);
        return cartInfo;
    }


    /**
     * 初始化购物项</br>
     * 先判断是否存在该订单项,如果存在则总数量等于已存在的数量加上新的数量, 如果订单项不存在,则新建一个订单项</br>
     * @param userId 用户ID
     * @param cart 购物车
     * @param cartItem  购物车项
     * @param goods 商品
     * @param itemNum 购买的数量
     * @param isUpdate 是否为更新。就是是否有这个购物项
     * @return
     */
    private boolean initCartItem(Long userId,Cart cart,CartItem cartItem,Goods goods,Integer itemNum, boolean isUpdate){
        try{
            if(isUpdate){
                return true;
            }
            CartItem cartItems = cartItemService.getByCartItem(cartItem);
            //购物项不为空，数量等于已存在的数量加上新的数量。
            if(null != cartItems){
                int i = itemNum + cartItems.getItemNum();
                cartItem.setItemNum(i);
                cartItem.setCartId(cartItems.getCartId());
                cartItem.setId(cartItems.getId());
                cartItem.setGoods(goods);
                cartItem.setPrice(new BigDecimal(i*goods.getGPrice()));
                return true;
            }else{
                cartItem.setCartId(cart.getId());
                cartItem.setGoods(goods);
                cartItem.setItemNum(itemNum);
                cartItem.setPrice(new BigDecimal(itemNum * goods.getGPrice()));
                return false;
            }

        }catch (Exception e){
            throw new OrderException(e.getMessage(), e);
        }
    }
    @Override
    public int delete(Long cartId) {
        return shopCartDao.delete(cartId);
    }
}
