package com.epmanager.interceptor;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.epmanager.exception.util.RestPageException;
import com.epmanager.orm.User;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class RestPageInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();  
		String url[]=ServletActionContext.getRequest().getRequestURI().split("/");
		if(url.length>0&&url[url.length-1].trim().startsWith("index_login")){
			return invocation.invoke();
		}
		
        User username = (User) session.getAttribute("user");
        if(username==null&&!url[url.length-1].trim().startsWith("index_tologin")){
        	return "login";
        }else{
        	String in=null;
        	try {
        		in =invocation.invoke();
			} catch (RestPageException e) {
				ServletActionContext.getContext().put("errorMsg", e.getMessage());
				return "errorMsg";
			}
        	return in;
        }
	}

}
