package com.betteryanwo.entity;

/**
 * Create by 六
 * Date:18-5-29
 */
public class GoodsType {
    private Integer TypeId;     //商品ID
    private String TypeName;    //商品类别名称

    public GoodsType() {
    }

    public GoodsType(Integer typeId, String typeName) {
        TypeId = typeId;
        TypeName = typeName;
    }

    public Integer getTypeId() {
        return TypeId;
    }

    public void setTypeId(Integer typeId) {
        TypeId = typeId;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String typeName) {
        TypeName = typeName;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "TypeId=" + TypeId +
                ", TypeName='" + TypeName + '\'' +
                '}';
    }
}
