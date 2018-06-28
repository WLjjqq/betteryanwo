package com.betteryanwo.service;

import com.betteryanwo.entity.Users;

/**
 * @author :MaMengna
 * @Date :Create in 10:23 2018/5/29
 */
public interface UsersService {


    /**
     * Created by mamengna on 2018/6/4 15:23
     * Description：根据Id查询用户
     */
    Users getById(Long id);

    /**
     * Created by mamengna on 2018/6/4 15:24
     * Description：根据email查询用户
     */
    Users getByEmail(String email);

    /**
     * Created by mamengna on 2018/6/4 15:25
     * Description：
     */
    Users getByUserPassword(Users users);

    /**
     * Created by mamengna on 2018/6/4 15:25
     * Description：登录
     */
     Users login(Users users);

     int insertUser(Users users);

}
