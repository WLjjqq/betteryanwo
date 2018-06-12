package com.betteryanwo.dao;


import com.betteryanwo.entity.PayOrder;
import org.apache.ibatis.annotations.Param;

public interface PayOrderDao {
	/**
	 * 添加支付确认
	 * @param payOrder
	 * @return
	 */
	int insertPayOrder(PayOrder payOrder);

	/**
	 * 更新订单
	 * @param payOrder
	 * @return
	 */
	int update(PayOrder payOrder);

}
