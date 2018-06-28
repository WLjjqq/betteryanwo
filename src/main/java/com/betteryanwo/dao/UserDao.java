package com.betteryanwo.dao;

import com.betteryanwo.entity.User;

/**
 * Created by 辉太狼 on 2018/5/27
 */
public interface UserDao {
    User getById(Long id);

    /**
     * 通过用户名查询用户
     * @param userName
     * @return
     */
    User getByUserName(String userName);
    int insertSelective(User record);
}
