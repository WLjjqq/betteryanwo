package com.betteryanwo.service;

import com.betteryanwo.entity.PayOrder;

/**
 * Create by 六
 * Date:18-6-6
 */
public interface PayOrderService {
    /**
     * 插入支付
     *
     * @param payOrder
     * @return
     */
    int insertPayOrder(PayOrder payOrder);

    /**
     * 修改支付
     * @param payOrder
     * @return
     */
    int updatePayOrder(PayOrder payOrder);

}
