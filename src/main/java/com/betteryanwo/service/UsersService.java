package com.betteryanwo.service;

import com.betteryanwo.domain.SessionUser;
import com.betteryanwo.entity.Users;

import javax.servlet.http.HttpServletRequest;

/**
 * @author :MaMengna
 * @Date :Create in 10:23 2018/5/29
 */
public interface UsersService {
    /*Users getByUserName(Users users);

    *//**
     * 根据用户名密码登陆
     * @Title getByNameAndPwd
     * @Description TODO
     * @param u
     * @return User
     * @throws
     *//*
    Object loginUser(Users u);
    *//**
     *
     * @Title selectUserPwdByUserName
     * @Description 根据用户名 密码查对象
     * @param
     * @return User
     * @throws
     *//*
    Users selectUserPwdByUserName(Users u);*/




    Users getById(Long id);
    Users getByEmail(String email);

    /**
     * Created by mamengna on 2018/5/30 9:02
     * Description：登录
     */
    /*SessionUser login(HttpServletRequest request,  Users users);*/

    /**
     * Created by mamengna on 2018/5/14:38:37
     * Description：
     */
    Users getByUserPassword(Users users);

    public Users login(Users users );

}
