package com.epmanager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.epmanager.dao.WageDao;
import com.epmanager.orm.Wage;
import com.epmanager.service.WageService;
import com.epmanager.util.BaseService;
import com.epmanager.util.BaseServiceImpl;
@Service
public class WageServiceImpl extends BaseServiceImpl<Wage> implements WageService{
	private WageDao wageDao;
	@Resource
	public void setWageDao(WageDao wageDao) {
		setBaseDao(wageDao);
		this.wageDao = wageDao;
	}
	@Override
	public Wage getWageByUserId(Integer userId) {
		return wageDao.getWageByUserId(userId);
		
	}
	
}
