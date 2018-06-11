package com.betteryanwo.service.impl;

import com.betteryanwo.dao.CartInfoDao;
import com.betteryanwo.entity.Cart;
import com.betteryanwo.entity.CartInfo;
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
    CartInfoDao cartInfoDao;

    @Override
    public CartInfo getById(Long id, Long cartId) {
        return cartInfoDao.getById(id,cartId);
    }

    @Override
    public List<CartInfo> getAllByCartId(Long cartId) {
        return cartInfoDao.getAllByCartId(cartId);
    }

    @Override
    public CartInfo getByCartItem(CartInfo entity) {
        return cartInfoDao.getByCartItem(entity);
    }

    @Override
    public int insert(CartInfo entity) {
        return cartInfoDao.insert(entity);
    }

    @Override
    public int update(CartInfo entity) {
        return cartInfoDao.update(entity);
    }

    @Override
    public int delete(Long id) {
        return cartInfoDao.delete(id);
    }

    @Override
    public int deleteByCartId(Long cartId) {
        return cartInfoDao.deleteByCartId(cartId);
    }

    /**
     * 添加购物项
     * @param item 购物项
     * @Author
     */
    @Override
    public List<CartInfo> addDistrict(Cart cart, CartInfo item) {
        List<CartInfo> cartInfos = cartInfoDao.getAllByCartId(cart.getId());
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
    private boolean hasItem(CartInfo item, List<CartInfo> items) {
        Long id1 = item.getId();
        for (CartInfo item1 : items) {
            Long  id2 = item1.getId();
            if (id1.equals(id2)) {
                return true;
            }
        }
        return false;
    }



    @Override
    public boolean cartInfoHasGoods(Long goodsId, Long cartId) {
        int i = cartInfoDao.selectCartInfoByGoodsIdAndCartId(goodsId, cartId);
        if(i==0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<Map<String, Object>> getNumAndPrice(Long goodsId, Long cartId) {
        return cartInfoDao.getNumAndPrice(goodsId,cartId);
    }
}
