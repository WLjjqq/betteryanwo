package com.betteryanwo.controller;

import com.betteryanwo.entity.*;
import com.betteryanwo.enums.OrderType;
import com.betteryanwo.exception.OrderException;
import com.betteryanwo.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

/**
 * Create by 六
 * Date:18-6-7
 */
@Controller
@RequestMapping(value = "/pay")
public class PayOrderController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    //订单service
    @Autowired
    private OrderService orderService;
    //购物车
    @Autowired
    private ShopCartService shopCartService;
    //购物车项
    @Autowired
    private CartItemService cartItemService;

    //订单操作
    @Autowired
    private OrderLogService orderLogService;
    //订单项
    @Autowired
    private OrderItemService orderItemService;

    /**
     * 订单结算</br>
     * 传入订单号，先检查是否已存在订单，如果存在抛出异常
     * @param userId
     * @param session
     * @param model
     * @param orderSerial 订单序列号
     * @param isInvoice 需要开发票不需要
     * @return
     */
    @RequestMapping(value = "/submit",method = RequestMethod.POST)
    public String pay(Long userId, HttpSession session,Model model,
                      @RequestParam("orderSerial") String orderSerial,
                      @RequestParam("isInvoice") Integer isInvoice){
        try{
            //先判断有没有这个订单号,如果有的话抛出异常
            if(! StringUtils.isEmpty(orderSerial)){
                Order order = orderService.getOrderByOrderSerial(orderSerial);
                if(null !=order){
                    throw new OrderException("订单生成异常，已经存在这个订单了");
                }
            }
            //根据用户添加订单
            Order order = orderService.insert(userId, orderSerial, isInvoice);
            //添加订单操作日志
            orderLogService.insert(new OrderLog(order.getDateCreated(),"用户",OrderType.CREATE.getMessage(),order.getOrderSerial()));
            model.addAttribute("order", order);
            //清空购物车
            Cart cart = shopCartService.getByUserId(userId);
            cartItemService.deleteByCartId(cart.getId());
            cart.setPrice(new BigDecimal(0));
            shopCartService.update(cart);
            return "redirect:/alipay/online?orderSerial="+order.getOrderSerial();
        }catch (Throwable e){
            if(e instanceof OrderException){
                session.setAttribute("msg", e.getMessage());
            }else{
                e.printStackTrace();
            }
            return "redirect:/error/info";
        }
    }

    /**
     * 查询付款信息
     * @param session
     * @param model
     * @param orderSerial 订单序列号
     * @return
     */
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public String getPayInfo(HttpSession session, Model model,
                             Long userId,
                             @RequestParam(value = "orderSerial") String orderSerial){

        try {
            Order order = orderService.getByUserIdAndOrderSerial(userId, orderSerial);
            if(null == order){
                session.setAttribute("msg","未查询到订单");
                return "redirect:/error/info";
            }
            /*如果订单已取消*/
            if(3 == order.getStatus()){
                session.setAttribute("msg", "此订单您已经取消");
                return "redirect:/order/info?orderId="+order.getOrderSerial();
            }

            model.addAttribute("order", order);

            if(2==order.getStatus()){
                session.setAttribute("msg", "此订单您已经付款成功");
                return "redirect:/order/info?orderId="+order.getOrderSerial();
            }
            return "/order/pay";
        }catch (Exception e){
                e.printStackTrace();
                return "info";
            }
    }
}
