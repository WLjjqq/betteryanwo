package com.betteryanwo.controller;

import com.betteryanwo.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author :MaMengna
 * @Date :Create in 9:55 2018/6/20
 */
@Controller
public class FreshController {
    private static final Logger LOGGER = LoggerFactory.getLogger(FreshController.class);

    @Autowired
    private GoodsService goodsService;
   /* @RequestMapping(value = {"", "/"})
    public String index(Model model, HttpServletRequest request){

        List<Goods> list=goodsService.listGoodsByType(2L);

        for (int i = 0; i < list.size(); i++) {
            Map getcomment = new HashMap();
            getcomment.put("productId", list.get(i).getGoodsId());
        }

        if (null != list) {
            model.addAttribute("productList", list);
        }
        return "redirect:/freshstew";
    }*/

}
