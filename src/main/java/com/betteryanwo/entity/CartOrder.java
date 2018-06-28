package com.betteryanwo.entity;

import java.math.BigDecimal;

/**
 * Create by 六
 * Date:18-6-27
 * 购物车订单表
 */
public class CartOrder {
    private Long id; //购物车订单ID
    private Integer goodsNum;//商品数量
    private Goods goods;//商品
    private BigDecimal countPrice;//总价格

    public CartOrder() {
    }

    public CartOrder(Long id, Integer goodsNum, Goods goods, BigDecimal countPrice) {
        this.id = id;
        this.goodsNum = goodsNum;
        this.goods = goods;
        this.countPrice = countPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public BigDecimal getCountPrice() {
        return countPrice;
    }

    public void setCountPrice(BigDecimal countPrice) {
        this.countPrice = countPrice;
    }

    @Override
    public String toString() {
        return "CartOrder{" +
                "id=" + id +
                ", goodsNum=" + goodsNum +
                ", goods=" + goods +
                ", countPrice=" + countPrice +
                '}';
    }
}
