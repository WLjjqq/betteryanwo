package com.betteryanwo.controller;


import com.betteryanwo.dto.Result;
import com.betteryanwo.entity.Users;
import com.betteryanwo.exception.LoginException;
import com.betteryanwo.service.UsersService;
import com.betteryanwo.util.IPUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author :MaMengna
 * @Date :Create in 10:40 2018/5/29
 */
@Controller
@RequestMapping("/user")
public class UsersController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UsersController.class);
    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/toLogin", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }


    @RequestMapping(value = "/toReg", method = RequestMethod.GET)
    public String toReg() {
        return "register";
    }

    /**
     * Created by mamengna on 2018/6/4 10:08
     * Description：登录
     */
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object loginUsers(HttpServletRequest request, Users users, String verifycode, HttpSession session, HttpServletResponse resp) throws ServletException, IOException {

        try {
            String cCode = (String) session.getAttribute("captchaRand");
            Users users1 = usersService.login(users);
            if (verifycode == null) {
                return new Result(false, "验证码不能为空");
            }
            if (!verifycode.equalsIgnoreCase(cCode)) {// 比对验证码，忽视大小写。验证码错误则返回登录界面
                return new Result(false, "验证码输入错误");
            } else {
                session.setAttribute("user", usersService.getByUserPassword(users));
                return new Result(true, "登录成功");
            }
        } catch (LoginException e) {
            e.getMessage();
            LOGGER.error("UsersController,登录异常|异常产生IP：{}|{}", e.getMessage(), IPUtil.getUserIP(request));
            return new Result(false, e.getMessage());
        } catch (Exception e) {
            LOGGER.error("UsersController,登录异常|异常产生IP：{}|{}", e.getMessage(), IPUtil.getUserIP(request));
            return new Result(false, "登录失败");
        }
    }

    /**
     * Created by mamengna on 2018/6/5 11:07
     * Description：注册
     */
    @ResponseBody
    @RequestMapping(value = "/registered", method = RequestMethod.POST)
    public Object insertUser(HttpServletRequest request, Users users, String rePwd, String verifycode, HttpSession session){

        try {
            String cCode = (String) session.getAttribute("captchaRand");

            if (verifycode == null) {
                return new Result(false, "验证码不能为空");
            } else if (!verifycode.equalsIgnoreCase(cCode)) {// 比对验证码，忽视大小写。验证码错误则返回登录界面

                return new Result(false, "验证码输入错误");
            } else if(!rePwd.equals(users.getUserPassword())){

                return new Result(false, "两次密码输入不一致");
            } else {
                int u=usersService.insertUser(users);
                return new Result(true, "注册成功");
            }
        }catch (LoginException e){
            LOGGER.error("UsersController,注册异常|异常产生IP：{}|{}", e.getMessage(), IPUtil.getUserIP(request));
            return new Result(false, e.getMessage());
        }catch (Exception e) {
            LOGGER.error("UsersController,注册异常|异常产生IP：{}|{}", e.getMessage(), IPUtil.getUserIP(request));
            return new Result(false, "注册失败");
        }

    }

}
