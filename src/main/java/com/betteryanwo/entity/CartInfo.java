package com.betteryanwo.entity;

import java.math.BigDecimal;

/**
 * Create by 六
 * Date:18-5-31
 * 购物项
 */
public class CartInfo {
    private Long id; //购物项ID
    private Integer itemNum;//购物项数量
    private Long cartId;//购物车ID
    private Goods goods;//商品
    private BigDecimal price;//价格
    public CartInfo() {
    }

    public CartInfo(Long id, Integer itemNum, Long cartId, Goods goods, BigDecimal price) {
        this.id = id;
        this.itemNum = itemNum;
        this.cartId = cartId;
        this.goods = goods;
        this.price = price;
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

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CartInfo{" +
                "id=" + id +
                ", itemNum=" + itemNum +
                ", cartId=" + cartId +
                ", goods=" + goods +
                ", price=" + price +
                '}';
    }
}
