package com.betteryanwo.service;

import com.betteryanwo.entity.OrderItem;
import java.util.List;

/**
 * Create by 六
 * Date:18-6-9
 */
public interface OrderItemService {
    /**
     * 新增订单项
     * @param orderItem
     * @return
     */
    int insert(OrderItem orderItem);

    /**
     * 批量添加订单项
     * @param orderItemList
     * @return
     */
    int insertList(List<OrderItem> orderItemList);

    /**
     * 更新订单项
     * @param orderItem
     * @return
     */
    int update(OrderItem orderItem);

    /**
     * 根据ID删除订单项
     * @param id
     * @return
     */
    int delete(Long id);

    /**
     * 清空订单项
     * @param orderId
     * @return
     */
    int deleteByOrderId(Long orderId);
}
