package com.betteryanwo.controller;

import com.betteryanwo.dto.Result;
import com.betteryanwo.entity.Cart;
import com.betteryanwo.entity.CartOrder;
import com.betteryanwo.entity.Goods;
import com.betteryanwo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by 六
 * Date:18-6-27
 */
@Controller
@RequestMapping(value = "/cartOrder")
public class CartOrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    ShopCartService shopCartService;
    @Autowired
    CartItemService cartItemService;
    @Autowired
    CartOrderService cartOrderService;

    @RequestMapping(value = "/insert/{userId}/{ids}/{num}/{price}",method = RequestMethod.POST)
    @ResponseBody
    public Result insertOrder(@PathVariable("userId") Long userId,
                              @PathVariable("ids") String ids,
                              @PathVariable("num") String num,
                              @PathVariable("price") String price){
        try {
            if (ids.contains("-")) {
                List<Long> del_ids = new ArrayList<>();//存放商品id
                String[] sp_ids = ids.split("-");
                for (String string : sp_ids) {
                    del_ids.add(Long.parseLong(string));
                }
                List<Integer> item_num = new ArrayList<>();//存放数量
                String[] sp_num = num.split("-");
                for (String goods_num : sp_num) {
                    item_num.add(Integer.parseInt(goods_num));
                }
                List<Integer> goods_prices = new ArrayList<>();//存放价格
                String[] sp_price = price.split("-");
                Integer price_a = 0;
                for (String goods_price : sp_price) {
                    goods_prices.add(Integer.parseInt(goods_price));
                    price_a = Integer.parseInt(goods_price) + price_a;
                }

                Cart cart = shopCartService.getByUserId(userId);
                cart.setPrice(new BigDecimal(price_a));
                shopCartService.update(cart);

                CartOrder[] cartOrder=new CartOrder[item_num.size()];
                for (int i = 0; i < goods_prices.size(); i++) {

                    Goods goods = new Goods();
                    goods.setGoodsId(del_ids.get(i));//商品ID
                    cartOrder[i]=new CartOrder();
                    cartOrder[i].setGoodsNum(item_num.get(i));//商品数量
                    cartOrder[i].setGoods(goods);
                    cartOrder[i].setCountPrice(new BigDecimal(goods_prices.get(i)));
                    cartOrderService.insert(cartOrder[i]);
                }
            }
            //orderService.insert(userId,OrderUtil.getOrderId(),0);
            return new Result(true,"保存成功",null);
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"网络错误，请重试",null);
        }
    }
}
