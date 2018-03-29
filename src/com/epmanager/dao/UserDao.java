package com.epmanager.dao;

import java.sql.PseudoColumnUsage;

import com.epmanager.orm.Person;
import com.epmanager.orm.User;
import com.epmanager.util.BaseDao;

public interface UserDao extends BaseDao<User>{

	User login(String usen, String psd);

}
