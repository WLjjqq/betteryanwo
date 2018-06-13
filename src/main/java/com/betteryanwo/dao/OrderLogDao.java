package com.betteryanwo.dao;

import com.betteryanwo.entity.OrderLog;

import java.util.List;

/**
 * Create by 六
 * Date:18-6-13
 */
public interface OrderLogDao {
    /**
     * 获取订单操作记录
     * @param orderSerial 订单序列号
     * @return  订单操作记录
     */
    List<OrderLog> getByOrderSerial(String orderSerial);

    /**
     * 保存订单操作记录
     * @param orderLog 订单操作记录
     * @return
     */
    int insert(OrderLog orderLog);
}
