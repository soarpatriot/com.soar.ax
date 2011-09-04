/**
 * Copyright (c) 2011, Lenovo Group, Ltd. All rights reserved.
 */
package com.soar.ax.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soar.ax.dao.HibernateGeneralDao;
import com.soar.ax.dao.MyBatisGeneralDao;

/**
 * <p>
 * 
 * <dl>
 * <dt><b>Examples:</b></dt>
 * <p>
 * <pre>
 * 
 * </pre>
 * 
 * <p><dt><b>Thread Safety:</b></dt> 
 * <dd>
 * 	<b>NOT-THREAD-SAFE</b> and <b>NOT-APPLICABLE</b> (for it will never be used on multi-thread occasion.)
 * </dd>
 * 
 * <p><dt><b>Serialization:</b></dt>
 * <dd>
 * 	<b>NOT-SERIALIIZABLE</b> and <b>NOT-APPLICABLE</b> (for it have no need to be serializable.)
 * </dd>
 * 
 * <p><dt><b>Design Patterns:</b></dt>
 * <dd>
 * 	
 * </dd>
 * 
 * <p><dt><b>Change History:</b></dt>
 * <dd>
 * 	Date		Author		Action
 * </dd>
 * <dd>
 * 	Apr 10, 2011	Soar	Create the class
 * </dd>
 * 
 * </dl>
 * @author	Soar
 * @see			
 * @see			
 */
@Service("baseService")
@Transactional
public class BaseService<T> {
	
	    @Autowired
		protected HibernateGeneralDao hibernateGeneralDao;
	    
	    @Autowired
	    protected MyBatisGeneralDao myBatisGeneralDao;
	    
	    
	    public T getEntityById(Class<T> classType, Serializable id){
	    	return hibernateGeneralDao.getHibernateTemplate().get(classType, id);  
	    }
	    
	    @Transactional
	    public Serializable save(T t){
	    	return hibernateGeneralDao.getHibernateTemplate().save(t);
	    }
	    
	    public void saveOrUpdate(T t){
	    	 hibernateGeneralDao.getHibernateTemplate().saveOrUpdate(t);
	    }
	    
	    public List<T> getAll(T t){
	    	return (List<T>)hibernateGeneralDao.getHibernateTemplate().loadAll(t.getClass());
	    }
	    
	    @Transactional
	    public void delete(T t){
	    	hibernateGeneralDao.getHibernateTemplate().delete(t);  
	    }
	    
	    @Transactional
	    public List<T> find(String queryString){
	    	return (List<T>)hibernateGeneralDao.getHibernateTemplate().find(queryString);
	    }
	    
	    public void deleteAll(Collection<T> entities){
	    	hibernateGeneralDao.getHibernateTemplate().deleteAll(entities);
	    }

		public HibernateGeneralDao getHibernateGeneralDao() {
			return hibernateGeneralDao;
		}

		public void setHibernateGeneralDao(HibernateGeneralDao hibernateGeneralDao) {
			this.hibernateGeneralDao = hibernateGeneralDao;
		}

		public MyBatisGeneralDao getMyBatisGeneralDao() {
			return myBatisGeneralDao;
		}

		public void setMyBatisGeneralDao(MyBatisGeneralDao myBatisGeneralDao) {
			this.myBatisGeneralDao = myBatisGeneralDao;
		}
}
