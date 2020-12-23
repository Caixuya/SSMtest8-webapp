package com.thxy.service;

import javax.annotation.Resource;

import com.thxy.dao.UserDao;
import com.thxy.pojo.User;

public class UserService {

	@Resource
	UserDao userDao;
	
	public void register(User user) throws Exception {
		UserDao.addUser(user);
	}
}

