package com.betteryanwo.dao;

import com.betteryanwo.entity.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

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

    /**
     * 根据订单号查询订单
     * @param orderSerial
     * @return
     */
    Order getOrderByOrderSerial(String orderSerial);

    /**
     * 根据用户ID和订单ID查询订单
     * @param userId
     * @param orderSerial
     * @return
     */
    Order getByUserIdAndOrderSerial(@Param("userId") Long userId,
                                @Param("orderSerial") String orderSerial);

}
