package com.betteryanwo.dao;

import com.betteryanwo.entity.CartItem;
import com.betteryanwo.entity.OrderItem;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Create by 六
 * Date:18-6-7
 */
public interface OrderItemDao {
    /**
     * 新增订单项
     * @param orderItem
     * @return
     */
    @Transactional
    int insert(OrderItem orderItem);

    @Transactional
    int insertList(List<OrderItem> orderItemList);

    /**
     * 更新订单项
     * @param orderItem
     * @return
     */
    @Transactional
    int update(OrderItem orderItem);

    /**
     * 根据ID删除订单项
     * @param id
     * @return
     */
    @Transactional
    int delete(Long id);

    /**
     * 根据订单ID删除订单项
     * @param orderId
     * @return
     */
    int deleteOrderItem(@Param("orderId") Long orderId);
    /**
     * 清空订单项
     * @param orderId
     * @return
     */
    @Transactional
    int deleteByOrderId(Long orderId);

    /**
     * 查询订单项
     * @param orderId
     * @return
     */
    List<OrderItem> getOrderItemByOrderId(@RequestParam("orderId") Long orderId);
}
