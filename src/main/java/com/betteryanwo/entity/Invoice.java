package com.betteryanwo.entity;

/**
 * Create by 六
 * Date:18-6-7
 * 发票表，与订单一对一关联
 */
public class Invoice {
    private Long id;            //发票信息ID
    private Long userId;        //用户ID
    private String orderId;     //订单ID
    private String orgName;     //公司名称
    private String taxId;       //纳税人识别号
    private String regAddress;  //公司注册地址
    private String regMobile;   //公司注册电话
    private String bank;        //公司注册银行
    private String bankAccount; //公司注册银行账号
    private String userContacts;//收票人
    private String userMobile;  //收票人手机

    public Invoice() {
    }

    public Invoice(Long id, Long userId, String orderId, String orgName, String taxId, String regAddress, String regMobile, String bank, String bankAccount, String userContacts, String userMobile) {
        this.id = id;
        this.userId = userId;
        this.orderId = orderId;
        this.orgName = orgName;
        this.taxId = taxId;
        this.regAddress = regAddress;
        this.regMobile = regMobile;
        this.bank = bank;
        this.bankAccount = bankAccount;
        this.userContacts = userContacts;
        this.userMobile = userMobile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getRegAddress() {
        return regAddress;
    }

    public void setRegAddress(String regAddress) {
        this.regAddress = regAddress;
    }

    public String getRegMobile() {
        return regMobile;
    }

    public void setRegMobile(String regMobile) {
        this.regMobile = regMobile;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getUserContacts() {
        return userContacts;
    }

    public void setUserContacts(String userContacts) {
        this.userContacts = userContacts;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", userId=" + userId +
                ", orderId='" + orderId + '\'' +
                ", orgName='" + orgName + '\'' +
                ", taxId='" + taxId + '\'' +
                ", regAddress='" + regAddress + '\'' +
                ", regMobile='" + regMobile + '\'' +
                ", bank='" + bank + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", userContacts='" + userContacts + '\'' +
                ", userMobile='" + userMobile + '\'' +
                '}';
    }
}
