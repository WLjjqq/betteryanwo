package com.betteryanwo.controller;

import com.betteryanwo.dto.Result;
import com.betteryanwo.entity.Cart;
import com.betteryanwo.entity.CartItem;
import com.betteryanwo.entity.Goods;
import com.betteryanwo.service.CartItemService;
import com.betteryanwo.service.GoodsService;
import com.betteryanwo.service.ShopCartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


/**
 * Create by 六
 * Date:18-6-4
 */
@Controller
@RequestMapping(value = "/shopcart")
public class ShopCartController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ShopCartService shopCartService;

    @Autowired
    CartItemService cartItemService;
    @Autowired
    GoodsService goodsService;

    /**
     * 修改购物车的数量。
     * @param cartInftoId  购物车详表ID
     * @param number 数量
     * @return
     */
    @RequestMapping(value = "/updateShopCart", method = RequestMethod.GET)
    @ResponseBody
    public Result updateShopCartNumber(@RequestParam("cartInfoId") Long cartInftoId,
                                       @RequestParam("number") Integer number) {
        Result result = new Result();
        try {
            CartItem cartItem = new CartItem();
            cartItem.setItemNum(number);
            cartItem.setId(cartInftoId);
            cartItemService.update(cartItem);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setMsg("网络错误，请重试");
            result.setSuccess(false);
            return result;
        }
    }

    /**
     * 删除购物车项信息。
     * @param infoId 购物车详表ID
     * @return
     */
    @RequestMapping(value ="/deleteShopCartInfo",method = RequestMethod.GET)
    @ResponseBody
    public Result deleteCartInfo(@RequestParam("infoId") Long infoId){
        try {
            cartItemService.delete(infoId);
            return new Result(true,"删除成功",null);
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"网络错误，请重试",null);
        }
    }

    /**
     * 删除整个购物车的购物项
     * @param cartId 购物车ID
     * @return
     */
    @RequestMapping(value ="/deleteShopCart",method = RequestMethod.GET)
    @ResponseBody
    public Result deleteCart(@RequestParam("cartId") Long cartId){
        try {
            cartItemService.deleteByCartId(cartId);
            shopCartService.delete(cartId);
            return new Result(true,"删除成功",null);
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"网络错误，请重试",null);
        }
    }

    /**
     * 添加购物车
     * @param goodsId 商品ID
     * @param userId 用户ID
     * @param number 修改的数量
     * @return
     */
    @RequestMapping(value = "/insertCart",method = RequestMethod.GET)
    @ResponseBody
    public Result insertShopCart(@RequestParam("goodsId") Long goodsId,
                                 @RequestParam("userId") Long userId,
                                 @RequestParam("number") Integer number){
        Result result = new Result();
        //查看库存
        int countGoods = goodsService.CountGoods(goodsId);
        if(countGoods<number){
            return new Result(false,"抱歉，库存不足");
        }
        try {
            //查看这个用户有购物车没有
            Cart cart = shopCartService.getByUserId(userId);
            if(cart == null){
                Cart cart1 = new Cart();
                Goods goods = goodsService.getGoodsById(goodsId);
                cart1.setUserId(userId);
                cart1.setPrice(new BigDecimal(goods.getGPrice()*number));
                shopCartService.insert(cart1);
                CartItem cartItem = new CartItem();
                cartItem.setCartId(cart1.getId());
                cartItem.setItemNum(number);
                cartItem.setGoods(goods);
                cartItem.setPrice(new BigDecimal(goods.getGPrice()*number));
                cartItemService.insert(cartItem);
            }else{
                CartItem cartItem = new CartItem();
                Goods goods = goodsService.getGoodsById(goodsId);
                boolean b = cartItemService.cartInfoHasGoods(goodsId, cart.getId());
                if(b){
                    cartItem.setGoods(goods);
                    cartItem.setItemNum(number);
                    cartItem.setCartId(cart.getId());
                    cartItem.setPrice(new BigDecimal(goods.getGPrice()* number));
                    cartItemService.insert(cartItem);
                }
                List<Map<String, Object>> mapList = cartItemService.getNumAndPrice(goodsId, cart.getId());
                for(Map map:mapList) {
                    Integer itemNum = (Integer) map.get("itemNum");
                    Long id = (Long) map.get("id");
                    cartItem.setItemNum(itemNum + number);
                    cartItem.setId(id);
                    cartItem.setPrice(new BigDecimal((itemNum + number) * goods.getGPrice()));
                    cartItemService.update(cartItem);
                }
            }
            result.setSuccess(true);
            result.setMsg("保存成功");
            return result;
        }catch (Exception e){
            e.printStackTrace();
            result.setMsg("网络错误，请重试");
            result.setSuccess(false);
            return result;
        }
    }

}
