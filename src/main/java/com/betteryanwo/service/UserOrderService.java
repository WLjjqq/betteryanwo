package com.betteryanwo.service;

import com.betteryanwo.entity.UserOrder;

import java.util.List;

/**
 * @author :MaMengna
 * @Date :Create in 15:31 2018/6/22
 */
public interface UserOrderService {
    public List<UserOrder> selUserOrder(Long userId);
}
