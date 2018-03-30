package com.epmanager.dao;

import java.sql.PseudoColumnUsage;

import com.epmanager.orm.Attendance;
import com.epmanager.orm.Person;
import com.epmanager.util.BaseDao;

public interface AttendanceDao extends BaseDao<Attendance>{
	public boolean isNowDayQd();
	public String historyQd(int month,int userId);
}
