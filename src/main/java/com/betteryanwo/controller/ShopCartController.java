package com.betteryanwo.controller;

import com.betteryanwo.dto.Result;
import com.betteryanwo.entity.Cart;
import com.betteryanwo.entity.CartItem;
import com.betteryanwo.entity.Goods;
import com.betteryanwo.exception.OrderException;
import com.betteryanwo.service.CartItemService;
import com.betteryanwo.service.GoodsService;
import com.betteryanwo.service.ShopCartService;
import com.betteryanwo.util.OrderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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

        try {
            //查看这个用户有购物车没有
            Cart cart = getCart(userId);
            if(cart == null) {
                Cart cart1 = new Cart();
            }
            shopCartService.insert(userId,cart,goodsId,number);
            return new Result<>(true, cart, "添加成功");
        }catch (OrderException oe){
                return new Result(false, oe.getMessage());
        } catch (Exception e){
            e.printStackTrace();
            result.setMsg("网络错误，请重试");
            result.setSuccess(false);
            return result;
        }
    }

    /**
     * 获取购物车
     * @return 购物车
     */
    private Cart getCart(Long userId) {
            Cart cart = shopCartService.getByUserId(userId);
            return cart;
    }
}
