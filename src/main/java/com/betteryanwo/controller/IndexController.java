package com.betteryanwo.controller;
import com.betteryanwo.dto.Result;
import com.betteryanwo.entity.Users;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by 辉太狼 on 2018/5/28
 */

@Controller
public class IndexController {

    private final static org.slf4j.Logger Logger = LoggerFactory.getLogger(IndexController.class);
    @RequestMapping(value = {"", "/"})
    public String redict() {
        return "homepage";
    }

    @RequestMapping(value = {"", "/cart"})
    public String redictToCart() {
            return "cart";
    }


    /**
     * 用于跳转到order订单页面
     * @return
     */
    @RequestMapping(value = "/order")
    public String replace() {
        return "order";
    }

    /**
     * 点击提交订单跳转到支付页面
     * @return
     */
    @RequestMapping(value = "/pay")
    public String replaceToPay() {
        return "pay";
    }

    /**
     * 错误的页面的跳转
     * @return
     */
    @RequestMapping(value = "/error")
    public String return500(){
        return "500";
    }

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    @ResponseBody
    public Result getUser(HttpSession session){
        Users user = (Users)session.getAttribute("user");
        if(null==user){
            return new Result(false,"还没有登录");
        }
        return new Result(true,user,"得到用户的值");
    }
}
