package com.epmanager.dao;

import com.epmanager.orm.Wage;
import com.epmanager.util.BaseDao;

public interface WageDao extends BaseDao<Wage>{
	public Wage getWageByUserId(Integer userId);
}
