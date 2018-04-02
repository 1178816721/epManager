package com.epmanager.action;

import java.util.Date;

import org.apache.poi.hssf.model.Model;

import com.epmanager.exception.util.RestPageException;
import com.epmanager.orm.Person;
import com.epmanager.orm.User;
import com.epmanager.orm.Wage;
import com.epmanager.util.HqlHelper;
import com.epmanager.util.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

public class WageAction extends BaseAction<Wage> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private Integer userId;
	private User user;
	private Wage wage;
	private String link; 
	
	public String addsave(){	
		wage= wageService.getWageByUserId(userId);
		
		ActionContext.getContext().getValueStack().push(userId);
		if(wage==null){//新增
			link="wage_addWage.action";
		}else{//修改
			if(getLoginSession().getAut()==0){
				throw new RestPageException("权限不足，无法修改");
			}
			ActionContext.getContext().put("wage", wage);
			link="wage_update.action";
		}
		ActionContext.getContext().getValueStack().push(link);
		return "addsave";
	}

	public String update(){
		
		wage=wageService.getById(model.getId());
		wage.setBonus(model.getBonus());
		wage.setCm(model.getCm());
		wage.setBaseWage(model.getBaseWage());
		wageService.update(wage);
		return "addwage";
	}
	
	public String addWage(){
		user=userService.getById(userId);
		model.setUser(user);
		model.setCreateDate(new Date());
		wageService.save(model);
		return "addwage";
	}
	
	


	public String list(){
		HqlHelper hqlHelper = new HqlHelper(Wage.class, "p");
		hqlHelper.addWhereCondition(getUserId()!=null&&!getUserId().equals(""), "p.user.usen like ?","%"+getUserId()+"%");
		PageBean pageBean=personService.getPageBean(hqlHelper, pageNum, 10);
		ActionContext.getContext().getValueStack().push(pageBean);
		//ActionContext.getContext().put("usen", getUsen());
		return "list";
	}
	
	
	public String myWage(){
		HqlHelper hqlHelper = new HqlHelper(Wage.class, "p");
		User user = getLoginSession();
		hqlHelper.addWhereCondition(true, "p.user.id =?",user.getId());
		PageBean pageBean=personService.getPageBean(hqlHelper, pageNum, 10);
		ActionContext.getContext().getValueStack().push(pageBean);
		//ActionContext.getContext().put("usen", getUsen());
		return "list";
	}
	
	

	
	
	
	
	

////////////////////////////////////////////////
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}


	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	/**
	 * @return the wage
	 */
	public Wage getWage() {
		return wage;
	}


	/**
	 * @param wage the wage to set
	 */
	public void setWage(Wage wage) {
		this.wage = wage;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}


	
	
	
	
	
	
	
	
	
	
	
	









	
	
	
	
}
