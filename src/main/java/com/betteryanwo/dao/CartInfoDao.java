package com.betteryanwo.dao;

import com.betteryanwo.entity.CartInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Create by 六
 * Date:18-6-8
 * 购物项
 */
public interface CartInfoDao {
    /**
     * 根据ID获取购物项
     * @param itemId 购物项ID
     * @param cartId 购物车ID
     * @return
     */
    CartInfo getById(@Param("itemId") Long itemId,
                     @Param("cartId") Long cartId);

    /**
     * 获取所有购物项
     * @return
     */
    List<CartInfo> getAll();

    /**
     * 根据购物项进行筛选
     * @param cartItem
     * @return
     */
    CartInfo getByCartItem(CartInfo cartItem);

    /**
     * 根据购物车ID获取购物项
     * @param cartId
     * @return
     */
    List<CartInfo> getAllByCartId(Long cartId);

    /**
     * 添加购物项
     * @param entity
     * @return
     */
    @Transactional
    int insert(CartInfo entity);

    /**
     * 更新购物项
     * @param entity
     * @return
     */
    @Transactional
    int update(CartInfo entity);

    /**
     *  根据ID删除购物项
     * @param id
     * @return
     */
    @Transactional
    int delete(@Param("id") Long id);

    /**
     * 清空购物项
     * @param cartId
     * @return
     */
    @Transactional
    int deleteByCartId(Long cartId);

    /**
     * 判断购物项中有没有这个商品
     * @param goodsId
     * @param cartId
     * @return
     */
    int selectCartInfoByGoodsIdAndCartId(@Param("goodsId") Long goodsId,
                                                              @Param("cartId") Long cartId);

    List<Map<String,Object>> getNumAndPrice(@Param("goodsId") Long goodsId,
                                            @Param("cartId") Long cartId);

}
