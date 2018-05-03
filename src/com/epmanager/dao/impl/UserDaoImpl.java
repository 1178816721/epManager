package com.epmanager.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.epmanager.dao.UserDao;
import com.epmanager.orm.User;
import com.epmanager.orm.Wage;
import com.epmanager.util.BaseDaoImpl;
import com.epmanager.util.HqlHelper;
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

	public User login(String usen, String psd) {

		HqlHelper hqlHelper = new HqlHelper(User.class, "u").addWhereCondition("u.usen=? and u.psd=? and u.flag=?",usen,psd,1);
		List<User> users =findObjects(hqlHelper);
		if(users.size()>0){
			return users.get(0);
		}
		return null;
	}


}
