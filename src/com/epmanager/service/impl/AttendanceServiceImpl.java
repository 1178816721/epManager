package com.epmanager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.epmanager.dao.AttendanceDao;
import com.epmanager.dao.impl.AttendanceDaoImpl;
import com.epmanager.orm.Attendance;
import com.epmanager.service.AttendanceService;
import com.epmanager.util.BaseService;
import com.epmanager.util.BaseServiceImpl;
@Service
public class AttendanceServiceImpl extends BaseServiceImpl<Attendance> implements AttendanceService{
	private AttendanceDao attendanceDao;
	@Resource
	public void setAttendanceDao(AttendanceDao attendanceDao) {
		super.setBaseDao(attendanceDao);
		this.attendanceDao = attendanceDao;
	}
	public boolean isNowDayQd() {
		
		return attendanceDao.isNowDayQd();
	}
	public String historyQd(int month,int userId) {
		
		return attendanceDao.historyQd(month,userId);
	}
	
}
