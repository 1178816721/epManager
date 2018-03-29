package com.epmanager.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.epmanager.dao.WageDao;
import com.epmanager.orm.Person;
import com.epmanager.orm.Wage;
import com.epmanager.util.BaseDaoImpl;
import com.epmanager.util.HqlHelper;
@Repository
public class WageDaoImpl extends BaseDaoImpl<Wage> implements WageDao{

	public Wage getWageByUserId(Integer userId) {
		HqlHelper hqlHelper = new HqlHelper(Wage.class, "w").addWhereCondition("w.user.id=?",userId);
		List<Wage> wages =findObjects(hqlHelper);
		return wages.size()==0?null:wages.get(0);
	}

	



}
