package com.betteryanwo.service.impl;

import com.betteryanwo.dao.UserOrderDao;
import com.betteryanwo.entity.UserOrder;
import com.betteryanwo.service.UserOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author :MaMengna
 * @Date :Create in 15:32 2018/6/22
 */
@Service
public class UserOrderServiceImpl implements UserOrderService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserOrderServiceImpl.class);

    @Autowired
    private UserOrderDao userOrderDao;
    @Override
    public List<UserOrder> selUserOrder(Long userId){
        List<UserOrder> list=userOrderDao.selUserOrder(userId);
        return list;
    }
}
