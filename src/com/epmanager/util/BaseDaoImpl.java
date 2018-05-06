package com.epmanager.util;

import java.lang.reflect.ParameterizedType;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.*;
import org.hibernate.transform.ResultTransformer;
import org.hibernate.transform.Transformers;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;









import freemarker.template.Configuration;

/**
 * 数据访问接口的实现
 * 
 * @author java_one
 * 
 * @param <T>
 */
@Transactional
public abstract class BaseDaoImpl<T> implements BaseDao<T> {
	@Resource
	private SessionFactory sessionFactory;
	private Class<T> clazz;

	public BaseDaoImpl() {
		// 使用反射技术得到T的真实类型
		ParameterizedType pt = (ParameterizedType) this.getClass()
				.getGenericSuperclass(); // 获取当前new的对象的 泛型的父类 类型
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0]; // 获取第一个类型参数的真实类型
		/* System.out.println("clazz ---> " + clazz); */
	}

	/**
	 * 获取当前可用的Session
	 * 
	 * @return
	 */
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(T entity) {
		getSession().save(entity);
	}

	public void update(T entity) {
		getSession().update(entity);
	}

	public void delete(Integer id) {
		Object obj = getById(id);
		if (obj != null) {
			getSession().delete(obj);
		}
	}

	public T getById(Integer id) {
		if (id == null) {
			return null;
		} else {
			return (T) getSession().get(clazz, id);
		}
	}

	public List<T> getByIds(Integer[] ids) {
		if (ids == null || ids.length == 0) {
			return Collections.EMPTY_LIST;
		} else {
			return getSession().createQuery(//
					"FROM " + clazz.getSimpleName() + " WHERE id IN (:ids)")//
					.setParameterList("ids", ids)//
					.list();
		}
	}

	public List<T> findAll() {
		return getSession().createQuery(//
				"FROM " + clazz.getSimpleName())//
				.list();
	}

	public PageBean getPageBean(int pageNum, int Pagesize, HqlHelper hqlHelper) {
		int pageSize = Pagesize;
		List<Object> parameters = hqlHelper.getParameterList();

		// 查询数据列表
		Query query = getSession().createQuery(hqlHelper.getQueryListHql()); // 生成查询对象
		if (parameters != null) {// 设置参数
			for (int i = 0; i < parameters.size(); i++) {
				query.setParameter(i, parameters.get(i));
			}
		}
		query.setFirstResult((pageNum - 1) * pageSize);
		query.setMaxResults(pageSize);
		List list = query.list(); // 执行查询

		// 查询总记录数
		Query countQuery = getSession().createQuery(
				hqlHelper.getQueryCountHql()); // 生成查询对象
		if (parameters != null) {// 设置参数
			for (int i = 0; i < parameters.size(); i++) {
				countQuery.setParameter(i, parameters.get(i));
			}
		}
		Long count = (Long) countQuery.uniqueResult(); // 执行查询

		return new PageBean(pageNum, pageSize, count.intValue(), list);
	}
	public List<T> findObjects(HqlHelper hqlHelper) {
		Query query = getSession().createQuery(hqlHelper.getQueryListHql());
		List<Object> parameters = hqlHelper.getParameterList();
		if(parameters != null){
			for(int i = 0; i < parameters.size(); i++){
				query.setParameter(i, parameters.get(i));
			}
		}
		return query.list();
	}

	public List<T> findObjectsBysql(String sql, Class<T> classz) {
		return getSession().createSQLQuery(sql).addEntity(classz).list();
	}

	public T findObjectBysql(String sql, Class<T> classz) {
		SQLQuery sqlQuery=getSession().createSQLQuery(sql).addEntity(classz);
		return (T) (sqlQuery.list().size()>0?sqlQuery.list().get(0):null);
	}

	public List<Map<String, Object>> findObjectsBysql(String sql,
			 Object... para) {
		SQLQuery sqlQuery=getSession().createSQLQuery(sql);
		for(int i=0;i<para.length;i++){
			sqlQuery.setParameter(i, para[i]);
		}
		sqlQuery.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		return sqlQuery.list();
	}

	public Map<String, Object> findObjectBysql(String sql, 
			Object... para) {
		SQLQuery sqlQuery=getSession().createSQLQuery(sql);
		for(int i=0;i<para.length;i++){
			sqlQuery.setParameter(i, para[i]);
		}
		sqlQuery.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		return (Map<String, Object>) (sqlQuery.list().size()>0?sqlQuery.list().get(0):null);
	}
	
	
	
	public void deleteBysql(String sql, Object... para) {
		SQLQuery sqlQuery=getSession().createSQLQuery(sql);
		for(int i=0;i<para.length;i++){
			sqlQuery.setParameter(i, para[i]);
		}
		sqlQuery.executeUpdate();
	}

	public PageBean getPageBeanBySql(String sql, int pageNum, int Pagesize,Object... para) {
		int pageSize = Pagesize;

		// 查询数据列表
		SQLQuery query = getSession().createSQLQuery(sql); // 生成查询对象
		if (para != null) {// 设置参数
			for (int i = 0; i < para.length ;i++) {
				query.setParameter(i, para[i]);
			}
		}
		query.setFirstResult((pageNum - 1) * pageSize);
		query.setMaxResults(pageSize);
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		
		System.out.println(query.getQueryString());
		
		List list = query.list(); // 执行查询

		// 查询总记录数
		SQLQuery countQuery = getSession().createSQLQuery(
				sql); // 生成查询对象
		if (para != null) {// 设置参数
			for (int i = 0; i < para.length; i++) {
				countQuery.setParameter(i, para[i]);
			}
		}
		int count = countQuery.list().size(); // 执行查询

		return new PageBean(pageNum, pageSize, count, list);
	}
}
