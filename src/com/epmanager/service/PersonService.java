package com.epmanager.service;

import org.springframework.transaction.annotation.Transactional;

import com.epmanager.orm.Person;
import com.epmanager.util.BaseService;
@Transactional
public interface PersonService extends BaseService<Person>{

}
