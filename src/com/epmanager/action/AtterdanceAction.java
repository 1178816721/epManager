package com.epmanager.action;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.epmanager.orm.Attendance;

public class AtterdanceAction extends BaseAction<Attendance> {
	public String qd() throws IOException{
		HttpServletResponse response= ServletActionContext.getResponse();
		if(attendanceService.isNowDayQd()){
			model.setCreateDate(new Date());
			model.setUser(getLoginSession());
			attendanceService.save(model);
			response.getWriter().print(true);
		}else{
			response.getWriter().print(false);
		}
		
		
		return null;
	}
}
