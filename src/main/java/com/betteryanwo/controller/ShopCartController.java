package com.betteryanwo.controller;

import com.betteryanwo.dto.CartItemDto;
import com.betteryanwo.dto.Result;
import com.betteryanwo.entity.Cart;
import com.betteryanwo.entity.CartItem;
import com.betteryanwo.entity.Users;
import com.betteryanwo.exception.OrderException;
import com.betteryanwo.service.CartItemService;
import com.betteryanwo.service.GoodsService;
import com.betteryanwo.service.ShopCartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
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
    @RequestMapping(value = "/updateShopCart", method = RequestMethod.PUT)
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
     * 批量删除购物项,删除一个。
     * @param ids 购物项ID
     * @return
     */
    @RequestMapping(value ="/deleteCart/{ids}",method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteCart(@PathVariable("ids") String ids){
        try {
            if(ids.contains("-")){
                List<Long> del_ids = new ArrayList<>();
                String[] sp_ids = ids.split("-");
                for(String string:sp_ids){
                    del_ids.add(Long.parseLong(string));
                    cartItemService.deleteBatch(del_ids);
                }
            }else {
                long id = Long.parseLong(ids);
                cartItemService.delete(id);
            }

            return new Result(true,"删除成功",null);
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"网络错误，请重试",null);
        }
    }

    /**
     * 添加购物车
     * @param goodsId 商品ID
     * @param session 用户ID
     * @param number 修改的数量
     * @return
     */
    @RequestMapping(value = "/insertCart",method = RequestMethod.GET)
    @ResponseBody
    public Result insertShopCart(@RequestParam("goodsId") Long goodsId,
                                 HttpSession session,
                                 @RequestParam("number") Integer number){
        Result result = new Result();
        Users user = (Users)session.getAttribute("user");
        try {
            //查看这个用户有购物车没有
            Cart cart = shopCartService.getByUserId(user.getUserId());
            if(null == cart) {
                 cart = new Cart();
                 cart.setUserId(user.getUserId());
            }
            shopCartService.insert(user.getUserId(),cart,goodsId,number);
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
    private Result getCart(HttpSession  session) {
            try {
                Users user = (Users)session.getAttribute("user");
                if(null==user){
                    return new Result(false,1,"请先进行登陆！");
                }
                Cart cart = shopCartService.getByUserId(user.getUserId());
                if(null == cart){
                     cart = new Cart();
                    cart.setUserId(user.getUserId());
                }
                List<CartItemDto> cartItems = cartItemService.getAllByCartId2(cart.getId());
                if(  null!=cartItems && !cartItems.isEmpty() && cartItems.size()!=0 ){
                    return new Result(true,cartItems,"返回成功");
                }
                return new Result(false,2,"购物车为空");
            }catch (Exception e){
                e.printStackTrace();
                return new Result(false,"返回失败");
            }

    }
}
