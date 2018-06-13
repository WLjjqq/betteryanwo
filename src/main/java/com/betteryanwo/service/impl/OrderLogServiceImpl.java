package com.betteryanwo.service.impl;

import com.betteryanwo.entity.OrderLog;
import com.betteryanwo.service.OrderLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by 六
 * Date:18-6-13
 */
@Service
public class OrderLogServiceImpl implements OrderLogService {
    @Autowired
    OrderLogService orderLogService;

    @Override
    public List<OrderLog> getByOrderSerial(String orderSerial) {
        return orderLogService.getByOrderSerial(orderSerial);
    }

    @Override
    public int insert(OrderLog orderLog) {
        return orderLogService.insert(orderLog);
    }
}
