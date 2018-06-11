package com.betteryanwo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.betteryanwo.dao.UserDao;
import com.betteryanwo.entity.User;
import com.betteryanwo.service.UserService;

/**
 * Created by 辉太狼 on 2018/5/28
 */
public class UserServiceImol implements UserService {
	@Autowired
	private UserDao userDao;

    public User getById(Long id) {
        return null;
    }

	public void save(User users) {
		// TODO Auto-generated method stub
		userDao.insertSelective(users);
	}


	public User getByUserName(String userName) {
		// TODO Auto-generated method stub
		return userDao.getByUserName(userName);
	}
}
