package com.betteryanwo.controller;

import com.betteryanwo.util.CaptchaUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author :MaMengna
 * @Date :Create in 10:58 2018/6/1
 */
public class CaptchaServlet extends HttpServlet {
    private static final long serialVersionUID = 7301233141618834332L;

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");

        //生成随机字串
        String verifyCode = CaptchaUtils.generateVerifyCode(4);
        //存入会话session
        HttpSession session = request.getSession(true);
        session.setAttribute("captchaRand", verifyCode.toLowerCase());
        //生成图片
        int w = 200, h = 80;
        CaptchaUtils.outputImage(w, h, response.getOutputStream(), verifyCode);
    }
}
