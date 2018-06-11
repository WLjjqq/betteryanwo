package com.betteryanwo.service;

import com.betteryanwo.entity.Cart;
import com.betteryanwo.entity.CartInfo;

import java.util.List;
import java.util.Map;

/**
 * Create by 六
 * Date:18-6-8
 */
public interface CartItemService {
    /**
     * 根据ID获取购物项
     * @param id
     * @return
     */
    CartInfo getById(Long id, Long cartId);

    /**
     * 根据购物车ID获取所有购物项
     * @param cartId
     * @return
     */
    List<CartInfo> getAllByCartId(Long cartId);

    /**
     * 根据购物项筛选
     * @param entity
     * @return
     */
    CartInfo getByCartItem(CartInfo entity);

    /**
     * 新增购物项
     * @param entity
     * @return
     */
    int insert(CartInfo entity);

    /**
     * 更新购物项
     * @param entity
     * @return
     */
    int update(CartInfo entity);

    /**
     * 根据ID删除购物项
     * @param id
     * @return
     */
    int delete(Long id);

    /**
     * 清空购物车中的购物项
     * @param cartId
     * @return
     */
    int deleteByCartId(Long cartId);

    /**
     * 添加购物项
     * @param item 购物项
     * @Author
     */
    List<CartInfo> addDistrict(Cart cart, CartInfo item);

    /**
     * 购物项中是否有这个商品
     * @param goodsId
     * @param cartId
     * @return
     */
    boolean cartInfoHasGoods(Long goodsId, Long cartId);

    /**
     * 修改用到的数量和价格
     * @param goodsId
     * @param cartId
     * @return
     */
    List<Map<String, Object>> getNumAndPrice(Long goodsId, Long cartId);
}
