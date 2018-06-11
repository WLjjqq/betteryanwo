package com.betteryanwo.service;


import com.betteryanwo.entity.User;

public interface UserService {

    User getById(Long id);

	void save(User users);

	User getByUserName(String userName);

}
