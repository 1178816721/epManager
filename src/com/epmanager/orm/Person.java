package com.epmanager.orm;

import java.io.Serializable;
import java.util.Date;
/**
 * 员工类
 * @author 
 *
 */
public class Person implements Serializable{
	private Integer id;
	private String name;
	private String no;//工号
	private int age;
	private String birthday;
	private String address;
	private String idCard;//身份证
	private String gender;
	private Date inJobTime;//入职时间
	private Date createDate;//创建时间
	private String jobName;//职位
	private String family;//
	private User user;
	private String phone;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getInJobTime() {
		return inJobTime;
	}
	public void setInJobTime(Date inJobTime) {
		this.inJobTime = inJobTime;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Person() {
		super();
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", no=" + no + ", age="
				+ age + ", birthday=" + birthday + ", address=" + address
				+ ", idCard=" + idCard + ", gender=" + gender + ", inJobTime="
				+ inJobTime + ", createDate=" + createDate + ", jobName="
				+ jobName + ", family=" + family + ", user=" + user
				+ ", phone=" + phone + "]";
	}
	
	
}
