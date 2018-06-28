package com.betteryanwo.service.impl;

import com.betteryanwo.dao.OrderItemDao;
import com.betteryanwo.entity.OrderItem;
import com.betteryanwo.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by 六
 * Date:18-6-9
 */
@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Autowired
    OrderItemDao orderItemDao;

    @Override
    public int insert(OrderItem orderItem) {
        return orderItemDao.insert(orderItem);
    }

    @Override
    public int insertList(List<OrderItem> orderItemList) {
        return orderItemDao.insertList(orderItemList);
    }

    @Override
    public int update(OrderItem orderItem) {
        return orderItemDao.update(orderItem);
    }

    @Override
    public int delete(Long id) {
        return orderItemDao.delete(id);
    }

    @Override
    public int deleteByOrderId(Long orderId) {
        return orderItemDao.deleteByOrderId(orderId);
    }

    @Override
    public List<OrderItem> getOrderItemByOrderId(Long orderId) {
        return orderItemDao.getOrderItemByOrderId(orderId);
    }
}
