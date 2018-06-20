package com.betteryanwo.dto;

import java.math.BigDecimal;

/**
 * Create by 六
 * Date:18-6-19
 */
public class CartItemDto {
    private Integer SNum;
    private BigDecimal Sprice;
    private Long id;
    private Integer itemNum;
    private Long cartId;
    private Long goodsId;
    private BigDecimal price;
    private Float GPrice;
    private String GoodsName;

    public CartItemDto() {
    }

    public CartItemDto(Integer SNum, BigDecimal sprice, Long id, Integer itemNum, Long cartId, Long goodsId, BigDecimal price, Float GPrice, String goodsName) {
        this.SNum = SNum;
        Sprice = sprice;
        this.id = id;
        this.itemNum = itemNum;
        this.cartId = cartId;
        this.goodsId = goodsId;
        this.price = price;
        this.GPrice = GPrice;
        GoodsName = goodsName;
    }

    public Integer getSNum() {
        return SNum;
    }

    public void setSNum(Integer SNum) {
        this.SNum = SNum;
    }

    public BigDecimal getSprice() {
        return Sprice;
    }

    public void setSprice(BigDecimal sprice) {
        Sprice = sprice;
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

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Float getGPrice() {
        return GPrice;
    }

    public void setGPrice(Float GPrice) {
        this.GPrice = GPrice;
    }

    public String getGoodsName() {
        return GoodsName;
    }

    public void setGoodsName(String goodsName) {
        GoodsName = goodsName;
    }

    @Override
    public String toString() {
        return "CartItemDto{" +
                "SNum=" + SNum +
                ", Sprice=" + Sprice +
                ", id=" + id +
                ", itemNum=" + itemNum +
                ", cartId=" + cartId +
                ", goodsId=" + goodsId +
                ", price=" + price +
                ", GPrice=" + GPrice +
                ", GoodsName='" + GoodsName + '\'' +
                '}';
    }
}
