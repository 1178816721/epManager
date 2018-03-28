package com.epmanager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.epmanager.dao.PersonDao;
import com.epmanager.orm.Attendance;
import com.epmanager.orm.Person;
import com.epmanager.service.PersonService;
import com.epmanager.util.BaseService;
import com.epmanager.util.BaseServiceImpl;
@Service
public class PersonServceImpl extends BaseServiceImpl<Person> implements PersonService{
	private PersonDao personDao;
	@Resource
	public void setPersonDao(PersonDao personDao) {
		super.setBaseDao(personDao);
		this.personDao = personDao;
	}
	
}
