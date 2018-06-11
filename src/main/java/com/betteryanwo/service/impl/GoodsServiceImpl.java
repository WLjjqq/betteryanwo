package com.betteryanwo.service.impl;

import com.betteryanwo.dao.GoodsDao;
import com.betteryanwo.entity.Goods;
import com.betteryanwo.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    GoodsDao goodsDao;

    /**
     * 分页查询所有

     * @return
     */
    @Override
    public List<Goods> listGoods() {
        List<Goods> goods = goodsDao.listGoods();
        return goods;
    }

    /**
     * 根据商品类别和商品名称查询商品
     * @param type  商品类别
     * @param name  商品名称
     * @return
     */
    @Override
    public List<Goods> listGoodsByTypeAndName(String type, String name) {
        List<Goods> goods = goodsDao.listGoodsByTypeAndName(type, name);
        return goods;
    }

    /**
     * 对商品库存进行统计
     * @param goodsId 商品名称
     * @return
     */
    @Override
    public int CountGoods(Long goodsId) {
        int countGoods = goodsDao.CountGoods(goodsId);
        return countGoods;
    }

    /**
     * 减少库存
     * @param goodsId  商品ID
     * @param num 减少的数量
     * @return
     */
    @Override
    public int UpdateCountGoods(Long goodsId, Integer num) {
        int countGoods = goodsDao.UpdateCountGoods(goodsId, num);
        return countGoods;
    }

    @Override
    public Goods getGoodsById(Long goodsId) {
        return goodsDao.getGoodsById(goodsId);
    }
}
