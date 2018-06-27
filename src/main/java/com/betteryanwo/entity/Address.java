package com.betteryanwo.entity;

/**
 * Create by 六
 * Date:18-5-29
 */
public class Address {
    private Long AddressId;         //会员等级Id

    private Long UserID;            //客户Id

    private String Country;         //国家

    private String Province;        //省份

    private String City;            //市

    private String County;          //区/县

    private String Site;         //详细地址

    private String Consignee;       //收货人

    private String ConsigneeTel;    //收货人电话

    public Address() {
    }

    public Address(Long addressId, Long userID, String country, String province, String city, String county, String site, String consignee, String consigneeTel) {
        AddressId = addressId;
        UserID = userID;
        Country = country;
        Province = province;
        City = city;
        County = county;
        Site = site;
        Consignee = consignee;
        ConsigneeTel = consigneeTel;
    }

    public Long getAddressId() {
        return AddressId;
    }

    public void setAddressId(Long addressId) {
        AddressId = addressId;
    }

    public Long getUserID() {
        return UserID;
    }

    public void setUserID(Long userID) {
        UserID = userID;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCounty() {
        return County;
    }

    public void setCounty(String county) {
        County = county;
    }

    public String getSite() {
        return Site;
    }

    public void setSite(String site) {
        Site = site;
    }

    public String getConsignee() {
        return Consignee;
    }

    public void setConsignee(String consignee) {
        Consignee = consignee;
    }

    public String getConsigneeTel() {
        return ConsigneeTel;
    }

    public void setConsigneeTel(String consigneeTel) {
        ConsigneeTel = consigneeTel;
    }

    @Override
    public String toString() {
        return "Address{" +
                "AddressId=" + AddressId +
                ", UserID=" + UserID +
                ", Country='" + Country + '\'' +
                ", Province='" + Province + '\'' +
                ", City='" + City + '\'' +
                ", County='" + County + '\'' +
                ", Site='" + Site + '\'' +
                ", Consignee='" + Consignee + '\'' +
                ", ConsigneeTel='" + ConsigneeTel + '\'' +
                '}';
    }
}
