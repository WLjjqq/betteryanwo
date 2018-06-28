package com.betteryanwo.service.impl;

import com.betteryanwo.dao.CartOrderDao;
import com.betteryanwo.entity.CartOrder;
import com.betteryanwo.service.CartOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by 六
 * Date:18-6-27
 */
@Service
public class CartOrderServiceImpl implements CartOrderService {
    @Autowired
    CartOrderDao cartOrderDao;

    @Override
    public int insert(CartOrder cartOrder) {
        return cartOrderDao.insert(cartOrder);
    }
}
