package com.epmanager.orm;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private Integer id;
	private String usen;
	private String psd;//密码
	private int aut;//权限 0员工 1管理员
	private Date createDate;
	private Person person;
	public User() {
		super();   
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsen() {
		return usen;
	}
	public void setUsen(String usen) {
		this.usen = usen;
	}
	public String getPsd() {
		return psd;
	}
	public void setPsd(String psd) {
		this.psd = psd;
	}
	public int getAut() {
		return aut;
	}
	public void setAut(int aut) {
		this.aut = aut;
	}

	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", usen=" + usen + ", psd=" + psd + ", aut="
				+ aut + ", createDate=" + createDate + ", getId()=" + getId()
				+ ", getUsen()=" + getUsen() + ", getPsd()=" + getPsd()
				+ ", getAut()=" + getAut() + ", getCreateDate()="
				+ getCreateDate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
