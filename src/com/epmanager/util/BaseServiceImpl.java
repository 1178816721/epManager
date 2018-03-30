package com.epmanager.util;


import java.util.List;
import java.util.Map;


public class BaseServiceImpl<T> implements BaseService<T> {
	
	private BaseDao<T> baseDao;
	
	public void setBaseDao(BaseDao<T> baseDao) {
		this.baseDao = baseDao;
	}

	public void save(T entity) {
		baseDao.save(entity);
	}

	public void update(T entity) {
		baseDao.update(entity);
	}

	public void delete(Integer id) {
		baseDao.delete(id);
	}

	public T getById(Integer id) {
		return baseDao.getById(id);
	}

	public List<T> findAll() {
		return baseDao.findAll();
	}


	public List<T> findObjects(HqlHelper hqlHelper) {
		return baseDao.findObjects(hqlHelper);
	}

	public PageBean getPageBean(HqlHelper hqlHelper, int pageNo, int pageSize) {
		return baseDao.getPageBean(pageNo,pageSize, hqlHelper);
	}


	public List<T> getByIds(Integer[] ids) {
		
		return  baseDao.getByIds(ids);
	}

	public List<T> findObjectsBysql(String sql, Class<T> classz) {
		// TODO Auto-generated method stub
		return baseDao.findObjectsBysql(sql, classz);
	}

	public T findObjectBysql(String sql, Class<T> classz) {
		// TODO Auto-generated method stub
		 return baseDao.findObjectBysql(sql, classz);
	}

	public List<Map<String, Object>> findObjectsBysql(String sql,
			Object... para) {
		// TODO Auto-generated method stub
		return baseDao.findObjectsBysql(sql, para);
	}

	public Map<String, Object> findObjectBysql(String sql, Object... para) {
		// TODO Auto-generated method stub
		return baseDao.findObjectBysql(sql, para);
	}


}
