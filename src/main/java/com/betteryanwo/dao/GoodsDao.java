package com.betteryanwo.dao;

import com.betteryanwo.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Create by 六
 * Date:18-5-29
 */
public interface GoodsDao {
    /**
     * 显示商品所有。
     * @return
     */
    List<Goods> listGoods();

    /**
     * 根据商品类别和商品名称进行查询
     * @param type  商品类别
     * @param name  商品名称
     * @return
     */
    List<Goods> listGoodsByTypeAndName(@Param("type") String type,
                                       @Param("name") String name);


    /**
     * 查询商品的库存
     * @param goodsId 商品id
     * @return
     */
    int CountGoods(@Param("goodsId") Long goodsId);

    /**
     * 减少库存
     * @param goodsId 商品ID
     * @param num 减少的数
     * @return
     */
    int UpdateCountGoods(@Param("goodsId") Long goodsId, @Param("num") Integer num);

    /**
     * 根据id得到商品信息
     * @param id 商品id
     * @return
     */
    Goods getGoodsById(@Param("id") Long id);

    /**
     * Created by mamengna on 2018/6/19 16:01
     * Description：根据商品类别查询商品
     */
    List<Goods> listGoodsByType();

    List<Goods> listGoodsByType1();
}
