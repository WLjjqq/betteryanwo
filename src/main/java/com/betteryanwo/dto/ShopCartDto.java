package com.betteryanwo.dto;

/**
 * Create by 六
 * Date:18-6-1
 */
public class ShopCartDto {
    private Integer id;                 //购物车附表id
    private String goods_name;          //商品名称
    private Float price;              //商品价格
    private String picture;             //商品图片路径
    private Integer Number;             //数量
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getGoods_name() {
        return goods_name;
    }
    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public Integer getNumber() {
        return Number;
    }
    public void setNumber(Integer number) {
        Number = number;
    }

    public ShopCartDto() {
    }

    public ShopCartDto(Integer id, String goods_name, Float price, String picture, Integer number) {
        this.id = id;
        this.goods_name = goods_name;
        this.price = price;
        this.picture = picture;
        Number = number;
    }

    @Override
    public String toString() {
        return "ShopCartDto{" +
                "id=" + id +
                ", goods_name='" + goods_name + '\'' +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                ", Number=" + Number +
                '}';
    }
}
