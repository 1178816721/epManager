package com.epmanager.dao.impl;

import org.springframework.stereotype.Repository;

import com.epmanager.dao.PersonDao;
import com.epmanager.orm.Person;
import com.epmanager.util.BaseDaoImpl;
@Repository
public class PersonDaoImpl extends BaseDaoImpl<Person> implements PersonDao{

}
