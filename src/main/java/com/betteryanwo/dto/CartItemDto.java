package com.betteryanwo.dto;

import java.math.BigDecimal;

/**
 * Create by 六
 * Date:18-6-19
 */
public class CartItemDto {
    private Integer CId;
    private Integer SNum;
    private BigDecimal Sprice;
    private Long id;
    private Integer itemNum;
    private Long cartId;
    private Long goodsId;
    private BigDecimal price;
    private Float GPrice;
    private String GoodsName;
    private String GImage;
    public CartItemDto() {
    }

    public CartItemDto(Integer CId, Integer SNum, BigDecimal sprice, Long id, Integer itemNum, Long cartId, Long goodsId, BigDecimal price, Float GPrice, String goodsName, String GImage) {
        this.CId = CId;
        this.SNum = SNum;
        Sprice = sprice;
        this.id = id;
        this.itemNum = itemNum;
        this.cartId = cartId;
        this.goodsId = goodsId;
        this.price = price;
        this.GPrice = GPrice;
        GoodsName = goodsName;
        this.GImage = GImage;
    }

    public Integer getCId() {
        return CId;
    }

    public void setCId(Integer CId) {
        this.CId = CId;
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

    public String getGImage() {
        return GImage;
    }

    public void setGImage(String GImage) {
        this.GImage = GImage;
    }

    @Override
    public String toString() {
        return "CartItemDto{" +
                "CId=" + CId +
                ", SNum=" + SNum +
                ", Sprice=" + Sprice +
                ", id=" + id +
                ", itemNum=" + itemNum +
                ", cartId=" + cartId +
                ", goodsId=" + goodsId +
                ", price=" + price +
                ", GPrice=" + GPrice +
                ", GoodsName='" + GoodsName + '\'' +
                ", GImage='" + GImage + '\'' +
                '}';
    }
}
