package com.epmanager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.epmanager.dao.UserDao;
import com.epmanager.exception.util.ObjectNullException;
import com.epmanager.orm.User;
import com.epmanager.service.UserService;
import com.epmanager.util.BaseService;
import com.epmanager.util.BaseServiceImpl;
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{
	private UserDao userDao;
	@Resource
	public void setUserDao(UserDao userDao) {
		setBaseDao(userDao);
		this.userDao = userDao;
	}
	
	public User login(String usen, String psd) {
		User user = null;
		if (usen != null && !usen.equals("") && psd != null
				&& !psd.equals("")) {
			user = userDao.login(usen, psd);	
		}
		if (user == null) {
			throw new ObjectNullException("用户名或密码错误");
		}
		return user;

	}
	
	
}
