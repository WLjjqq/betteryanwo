package com.betteryanwo.dao;

import com.betteryanwo.entity.Cart;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Create by 六
 * Date:18-5-31
 */
public interface ShopCartDao {
    /**
     * 根据ID查询购物车
     * @param id
     * @return
     */
    Cart getById(Long id);

    /**
     * 根据用户ID查询购物车
     * @param userId
     * @return
     */
    Cart getAllByUserId(Long userId);



    /**
     * 根据用户ID查询购物项数量
     * @param userId
     * @return
     */
    Cart getCountByUserId(Long userId);

    /**
     * 获取所有购物车
     * @return
     */
    List<Cart> getAll();

    /**
     * 根据购物车条件进行筛选
     * @param entity
     * @return
     */
    List<Cart> getAllByCart(Cart entity);

    /**
     * 新增购物车
     * @param entity
     * @return
     */
    @Transactional
    int insert(Cart entity);

    /**
     * 更新购物车
     * @param entity
     * @return
     */
    @Transactional
    int update(Cart entity);

    /**
     * 删除购物车ID
     * @param cartId
     * @return
     */
    @Transactional
    int delete(@Param("cartId") Long cartId);
}
