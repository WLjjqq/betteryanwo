package com.betteryanwo.entity;

import java.sql.Timestamp;

/**
 * Create by 六
 * Date:18-5-29
 */
public class Goods {
    private Long GoodsId;           //商品ID
    private String GoodsName;       //商品名称
    private Float GPrice;           //商品价格
    private Long GTypeID;           //商品类别
    private String GIntro;          //商品描述
    private String GImage;          //商品图片路径
    private Long GCount;            //商品库存
    private Long GSail;             //商品销量
    private Long GWeight;           //商品重量
    private Timestamp GDateTime;    //上架时间
    private String GSize;           //商品规格
    private Integer IsHot;          //是否热销
    private Integer IsReconnend;    //是否推荐

    public Goods() {
    }

    public Goods(Long goodsId, String goodsName, Float GPrice, Long GTypeID, String GIntro, String GImage, Long GCount, Long GSail, Long GWeight, Timestamp GDateTime, String GSize, Integer isHot, Integer isReconnend) {
        GoodsId = goodsId;
        GoodsName = goodsName;
        this.GPrice = GPrice;
        this.GTypeID = GTypeID;
        this.GIntro = GIntro;
        this.GImage = GImage;
        this.GCount = GCount;
        this.GSail = GSail;
        this.GWeight = GWeight;
        this.GDateTime = GDateTime;
        this.GSize = GSize;
        IsHot = isHot;
        IsReconnend = isReconnend;
    }

    public Long getGoodsId() {
        return GoodsId;
    }

    public void setGoodsId(Long goodsId) {
        GoodsId = goodsId;
    }

    public String getGoodsName() {
        return GoodsName;
    }

    public void setGoodsName(String goodsName) {
        GoodsName = goodsName;
    }

    public Float getGPrice() {
        return GPrice;
    }

    public void setGPrice(Float GPrice) {
        this.GPrice = GPrice;
    }

    public Long getGTypeID() {
        return GTypeID;
    }

    public void setGTypeID(Long GTypeID) {
        this.GTypeID = GTypeID;
    }

    public String getGIntro() {
        return GIntro;
    }

    public void setGIntro(String GIntro) {
        this.GIntro = GIntro;
    }

    public String getGImage() {
        return GImage;
    }

    public void setGImage(String GImage) {
        this.GImage = GImage;
    }

    public Long getGCount() {
        return GCount;
    }

    public void setGCount(Long GCount) {
        this.GCount = GCount;
    }

    public Long getGSail() {
        return GSail;
    }

    public void setGSail(Long GSail) {
        this.GSail = GSail;
    }

    public Long getGWeight() {
        return GWeight;
    }

    public void setGWeight(Long GWeight) {
        this.GWeight = GWeight;
    }

    public Timestamp getGDateTime() {
        return GDateTime;
    }

    public void setGDateTime(Timestamp GDateTime) {
        this.GDateTime = GDateTime;
    }

    public String getGSize() {
        return GSize;
    }

    public void setGSize(String GSize) {
        this.GSize = GSize;
    }

    public Integer getIsHot() {
        return IsHot;
    }

    public void setIsHot(Integer isHot) {
        IsHot = isHot;
    }

    public Integer getIsReconnend() {
        return IsReconnend;
    }

    public void setIsReconnend(Integer isReconnend) {
        IsReconnend = isReconnend;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "GoodsId=" + GoodsId +
                ", GoodsName='" + GoodsName + '\'' +
                ", GPrice=" + GPrice +
                ", GTypeID=" + GTypeID +
                ", GIntro='" + GIntro + '\'' +
                ", GImage='" + GImage + '\'' +
                ", GCount=" + GCount +
                ", GSail=" + GSail +
                ", GWeight=" + GWeight +
                ", GDateTime=" + GDateTime +
                ", GSize='" + GSize + '\'' +
                ", IsHot=" + IsHot +
                ", IsReconnend=" + IsReconnend +
                '}';
    }
}
