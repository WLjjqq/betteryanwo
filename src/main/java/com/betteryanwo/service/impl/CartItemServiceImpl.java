package com.betteryanwo.service.impl;

import com.betteryanwo.dao.CartItemDao;
import com.betteryanwo.entity.Cart;
import com.betteryanwo.entity.CartItem;
import com.betteryanwo.service.CartItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Create by 六
 * Date:18-6-8
 */
@Service
public class CartItemServiceImpl implements CartItemService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    CartItemDao cartItemDao;

    @Override
    public CartItem getById(Long id, Long cartId) {
        return cartItemDao.getById(id,cartId);
    }

    @Override
    public List<CartItem> getAllByCartId(Long cartId) {
        return cartItemDao.getAllByCartId(cartId);
    }

    @Override
    public CartItem getByCartItem(CartItem entity) {
        return cartItemDao.getByCartItem(entity);
    }

    @Override
    public int insert(CartItem entity) {
        return cartItemDao.insert(entity);
    }

    @Override
    public int update(CartItem entity) {
        return cartItemDao.update(entity);
    }

    @Override
    public int delete(Long id) {
        return cartItemDao.delete(id);
    }

    @Override
    public int deleteByCartId(Long cartId) {
        return cartItemDao.deleteByCartId(cartId);
    }

    /**
     * 添加购物项
     * @param item 购物项
     * @Author
     */
    @Override
    public List<CartItem> addDistrict(Cart cart, CartItem item) {
        List<CartItem> cartInfos = cartItemDao.getAllByCartId(cart.getId());
        if(hasItem(item,cartInfos)){
            return cartInfos;
        }else{
            insert(item);
        }
        return cartInfos;
    }
    /**
     * 是否已存在此购物项
     *
     * @param item
     *            购物项
     * @return boolean
     */
    private boolean hasItem(CartItem item, List<CartItem> items) {
        Long id1 = item.getId();
        for (CartItem item1 : items) {
            Long  id2 = item1.getId();
            if (id1.equals(id2)) {
                return true;
            }
        }
        return false;
    }



    @Override
    public boolean cartInfoHasGoods(Long goodsId, Long cartId) {
        int i = cartItemDao.selectCartInfoByGoodsIdAndCartId(goodsId, cartId);
        if(i==0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<Map<String, Object>> getNumAndPrice(Long goodsId, Long cartId) {
        return cartItemDao.getNumAndPrice(goodsId,cartId);
    }
}
