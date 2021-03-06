package com.epmanager.service;

import com.epmanager.orm.Attendance;
import com.epmanager.orm.User;
import com.epmanager.util.BaseService;

public interface AttendanceService extends BaseService<Attendance>{
	public boolean isNowDayQd(int userId);
	public String historyQd(int month,int userId);
	public void deleteByUser(Integer userId);
}
