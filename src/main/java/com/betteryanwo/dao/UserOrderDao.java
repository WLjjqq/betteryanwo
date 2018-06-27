package com.betteryanwo.dao;

import com.betteryanwo.entity.UserOrder;

import java.util.List;

/**
 * @author :MaMengna
 * @Date :Create in 15:21 2018/6/22
 */
public interface UserOrderDao {
    public List<UserOrder> selUserOrder(Long userId);
}
