package com.betteryanwo.entity;

import java.math.BigDecimal;

/**
 * Create by 六
 * Date:18-6-7
 * 订单项 一个商品生成一个订单项
 */
public class OrderItem {
    private Long id;            //订单项ID
    private Integer itemNum;    //购买数量
    private Long orderId;       //关联orders表id
    private BigDecimal price;   //订单项价格
    private Goods goods;        //商品

    public OrderItem() {
    }

    public OrderItem(Long id, Integer itemNum, Long orderId, BigDecimal price, Goods goods) {
        this.id = id;
        this.itemNum = itemNum;
        this.orderId = orderId;
        this.price = price;
        this.goods = goods;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getItemNum() {
        return itemNum;
    }

    public void setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", itemNum=" + itemNum +
                ", orderId=" + orderId +
                ", price=" + price +
                ", goods=" + goods +
                '}';
    }
}
