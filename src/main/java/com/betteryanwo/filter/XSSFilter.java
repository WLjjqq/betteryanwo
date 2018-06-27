package com.betteryanwo.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 过滤可以引起XSS的字符
 * Created by 辉太郎 on 2017/3/9.
 */
public class XSSFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        XssHttpServletRequestWrapper htmlRequest = new XssHttpServletRequestWrapper(httpServletRequest);

        HttpServletResponse response = (HttpServletResponse) res;
        /*response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with, Content-Type");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        // response.setHeader("X-Frame-Options", "SAMEORIGIN");
        response.setContentType("application/json;charset=utf-8");*//*

        chain.doFilter(htmlRequest, response);*/
    }

    @Override
    public void destroy() {

    }
}

