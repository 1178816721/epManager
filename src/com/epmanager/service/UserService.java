package com.epmanager.service;

import com.epmanager.orm.User;
import com.epmanager.util.BaseService;

public interface UserService extends BaseService<User>{

	public User login(String usen,String psd);
}
