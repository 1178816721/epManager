package com.epmanager.action;

import com.epmanager.exception.util.ObjectNullException;
import com.epmanager.orm.User;
import com.epmanager.service.impl.UserServiceImpl;

public class IndexAction extends BaseAction<User>{
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
	public String tologin(String uesn,String psd){
		User user=  userService.login(uesn, psd);
		
		if(user==null){
			throw new ObjectNullException("账号或密码错误！");
		}
		
		return "tologin";
	}
	
	
	
	
	private String getpsd() {
		// TODO Auto-generated method stub
		return null;
	}
	private String getusen() {
		// TODO Auto-generated method stub
		return null;
	}

}
