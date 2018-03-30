package com.epmanager.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.epmanager.dao.AttendanceDao;
import com.epmanager.orm.Attendance;
import com.epmanager.util.BaseDaoImpl;

@Repository
public class AttendanceDaoImpl extends BaseDaoImpl<Attendance> implements
		AttendanceDao {

	public boolean isNowDayQd() {
		SQLQuery query = getSession()
				.createSQLQuery(
						"select * from ATTENDANCE where DATE_FORMAT(CREATEDATE,'%yyyy%MM%dd')=DATE_FORMAT(NOW(),'%yyyy%MM%dd')")
				.addEntity(Attendance.class);
		List<Attendance> attendances = query.list();
		
        return attendances.size()>0?false:true;
	}

	public String historyQd(int month,int userId) {
		//"select GROUP_CONCAT(DISTINCT DATE_FORMAT(CREATEDATE,'%Y%m%d')) as str from ATTENDANCE where DATE_FORMAT(CREATEDATE,'%m')=? and USER=?
		SQLQuery query = getSession()
				.createSQLQuery(
						"select GROUP_CONCAT(DISTINCT DATE_FORMAT(CREATEDATE,'%Y%m%d')) as str from ATTENDANCE where  USER=?");
				query.setInteger(0, userId);
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		List<Map<String,String>> list = query.list();
		
		return list.get(0).get("str");
	}

}
