package com.betteryanwo.service;

import com.betteryanwo.entity.Goods;

import java.util.List;

/**
 * Create by 六
 * Date:18-5-30
 */
public interface GoodsService {
    /**
     * 查询所有的商品
     * @return
     */
    List<Goods> listGoods();

    /**
     * 根据商品类别和商品名称进行查询
     * @param type  商品类别
     * @param name  商品名称
     * @return
     */
    List<Goods> listGoodsByTypeAndName(String type,
                                       String name);



    /**
     * 查询商品的库存
     * @param goodsId 商品ID
     * @return
     */
    int CountGoods(Long goodsId);

    /**
     * 减少库存
     * @param goodsId  商品ID
     * @param num 减少的数量
     * @return
     */
    int UpdateCountGoods(Long goodsId, Integer num);

    /**
     * 根据商品ID得到商品的信息
     * @param goodsId 商品ID
     * @return
     */
    Goods getGoodsById(Long goodsId);
}
