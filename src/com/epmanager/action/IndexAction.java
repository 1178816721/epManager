package com.epmanager.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.struts2.ServletActionContext;

import com.epmanager.exception.util.RestPageException;
import com.epmanager.orm.User;
import com.epmanager.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;

public class IndexAction extends BaseAction<User>{
	private String usen;
	private String psd;
	public String main(){
		
		return "main";
	}
	public String top(){
		ServletActionContext.getContext().put("date", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		return "top";
	}
	public String left(){
		User user= (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		if(user.getAut()==0){//员工
			String str=attendanceService.historyQd(new Date().getMonth()+1,getLoginSession().getId());
			ServletActionContext.getContext().put("str", str);
			return "userLeft";			
		}
		
		return "left";
	}
	public String index(){
		User user= (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		if(user.getAut()==0){//员工
			String str=attendanceService.historyQd(new Date().getMonth()+1,getLoginSession().getId());
			ServletActionContext.getContext().put("str", str);
			return "employee";			
		}
		return "index";
	}
	public String head(){
		return "head";
	}
	public String login(){
		return "login";
	}
	public String tologin(){
		User user=  userService.login(model.getUsen(), model.getPsd());
		ServletActionContext.getRequest().getSession().setAttribute("user", user);
		return "tologin";
		
	}
	public String outLogin(){
		ServletActionContext.getRequest().getSession().removeAttribute("user");
		return "login";
	}
	
	
	
	public static void main(String[] args) {
		
	}
	
}
