package com.betteryanwo.dao;

import com.betteryanwo.entity.Order;
import org.springframework.transaction.annotation.Transactional;

/**
 * Create by 六
 * Date:18-6-7
 */
public interface OrderDao {
    /**
     * 新增订单
     * @param order
     * @return
     */
    @Transactional
    int insert(Order order);
    /**
     * 更新订单
     * @param order
     * @return
     */
    @Transactional
    int update(Order order);

    /**
     * 删除订单
     * @param orderSerial
     * @return
     */
    @Transactional
    int delete(String orderSerial);
}
