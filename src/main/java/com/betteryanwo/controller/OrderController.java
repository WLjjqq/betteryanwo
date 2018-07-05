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
    @Autowired
    GoodsService goodsService;


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
     * @param session 把用户保存到session中
     * @param orderSerial
     * @return
     */
    @RequestMapping(value = "/cancel",method = RequestMethod.GET)
    @ResponseBody
    public Result deleteOrder(HttpServletRequest request, HttpSession session, Model model,
                              @RequestParam("orderSerial") String orderSerial){
        try {
            Users user = (Users)session.getAttribute("user");
            model.addAttribute("content","dingdan");
            if(null ==orderSerial || orderSerial.isEmpty()){
                model.addAttribute("msg", "订单号不能为空");
                return new Result(false,"订单号不能为空");
            }
            Order order = orderService.getByUserIdAndOrderSerial(user.getUserId(), orderSerial);
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
     * 得到订单号
     * @return
     */
    @RequestMapping(value = "/getOrderSerial",method = RequestMethod.GET)
    @ResponseBody
    public Result generateOrderSerial(){
        // 实时添加订单号
        String orderSerial = OrderUtil.getOrderId();
        Order order = orderService.getOrderByOrderSerial(orderSerial);
        if(null != order){
            throw new OrderException("已经有这个订单号了");
        }
        return new Result(true,orderSerial,"订单号生成成功");
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
                               @RequestParam("orderSerial") String orderSerial,
                               HttpSession session) {
        try{
            Users user = (Users)session.getAttribute("user");
            Cart cart = shopCartService.getByUserId(user.getUserId());
            if(null==cart){
                return new Result(false,"购物车为空");
            }
            List<CartItem> cartItemList = cart.getCartItems();
            if (null != cartItemList && !cartItemList.isEmpty()) {

                //查询订单是否已经存在，如果订单已存在则返回错误信息
                if(StringUtils.isEmpty(orderSerial)){
                    Order order = orderService.getOrderByOrderSerial(orderSerial);
                    if(null !=order){
                        throw new OrderException("已经存在订单，订单生成错误");
                    }
                }
                //添加订单
                Order order = orderService.insert(user.getUserId(), orderSerial, isInvoice);
                //清空购物车
                cart = shopCartService.getByUserId(user.getUserId());
                cartItemService.deleteByCartId(cart.getId());
                cart.setPrice(new BigDecimal(0));
                shopCartService.delete(cart.getId());
                //减库存
                for(CartItem cartItem:cartItemList){
                    goodsService.UpdateCountGoods(cartItem.getGoods().getGoodsId(),cartItem.getItemNum());
                }

                return new Result(true, orderSerial, "添加成功");
            }else{
                return new Result(false, "购物车项为空");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return new Result(false, "订单添加异常");
    }
}
