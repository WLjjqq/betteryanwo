package com.betteryanwo.controller;


import com.betteryanwo.domain.SessionUser;
import com.betteryanwo.dto.Result;
import com.betteryanwo.entity.Captcha;
import com.betteryanwo.entity.Users;
import com.betteryanwo.exception.LoginException;
import com.betteryanwo.service.UsersService;
import com.betteryanwo.util.GraphicHelper;
import com.betteryanwo.util.SessionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author :MaMengna
 * @Date :Create in 10:40 2018/5/29
 */
@RestController
@RequestMapping("/user")
public class UsersController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UsersController.class);
    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/toLogin", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    /**
     * Created by mamengna on 2018/6/4 10:08
     * Description：登录
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object loginUsers(Users users, String verifycode, HttpSession session,HttpServletResponse resp) throws ServletException, IOException {

        try {
            System.out.println(users.getEmail());
            System.out.println(users.getUserPassword());
            String cCode = (String) session.getAttribute("captchaRand");
            System.out.println("用户输入的验证码是：" + verifycode + "，内存中保存的验证码是：" + cCode);
            Users users1 = usersService.login(users);
            if (verifycode == null) {
                return new Result(false, "验证码不能为空");
            } else if (!verifycode.equalsIgnoreCase(cCode)) {// 比对验证码，忽视大小写。验证码错误则返回登录界面

                return new Result(false, "验证码输入错误");
            } else {
                session.setAttribute("user", usersService.getByUserPassword(users));
                return new Result(true, "登录成功");
            }
        } catch (LoginException e) {
            return new Result(false, e.getMessage());
        } catch (Exception e) {
            return new Result(false, "登录失败");
        }
    }

}
