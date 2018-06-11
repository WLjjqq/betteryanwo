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
	 * 更新支付确认信息
	 * @param payId 支付表ID
	 * @param newStatus 新的支付状态码
	 * @param oldStatus 旧的支付状态码
	 * @return
	 */
	int updatePayStatus(@Param("payId") Integer payId, @Param("newStatus") Integer newStatus, @Param("oldStatus") Integer oldStatus);

}
