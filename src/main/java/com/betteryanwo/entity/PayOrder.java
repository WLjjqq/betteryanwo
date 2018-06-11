package com.betteryanwo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PayOrder {

	private Integer id;				//支付ID
	private Long userId;			//用户ID
	private String amount;			//总金额
	private Integer status;			//0-未支付 1-支付成功 2-支付失败 3-失效
	private String bank;			//收款银行
	private String bankId;			//银行ID
	private Date createTime;		//创建时间
	private Date modifyTime;		//修改时间
	private String detailMsg;		//订单备注
	private String paymentMethod; 	//支付方式

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getDetailMsg() {
		return detailMsg;
	}

	public void setDetailMsg(String detailMsg) {
		this.detailMsg = detailMsg;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public PayOrder() {
	}

	public PayOrder(Integer id, Long userId, String amount, Integer status, String bank, String bankId, Date createTime, Date modifyTime, String detailMsg, String paymentMethod) {
		this.id = id;
		this.userId = userId;
		this.amount = amount;
		this.status = status;
		this.bank = bank;
		this.bankId = bankId;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.detailMsg = detailMsg;
		this.paymentMethod = paymentMethod;
	}

	@Override
	public String toString() {
		return "PayOrder{" +
				"id=" + id +
				", userId=" + userId +
				", amount='" + amount + '\'' +
				", status=" + status +
				", bank='" + bank + '\'' +
				", bankId='" + bankId + '\'' +
				", createTime=" + createTime +
				", modifyTime=" + modifyTime +
				", detailMsg='" + detailMsg + '\'' +
				", paymentMethod='" + paymentMethod + '\'' +
				'}';
	}
}
