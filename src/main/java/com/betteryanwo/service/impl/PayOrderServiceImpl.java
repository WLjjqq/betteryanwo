package com.betteryanwo.service.impl;

import com.betteryanwo.dao.PayOrderDao;
import com.betteryanwo.entity.PayOrder;
import com.betteryanwo.service.PayOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by 六
 * Date:18-6-6
 */
@Service
public class PayOrderServiceImpl implements PayOrderService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PayOrderDao payOrderDao;

    @Override
    public int insertPayOrder(PayOrder payOrder) {
        return payOrderDao.insertPayOrder(payOrder);
    }

    @Override
    public int updatePayOrderStatus(Integer payId, Integer newStatus, Integer oldStatus) {
        return payOrderDao.updatePayStatus(payId,newStatus,oldStatus);
    }
}
