package com.betteryanwo.controller;

import com.betteryanwo.entity.UserOrder;
import com.betteryanwo.service.UserOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author :MaMengna
 * @Date :Create in 15:34 2018/6/22
 */
@RestController
@RequestMapping("/userorder")
public class UserOrderController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserOrderController.class);
    @Autowired
    private UserOrderService userOrderService;


    @RequestMapping(value = "/selorder",method = RequestMethod.GET)
    public  Object selUserOrder(Long userId){
        List<UserOrder> list=userOrderService.selUserOrder(userId);
        System.out.println("=================="+list);
        return list;
    }

}
