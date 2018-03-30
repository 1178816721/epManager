package com.epmanager.service;

import com.epmanager.orm.Attendance;
import com.epmanager.util.BaseService;

public interface AttendanceService extends BaseService<Attendance>{
	public boolean isNowDayQd();
	public String historyQd(int month,int userId);
}
