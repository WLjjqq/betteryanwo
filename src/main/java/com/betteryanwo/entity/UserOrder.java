package com.betteryanwo.entity;

import java.math.BigDecimal;

/**
 * @author :MaMengna
 * @Date :Create in 14:38 2018/6/23
 */
public class UserOrder {
    private Long id;
    private Long orderSerial;
    private String GoodsName;
    private String GImage;
    private Float GPrice;
    private Integer itemNum;
    private BigDecimal price;
    private Integer status;
    private Integer shoppingStatus;
    private Long userId;

    public void setOrderSerial(Long orderSerial) {
        this.orderSerial = orderSerial;
    }

    public void setGoodsName(String goodsName) {
        GoodsName = goodsName;
    }

    public void setGImage(String GImage) {
        this.GImage = GImage;
    }

    public void setGPrice(Float GPrice) {
        this.GPrice = GPrice;
    }

    public void setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setShoppingStatus(Integer shoppingStatus) {
        this.shoppingStatus = shoppingStatus;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOrderSerial() {
        return orderSerial;
    }

    public String getGoodsName() {
        return GoodsName;
    }

    public String getGImage() {
        return GImage;
    }

    public Float getGPrice() {
        return GPrice;
    }

    public Integer getItemNum() {
        return itemNum;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getStatus() {
        return status;
    }

    public Integer getShoppingStatus() {
        return shoppingStatus;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserOrder(Long orderSerial, String goodsName, String GImage, Float GPrice, Integer itemNum, BigDecimal price, Integer status, Integer shoppingStatus, Long userId, Long id) {
        this.orderSerial = orderSerial;
        GoodsName = goodsName;
        this.GImage = GImage;
        this.GPrice = GPrice;
        this.itemNum = itemNum;
        this.price = price;
        this.status = status;
        this.shoppingStatus = shoppingStatus;
        this.userId = userId;
        this.id = id;
    }

    public UserOrder() {
    }

    @Override
    public String toString() {
        return "UserOrder{" +
                "orderSerial=" + orderSerial +
                ", GoodsName='" + GoodsName + '\'' +
                ", GImage='" + GImage + '\'' +
                ", GPrice=" + GPrice +
                ", itemNum=" + itemNum +
                ", price=" + price +
                ", status=" + status +
                ", shoppingStatus=" + shoppingStatus +
                ", userId=" + userId +
                ",id=" + id +
                '}';
    }
}
