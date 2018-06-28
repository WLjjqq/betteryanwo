package com.betteryanwo.dao;

import com.betteryanwo.entity.CartOrder;

/**
 * Create by 六
 * Date:18-6-27
 */
public interface CartOrderDao {
    /**
     * 从购物车中的数保存到购物车订单表中
     * @param cartOrder
     * @return
     */
    int insert(CartOrder cartOrder);
}
