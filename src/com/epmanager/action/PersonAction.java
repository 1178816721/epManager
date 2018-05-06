package com.epmanager.action;

import com.epmanager.orm.Person;
import com.epmanager.orm.User;
import com.epmanager.service.PersonService;
import com.epmanager.service.UserService;
import com.epmanager.util.HqlHelper;
import com.epmanager.util.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;
import java.sql.PseudoColumnUsage;
import java.util.Date;

public class PersonAction
  extends BaseAction<Person>
{
  private Person person;
  private User user;
  private String usen;
  private String psd;
  
  public String add()
  {
    return "add";
  }
  
  public String save()
  {
    this.user = new User();
    this.user.setAut(0);
    this.user.setCreateDate(new Date());
    this.user.setPsd(getPsd());
    this.user.setUsen(getUsen());
    this.person.setCreateDate(new Date());
    this.person.setUser(this.user);
    this.userService.save(this.user);
    this.personService.save(this.person);
    return "save";
  }
  
  public String edit()
  {
    this.person = ((Person)this.personService.getById(((Person)this.model).getId()));
    ActionContext.getContext().put("person", this.person);
    return "edit";
  }
  
  public String update(){
    Person p = (Person)this.personService.getById(this.person.getId());
    p.setAddress(this.person.getAddress());
    p.setAge(this.person.getAge());
    p.setBirthday(this.person.getBirthday());
    p.setFamily(this.person.getFamily());
    p.setGender(this.person.getGender());
    p.setIdCard(this.person.getIdCard());
    p.setJobName(this.person.getJobName());
    p.setName(this.person.getName());
    p.setPhone(this.person.getPhone());
    this.personService.update(p);
    
    this.user = ((User)this.userService.getById(p.getUser().getId()));
    this.user.setPsd(getPsd());
    this.user.setUsen(getUsen());
    this.userService.update(this.user);
    return "update";
  }
  
  public String list()
  {
    HqlHelper hqlHelper = new HqlHelper(Person.class, "p");
    hqlHelper.addWhereCondition((getUsen() != null) && (!getUsen().equals("")), "p.user.usen like ?", new Object[] { "%" + getUsen() + "%" });
    PageBean pageBean = this.personService.getPageBean(hqlHelper, this.pageNum, 10);
    ActionContext.getContext().getValueStack().push(pageBean);
    ActionContext.getContext().put("usen", getUsen());
    return "list";
  }
  
  /**
   * 删除员工 不仅要删除user 和person表  还有删除  工资记录和 签到记录
   * @return
   */
  public String delete()
  {
	  //person
	    this.person = ((Person)this.personService.getById(((Person)this.model).getId()));
	    //userId
	    Integer id = this.person.getUser().getId();
	  //删除签到
	 attendanceService.deleteByUser(id);
	 //删除工资
	 wageService.deleteByUserId(id);
	 person.setUser(null);
	  User user=userService.getById(id);
	  user.setPerson(null);
	  userService.update(user);
	 personService.update(person);
	 userService.delete(id);
	 personService.delete(model.getId());
    return "delete";
  }
  
  ///////////////////////////////////////用户修改自己信息
  public String myEdit(){
	  person =personService.getById(getLoginSession().getPerson().getId());
	  ActionContext.getContext().put("person", this.person);
	  return "myEdit";
  }
  public String myUpdate()
  {
    Person p = (Person)this.personService.getById(this.person.getId());
    p.setAddress(this.person.getAddress());
    p.setAge(this.person.getAge());
    p.setBirthday(this.person.getBirthday());
    p.setFamily(this.person.getFamily());
    p.setGender(this.person.getGender());
    p.setIdCard(this.person.getIdCard());
    p.setJobName(this.person.getJobName());
    p.setName(this.person.getName());
    p.setPhone(this.person.getPhone());
    this.personService.update(p);
    
    this.user = ((User)this.userService.getById(p.getUser().getId()));
    this.user.setPsd(getPsd());
    this.user.setUsen(getUsen());
    this.userService.update(this.user);
    return "myUpdate";
  }
  
  
  ////////////////////////////////////////
  public Person getPerson()
  {
    return this.person;
  }
  
  public void setPerson(Person person)
  {
    this.person = person;
  }
  
  public String getUsen()
  {
    return this.usen;
  }
  
  public void setUsen(String usen)
  {
    this.usen = usen;
  }
  
  public String getPsd()
  {
    return this.psd;
  }
  
  public void setPsd(String psd)
  {
    this.psd = psd;
  }
}
