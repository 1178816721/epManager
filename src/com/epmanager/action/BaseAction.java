package com.epmanager.action;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import com.epmanager.orm.User;
import com.epmanager.service.AttendanceService;
import com.epmanager.service.PersonService;
import com.epmanager.service.UserService;
import com.epmanager.service.WageService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public abstract class BaseAction<T> extends ActionSupport implements
		ModelDriven<T> {


	protected T model;
	
	 public BaseAction() {
			try {
				ParameterizedType pt = (ParameterizedType) this.getClass()
						.getGenericSuperclass();
				Class clazz = (Class) pt.getActualTypeArguments()[0];

				model = (T) clazz.newInstance();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	/**
	 * sevice
	 */
	 @Resource
	 protected AttendanceService attendanceService;
	 @Resource
	 protected PersonService personService;
	 @Resource
	 protected UserService userService;
	 @Resource
	 protected WageService wageService;
	
	public T getModel() {
		return model;
	}
	
	protected int pageNum = 1;

	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	
	public User getLoginSession(){
		return (User) ActionContext.getContext().getSession().get("user");
	}
}
