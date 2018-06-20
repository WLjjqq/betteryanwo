package com.betteryanwo.controller;

import com.betteryanwo.dto.CartItemDto;
import com.betteryanwo.dto.Result;
import com.betteryanwo.entity.Cart;
import com.betteryanwo.entity.CartItem;
import com.betteryanwo.exception.OrderException;
import com.betteryanwo.service.CartItemService;
import com.betteryanwo.service.GoodsService;
import com.betteryanwo.service.ShopCartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Create by 六
 * Date:18-6-4
 */
@Controller
@RequestMapping(value = "/cart")
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
     * @param itemId 购物车详表ID
     * @return
     */
    @RequestMapping(value ="/deleteCartItem/{itemId}",method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteCartInfo(@PathVariable("itemId") Long itemId){
        try {
            cartItemService.delete(itemId);
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
    @RequestMapping(value ="/deleteShopCart/{cartId}",method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteCart(@PathVariable("cartId") Long cartId){
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
            Cart cart = shopCartService.getByUserId(userId);
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
    @RequestMapping(value = "/getCart",method = RequestMethod.GET)
    @ResponseBody
    private Result getCart(@RequestParam("userId") Long userId) {
            try {
                Cart cart = shopCartService.getByUserId(userId);
                List<CartItemDto> cartItems = cartItemService.getAllByCartId2(cart.getId());
                if(null == cart){
                    Cart cart1 = new Cart();
                    cart1.setUserId(userId);
                }

                return new Result(true,cartItems,"返回成功");
            }catch (Exception e){
                e.printStackTrace();
                return new Result(true,"返回失败");
            }

    }
}
