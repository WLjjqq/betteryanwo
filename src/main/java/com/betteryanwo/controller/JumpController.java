package com.betteryanwo.controller;

import com.betteryanwo.dto.Result;
import com.betteryanwo.entity.Goods;
import com.betteryanwo.entity.Users;
import com.betteryanwo.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author :MaMengna
 * @Date :Create in 9:37 2018/6/21
 */

@Controller
@RequestMapping("/jump")
public class JumpController {

    private static final Logger LOGGER = LoggerFactory.getLogger(JumpController.class);

    @Autowired
    private GoodsService goodsService;

    /**
     * Created by mamengna on 2018/6/21 9:52
     * Description：跳转到鲜炖系列页面
     */
    @RequestMapping(value = "/toFreshstew", method = RequestMethod.GET)
    public String toFreshstew(Model model, HttpServletRequest request) {
        List<Goods> list = goodsService.listGoodsByType();
        if (null != list) {
            model.addAttribute("productList", list);
        }
        return "freshstew";
    }

    /**
     * Created by mamengna on 2018/6/21 9:52
     * Description：跳转到干燕系列
     */
    @RequestMapping(value = "/toDrydan", method = RequestMethod.GET)
    public String toDrydan(Model model, HttpServletRequest request) {
        List<Goods> list = goodsService.listGoodsByType1();
        if (null != list) {
            model.addAttribute("productList", list);
        }
        return "drydan";
    }

    /**
     * Created by mamengna on 2018/6/21 9:52
     * Description：跳转到个人体验页面
     */
    @RequestMapping(value = "/toPersonal", method = RequestMethod.GET)
    public String toPersonal(Model model, HttpServletRequest request) {
        Goods i=goodsService.getGoodsById(2L);
        if (null != i) {
//            request.setAttribute("productList", list);
            model.addAttribute("product", i);
        }
        return "personal";
    }

    @RequestMapping(value = "/toDetail", method = RequestMethod.GET)
    public String toDetail(Model model, HttpServletRequest request,Long goodsId) {
        Goods i=goodsService.getGoodsById(goodsId);
        if (null != i) {
//            request.setAttribute("productList", list);
            model.addAttribute("products", i);
        }
        return "detail";
    }


    /**
     * Created by mamengna on 2018/6/21 9:53
     * Description：跳转到企业试吃页面
     */
    @RequestMapping(value = "/toCenter", method = RequestMethod.GET)
    public String toCenter() { return "pcenter"; }


    /**
     * Created by mamengna on 2018/6/21 9:53
     * Description：跳转到企业试吃页面
     */
    @RequestMapping(value = "/toEat", method = RequestMethod.GET)
    public String toEat() {
        return "eat";
    }

    /**
     * Created by mamengna on 2018/6/21 9:53
     * Description：跳转到加入我们页面
     */
    @RequestMapping(value = "/toJoin", method = RequestMethod.GET)
    public String toJoin() {
        return "join";
    }


    /**
     * Created by mamengna on 2018/6/21 9:57
     * Description：跳转到企业文化页面
     */
    @RequestMapping(value = "/toAbout", method = RequestMethod.GET)
    public String toAbout() {
        return "about";
    }

    /**
     * Created by mamengna on 2018/6/21 9:57
     * Description：跳转到企业文化页面
     */
    @RequestMapping(value = "/toIndex", method = RequestMethod.GET)
    public String toIndex() {
        return "homepage";
    }

    /**
     * Created by mamengna on 2018/6/21 9:57
     * Description：跳转到个人中心页页面
     */
    @RequestMapping(value = "/toPcenter", method = RequestMethod.GET)
    public String toPcenter() {
        return "pcenter";
    }

    @RequestMapping(value = "/session", method = RequestMethod.GET)
    @ResponseBody
    public Result getSession(HttpSession session) {
        Users user = (Users)session.getAttribute("user");
        return new Result(true,user,"得到user的值");
    }



}
