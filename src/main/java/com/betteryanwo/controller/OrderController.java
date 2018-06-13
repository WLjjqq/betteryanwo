package com.betteryanwo.controller;

import com.betteryanwo.dto.Result;
import com.betteryanwo.entity.Cart;
import com.betteryanwo.entity.CartItem;
import com.betteryanwo.entity.Order;
import com.betteryanwo.exception.OrderException;
import com.betteryanwo.service.CartItemService;
import com.betteryanwo.service.OrderService;
import com.betteryanwo.service.ShopCartService;
import com.betteryanwo.util.OrderUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
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
    /**
     * 添加订单
     * @param userId
     * @param orderSerial
     * @param isInvoice
     * @return
     */
    @RequestMapping(value = "/insertOrder",method = RequestMethod.GET)
    @ResponseBody
    public Result insertOrder(@RequestParam("userId") Long userId,
                              @RequestParam("orderSerial") String orderSerial,
                              @RequestParam("isInvoice") Integer isInvoice){
        try{
            Order insertOrder = orderService.insert(userId, orderSerial, isInvoice);
            return new Result(true,insertOrder,"订单添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,null,"订单添加失败");
        }

    }

    /**
     * 更新订单状态
     * @param id
     * @param shoppingStatus
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    @ResponseBody
    public Result updateOrder(@RequestParam("id") Long id,
                              @RequestParam("shoppingStatus") Integer shoppingStatus){
        try {
            Order order = new Order();
            order.setId(id);
            order.setShoppingStatus(shoppingStatus);
            orderService.updateOrder(order);
            return new Result(true,null,"订单状态修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,null,"订单状态修改失败");
        }
    }

    /**
     * 订单取消
     * @param orderId
     * @param orderSerial
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    @ResponseBody
    public Result deleteOrder(@RequestParam("orderId") Long orderId,
                              @RequestParam("orderSerial") String orderSerial){
        try {
            orderService.deleteOrder(orderId,orderSerial);
            return new Result(true,null,"订单删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,null,"订单删除失败");
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

}
