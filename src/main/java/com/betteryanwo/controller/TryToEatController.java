package com.betteryanwo.controller;

import com.betteryanwo.dto.Result;
import com.betteryanwo.entity.TryToEat;
import com.betteryanwo.service.TryToEatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author :MaMengna
 * @Date :Create in 15:12 2018/6/12
 */
@Controller
@RequestMapping("/eat")
public class TryToEatController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TryToEatController.class);
    @Autowired
    private TryToEatService eatService;


    @RequestMapping(value = "/trytoeat", method = RequestMethod.POST)
    private Object addTryToEat(TryToEat tryToEat){
        try {
            int t= eatService.addTryToEat(tryToEat);
            return new Result(true, "提交成功");
        }catch (Exception e){
            return new Result(false, "提交失败");
        }

    }
}
