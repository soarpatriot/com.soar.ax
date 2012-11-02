/**
 * 
 */
package com.soar.ax.service.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soar.ax.dao.HibernateGeneralDao;
import com.soar.ax.dao.MyBatisGeneralDao;
import com.soar.ax.wapper.MyGrantedAuthority;

/**
 * @author liuhb7
 *
 */
@Service("myAuthenticationProvider")
@Transactional
public class MyAuthenticationProvider<T> extends AbstractUserDetailsAuthenticationProvider{
	
	@Autowired
	protected HibernateGeneralDao<T> hibernateGeneralDao;
    
    @Autowired
    protected MyBatisGeneralDao myBatisGeneralDao;
    
	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
			UsernamePasswordAuthenticationToken authentication)
			throws AuthenticationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected UserDetails retrieveUser(String username,
			UsernamePasswordAuthenticationToken authentication)
			throws AuthenticationException {
		 Collection<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
	     GrantedAuthority ga = new MyGrantedAuthority();
	     String pass = authentication.getCredentials().toString();
	     
	     com.soar.ax.entity.authrization.User user = findUserByUserName(username, pass);
		  //得到用户的权限
		  auths.add(ga);
		 
		  //String password = "12456";
		  
		  return new User( username, user.getPassword(), user.getAuthorities());
		
	}
	
	public com.soar.ax.entity.authrization.User findUserByUserName(String username,String password){
		  String queryString = "from User u where u.username=? and u.password=?";
		  List<com.soar.ax.entity.authrization.User> users = hibernateGeneralDao.getHibernateTemplate().find(queryString, new String[]{username,password});
		  if(null != users && users.size()>0){
			  return users.get(0);
		  }
		  return null;
		  
	}

	public HibernateGeneralDao<T> getHibernateGeneralDao() {
		return hibernateGeneralDao;
	}

	public void setHibernateGeneralDao(HibernateGeneralDao<T> hibernateGeneralDao) {
		this.hibernateGeneralDao = hibernateGeneralDao;
	}

	public MyBatisGeneralDao getMyBatisGeneralDao() {
		return myBatisGeneralDao;
	}

	public void setMyBatisGeneralDao(MyBatisGeneralDao myBatisGeneralDao) {
		this.myBatisGeneralDao = myBatisGeneralDao;
	}

	
}
