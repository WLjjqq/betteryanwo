package com.betteryanwo.service.impl;

import com.betteryanwo.dao.ShopCartDao;
import com.betteryanwo.entity.Cart;
import com.betteryanwo.service.ShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Create by 六
 * Date:18-6-1
 */
@Service
public class ShopCartServiceImpl implements ShopCartService {
    @Autowired
    ShopCartDao shopCartDao;

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
    public int delete(Long cartId) {
        return shopCartDao.delete(cartId);
    }
}
