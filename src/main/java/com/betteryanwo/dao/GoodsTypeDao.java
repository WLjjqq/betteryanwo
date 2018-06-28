package com.betteryanwo.dao;

import com.betteryanwo.entity.GoodsType;

import java.util.List;

/**
 * Create by 六
 * Date:18-5-30
 */
public interface GoodsTypeDao {
    /**
     * 查询商品类型所有
     * @return
     */
    List<GoodsType> listGoodsType();
}
