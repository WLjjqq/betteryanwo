package com.betteryanwo.controller;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 辉太狼 on 2018/5/28
 */

@Controller
public class IndexController {

    private final static org.slf4j.Logger Logger = LoggerFactory.getLogger(IndexController.class);
    @RequestMapping(value = {"", "/"})
    public String redict() {
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
}
