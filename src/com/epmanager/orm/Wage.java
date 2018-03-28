package com.epmanager.orm;

import java.io.Serializable;
import java.util.Date;

/*
 * 工资
 */
public class Wage implements Serializable{
	private Integer id;
	private float baseWage;//基本工资
	private float cm;//提成
	private float bonus;//奖金
	private Date createDate;
	private User user;
	public Wage() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public float getBaseWage() {
		return baseWage;
	}
	public void setBaseWage(float baseWage) {
		this.baseWage = baseWage;
	}
	public float getCm() {
		return cm;
	}
	public void setCm(float cm) {
		this.cm = cm;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Wage [id=" + id + ", baseWage=" + baseWage + ", cm=" + cm
				+ ", bonus=" + bonus + ", createDate=" + createDate + ", user="
				+ user + "]";
	}
	
	   
	
}
