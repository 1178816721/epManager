package com.epmanager.action;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.epmanager.orm.Attendance;
import com.epmanager.orm.User;
import com.epmanager.util.PageBean;
import com.opensymphony.xwork2.ActionContext;

public class AtterdanceAction extends BaseAction<Attendance> {
	public String usen;
	public String list(){
		String sql="SELECT\n" +
				"	DAY (\n" +
				"		LAST_DAY(\n" +
				"			DATE_FORMAT(NOW(), '%Y-01-01')\n" +
				"		)\n" +
				"	) AS monthDay,\n" +
				"	COUNT(attendance.id) AS qdCount,\n" +
				"	person.`NAME`,\n" +
				"	`user`.USEN,`user`.id\n" +
				"FROM\n" +
				"	attendance,\n" +
				"	person,\n" +
				"	`user`\n" +
				"WHERE\n" +
				"	attendance.`USER` = person.`USER`\n" +
				"AND `user`.ID = person.`USER`\n" +
				"AND DATE_FORMAT(\n" +
				"	attendance.CREATEDATE,\n" +
				"	'%Y%m'\n" +
				") = DATE_FORMAT(NOW(), '%Y%m')\n" +
				"AND `user`.AUT = 0   AND `user`.USEN LIKE ? \n" +
				"GROUP BY\n" +
				"	DATE_FORMAT(NOW(), '%Y%m')   ";
		if(getUsen()==null){
			setUsen("");
		}
		PageBean pageBean= attendanceService.getPageBeanBySql(sql, pageNum, 10, "%"+getUsen()+"%");
		System.out.println(getUsen());
		 ActionContext.getContext().getValueStack().push(pageBean);
		return "list";
	}
	
	@SuppressWarnings("deprecation")
	public String details(){
		String str=attendanceService.historyQd(new Date().getMonth()+1,model.getId());
		ServletActionContext.getContext().put("str", str);	
		return "details";
	}
	
	
	/**
	 * 员工签到
	 * @return
	 * @throws IOException
	 */
	public String qd() throws IOException{
		HttpServletResponse response= ServletActionContext.getResponse();
		User user= getLoginSession();
		if(attendanceService.isNowDayQd(user.getId())){
			model.setCreateDate(new Date());
			model.setUser(getLoginSession());
			attendanceService.save(model);
			response.getWriter().print(true);
		}else{
			response.getWriter().print(false);
		}
		
		
		return null;
	}
	////////////////////////////



	public String getUsen() {
		return usen;
	}



	public void setUsen(String usen) {
		this.usen = usen;
	}
	
}
