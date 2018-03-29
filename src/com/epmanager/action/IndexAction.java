package com.epmanager.action;

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
		return "top";
	}
	public String left(){
		return "left";
	}
	public String index(){
		return "index";
	}
	public String head(){
		return "head";
	}
	public String login(){
		return "login";
	}
	public String tologin(){
		/*usen= ServletActionContext.getRequest().getParameter("usen");
		psd= ServletActionContext.getRequest().getParameter("usen");*/
		User user=  userService.login(model.getUsen(), model.getPsd());
		ServletActionContext.getRequest().getSession().setAttribute("user", user);
		return "tologin";
	}
	public String outLogin(){
		ServletActionContext.getRequest().getSession().removeAttribute("user");
		return "login";
	}
	
	
	
	
	
}
