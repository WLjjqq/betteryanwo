package com.betteryanwo.service;


import com.betteryanwo.entity.Cart;

import java.util.List;
import java.util.Map;

/**
 * Create by 六
 * Date:18-6-1
 */
public interface ShopCartService {
    /**
     * 根据ID获取购物车
     * @param id
     * @return
     */
    Cart getById(Long id);

    /**
     * 根据用户ID获取购物车
     * @param userId
     * @return
     */
    Cart getByUserId(Long userId);



    /**
     * 获取所有购物车
     * @return
     */
    List<Cart> getAll();

    /**
     * 根据条件筛选购物车
     * @param entity
     * @return
     */
    List<Cart> getAll(Cart entity);

    /**
     * 更新购物车
     * @param entity
     * @return
     */
    int update(Cart entity);


    /**
     * 添加购物车
     * @param entity
     * @return
     */
    int insert(Cart entity);
    Map<String,Object> insert(Long userId, Cart cart, Long goodsId, Integer itemNum);


    /**
     * 删除购物车
     * @param cartId
     * @return
     */
    int delete(Long cartId);
}
