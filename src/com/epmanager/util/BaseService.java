package com.epmanager.util;


import java.util.List;
import java.util.Map;


public interface BaseService<T> {
	//新增
	public void save(T entity);
	//更新
	public void update(T entity);
	//根据id删除
	public void delete(Integer id);
	//根据id查找
	public T getById(Integer id);
	public List<T> getByIds(Integer[] ids);
	//查找列表
	public List<T> findAll();
	//条件查询实体列表--查询助手queryHelper
	public List<T> findObjects(HqlHelper hqlHelper);
	//分页条件查询实体列表--查询助手queryHelper
	public 	PageBean getPageBean(HqlHelper hqlHelper,int pageNum, int Pagesize);
	
	
	public 	PageBean getPageBeanBySql(String sql,int pageNum, int Pagesize,Object ...para);
	
	/**
	 * 根据sql查询  查询的值 反射为 对象集合
	 * @param sql
	 * @param classz
	 * @return
	 */
	public List<T> findObjectsBysql(String sql,Class<T> classz);
	/**
	 * 根据sql查询  查询的值 反射为 对象
	 * @param sql
	 * @param classz
	 * @return
	 */
	public T findObjectBysql(String sql,Class<T> classz);
	/**
	 * 根据sql查询  查询的值 封装为MAP  
	 * @param sql
	
	 * @param para
	 * @return
	 */
	public List<Map<String, Object>> findObjectsBysql(String sql,Object ...para);
	
	/**
	 * 根据sql查询  查询的值 封装为MAP集合
	 * @param sql
	
	 * @param para
	 * @return
	 */
	public Map<String, Object> findObjectBysql(String sql,Object ...para);
	

}
