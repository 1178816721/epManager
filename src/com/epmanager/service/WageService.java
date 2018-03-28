package com.epmanager.service;

import com.epmanager.orm.Wage;
import com.epmanager.util.BaseService;

public interface WageService extends BaseService<Wage>{
		public Wage getWageByUserId(Integer userId);
		
}
