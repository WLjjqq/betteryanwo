package com.betteryanwo.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Create by 六
 * Date:18-6-7
 * 订单表  一个订单表对应多个订单项
 */
public class Order {
    private Long id;        //id
    private String orderSerial; //订单号
    private BigDecimal price;   //总价钱
    private Long userId;        //所属用户
    private Integer status;     //订单状态，0:用户未确认，1:付款中，2:已支付，3:已取消，4:已完成
    private Date dateCreated;   //创建时间
    private Date dateUpdated;   //更新时间
    private String description; //备注
    private Integer isInvoice;  //是否需要发票
    private Invoice invoice;    //发票信息
    private Integer shoppingStatus; //发货状态，0:未发货，1:已发货
    private Integer paymentMethod;  //支付方式，0:在线支付，2:线下支付
    private List<OrderItem> orderItems;//订单项
    public Order() {
    }

    public Order(Long id, String orderSerial, BigDecimal price, Long userId, Integer status, Date dateCreated, Date dateUpdated, String description, Integer isInvoice, Invoice invoice, Integer shoppingStatus, Integer paymentMethod, List<OrderItem> orderItems) {
        this.id = id;
        this.orderSerial = orderSerial;
        this.price = price;
        this.userId = userId;
        this.status = status;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.description = description;
        this.isInvoice = isInvoice;
        this.invoice = invoice;
        this.shoppingStatus = shoppingStatus;
        this.paymentMethod = paymentMethod;
        this.orderItems = orderItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderSerial() {
        return orderSerial;
    }

    public void setOrderSerial(String orderSerial) {
        this.orderSerial = orderSerial;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Integer isInvoice) {
        this.isInvoice = isInvoice;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Integer getShoppingStatus() {
        return shoppingStatus;
    }

    public void setShoppingStatus(Integer shoppingStatus) {
        this.shoppingStatus = shoppingStatus;
    }

    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderSerial='" + orderSerial + '\'' +
                ", price=" + price +
                ", userId=" + userId +
                ", status=" + status +
                ", dateCreated=" + dateCreated +
                ", dateUpdated=" + dateUpdated +
                ", description='" + description + '\'' +
                ", isInvoice=" + isInvoice +
                ", invoice=" + invoice +
                ", shoppingStatus=" + shoppingStatus +
                ", paymentMethod=" + paymentMethod +
                ", orderItems=" + orderItems +
                '}';
    }
}
