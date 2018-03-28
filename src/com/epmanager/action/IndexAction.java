package com.epmanager.action;

import com.epmanager.orm.User;

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
}
