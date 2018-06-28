package com.betteryanwo.service;

import com.betteryanwo.entity.CartOrder;

/**
 * Create by 六
 * Date:18-6-27
 */
public interface CartOrderService {
    /**
     * 从购物车中提交的数据保存到这里
     * @param cartOrder
     * @return
     */
    int insert(CartOrder cartOrder);
}
