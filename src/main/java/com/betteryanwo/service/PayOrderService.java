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
     * 修改支付的状态
     * @param payId
     * @param newStatus
     * @param oldStatus
     * @return
     */
    int updatePayOrderStatus(Integer payId, Integer newStatus, Integer oldStatus);

}
