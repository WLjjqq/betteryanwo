package com.betteryanwo.controller;

import com.betteryanwo.dto.Result;
import com.betteryanwo.entity.Order;
import com.betteryanwo.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    //添加订单。
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
    //更新订单状态
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
    //订单取消
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
    //订单确认
    //订单提交

}
