package com.betteryanwo.controller;

import com.betteryanwo.dto.Result;
import com.betteryanwo.entity.*;
import com.betteryanwo.enums.OrderType;
import com.betteryanwo.exception.OrderException;
import com.betteryanwo.service.*;
import com.betteryanwo.util.OrderUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Create by 六
 * Date:18-6-8
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    OrderService orderService;
    @Autowired
    ShopCartService shopCartService;
    @Autowired
    CartItemService cartItemService;
    @Autowired
    OrderLogService orderLogService;
    @Autowired
    CartOrderService cartOrderService;


    /**
     * 根据订单号查询订单详情
     * @param request
     * @param session
     * @param model
     * @param orderSerial
     * @return
     */
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String orderInfo(HttpServletRequest request, HttpSession session, Model model,
                            @RequestParam(value = "orderSerial") String orderSerial){
            try{
                if(null==orderSerial || StringUtils.isEmpty(orderSerial)){
                    return "redirect:/info";
                }
                Order order = orderService.getOrderByOrderSerial(orderSerial);
                if(null == order){
                    return "redirect:/500";
                }
                String msg = (String) session.getAttribute("msg");

                if (!StringUtils.isEmpty(msg)) {
                    model.addAttribute("msg", msg);
                    session.removeAttribute("msg");
                }
                model.addAttribute("order", order);
                return "/info";
            }catch (Exception e){
                e.printStackTrace();
                model.addAttribute("msg", e.getMessage());
                return "500";
            }
    }

    /**
     * 订单取消
     * @param userId
     * @param orderSerial
     * @return
     */
    @RequestMapping(value = "/cancel",method = RequestMethod.GET)
    @ResponseBody
    public Result deleteOrder(HttpServletRequest request, HttpSession session, Model model,
                              @RequestParam("userId") Long userId,
                              @RequestParam("orderSerial") String orderSerial){
        try {
            model.addAttribute("content","dingdan");
            if(null ==orderSerial || orderSerial.isEmpty()){
                model.addAttribute("msg", "订单号不能为空");
                return new Result(false,"订单号不能为空");
            }
            Order order = orderService.getByUserIdAndOrderSerial(userId, orderSerial);
            if (null == order) {
                model.addAttribute("msg", "未找到该订单");
                return new Result(false,"未找到该订单");
            }
            if (3 == order.getStatus()) {
                session.setAttribute("msg", "订单已经取消,请勿重复提交");
                return new Result(false,"订单已经取消,请勿重复提交");
            }
            // 更新订单状态
            order.setStatus(3);
            order.setDateUpdated(new Date());
            orderService.updateOrder(order);
            orderLogService.insert(new OrderLog(new Date(), "用户", OrderType.CANCEL.getMessage(), order.getOrderSerial()));
            session.setAttribute("msg", "取消订单成功");
            return new Result(true,"取消订单成功");
        }catch (Exception e){
            e.printStackTrace();
            model.addAttribute("msg", e.getMessage());
            return new Result(false,null,"取消订单异常");
        }
    }
    /**
     * 订单提交
     * @param model
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String addOrder(HttpSession session, Model model){
        try{
            return "redirect:/order/confirm";
        }catch (Exception e){
            e.printStackTrace();
            model.addAttribute("msg", e.getMessage());
            return "500";
        }
    }

    /**
     * 订单确认
     * @param isInvoice
     * @param orderSerial
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/confirm", method = RequestMethod.GET)
    public Result confirmOrder(@RequestParam("isInvoice") Integer isInvoice,
                               String orderSerial,
                               @RequestParam("userId") Long userId) {
        try{
            Cart cart = shopCartService.getByUserId(userId);
            if(null==cart){
                return new Result(false,"购物车为空");
            }
            List<CartItem> cartItemList = cart.getCartItems();
            if (null != cartItemList && !cartItemList.isEmpty()) {
                // 查询订单是否已经存在,如果订单已存在则返回错误信息
                if (StringUtils.isEmpty(orderSerial)) {
                    // 实时添加订单号
                    orderSerial = OrderUtil.getOrderId();
                }
                //查询订单是否已经存在，如果订单已存在则返回错误信息
                if(StringUtils.isEmpty(orderSerial)){
                    Order order = orderService.getOrderByOrderSerial(orderSerial);
                    if(null !=order){
                        throw new OrderException("已经存在订单，订单生成错误");
                    }
                }
                //添加订单
                Order order = orderService.insert(userId, orderSerial, isInvoice);
                //清空购物车
                cart = shopCartService.getByUserId(userId);
                cartItemService.deleteByCartId(cart.getId());
                cart.setPrice(new BigDecimal(0));
                shopCartService.update(cart);
                return new Result(true, orderSerial, "添加成功");
            }else{
                return new Result(false, "购物车项为空");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return new Result(false, "订单添加异常");
    }

    /**
     * 从购物车发送过来的数据，修改购物车表的数据，把勾选的保存到购物车订单表中。
     * @param userId
     * @param ids
     * @param num
     * @return
     */
    @RequestMapping(value = "/uodateOrder/{userId}/{ids}/{num}/{price}",method = RequestMethod.POST)
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
                List<CartItem> cartItems = cartItemService.getAllByCartId(cart.getId());
                CartItem[] cartItem = new CartItem[cartItems.size()];

                for (int i = 0; i < goods_prices.size(); i++) {
                    cartItem[i] = new CartItem();

                    cartItem[i].setId(cartItems.get(i).getId());
                    cartItem[i].setItemNum(item_num.get(i));
                    cartItem[i].setPrice(new BigDecimal(goods_prices.get(i)));
                    cartItemService.update(cartItem[i]);

                }
            }
            return new Result(true,"保存成功",null);
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"网络错误，请重试",null);
        }
    }


}
