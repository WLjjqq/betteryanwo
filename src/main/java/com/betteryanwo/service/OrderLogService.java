package com.betteryanwo.service;

import com.betteryanwo.entity.OrderLog;

import java.util.List;

/**
 * Create by 六
 * Date:18-6-13
 */
public interface OrderLogService {

    List<OrderLog> getByOrderSerial(String orderSerial);

    int insert(OrderLog orderLog);
}
