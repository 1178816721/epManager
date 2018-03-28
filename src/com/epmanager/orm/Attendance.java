package com.epmanager.orm;

import java.io.Serializable;
import java.util.Date;


/*
 * 考勤
 */
public class Attendance implements Serializable{
	private Integer id;
	private Date createDate;//创建时间
	private User user;
	
	public Attendance() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	}
