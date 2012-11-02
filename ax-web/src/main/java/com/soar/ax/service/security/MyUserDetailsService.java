/**
 * 
 */
package com.soar.ax.service.security;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.soar.ax.entity.authrization.SecurityResource;
import com.soar.ax.service.BaseService;

/**
 * @author liuhb7
 *
 */
@Service("myUserDetailsService")
public class MyUserDetailsService extends BaseService implements UserDetailsService{
	 
	 @Override
	 public UserDetails loadUserByUsername(String username)
	   throws UsernameNotFoundException, DataAccessException {
	  
		 com.soar.ax.entity.authrization.User user = findUserByUserName(username);
		 if (null == user) {
	            throw new UsernameNotFoundException(username);
	     }
		 
		 //findUserSecurityResourceByUserName(username);
	     /*Collection<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
	     GrantedAuthority ga = new MyGrantedAuthority();
	  
		  //得到用户的权限
		  auths.add(ga);*/
		 //SecurityContextPersistenceFilter
		 //${SPRING_SECURITY_CONTEXT}
		 //(SecurityContext)SecurityContextHolder.getContext().getAuthentication().get
		 return new User(user.getUsername(),user.getPassword(),user.getAuthorities());
	 }
	 
	 public com.soar.ax.entity.authrization.User findUserByUserName(String username){
		 String queryString = "from User u where u.username=?";
		  List<com.soar.ax.entity.authrization.User> users = hibernateGeneralDao.getHibernateTemplate().find(queryString, new String[]{username});
		  if(null != users && users.size()>0){
			  return users.get(0);
		  }
		  return null;
	 }
	 
	 public com.soar.ax.entity.authrization.User findUserByUserName(String username,String password){
		  String queryString = "from User u where u.username=? and u.password=?";
		  List<com.soar.ax.entity.authrization.User> users =null;//= hibernateGeneralDao.getHibernateTemplate().find(queryString, new String[]{username,password});
		  if(null != users && users.size()>0){
			  return users.get(0);
		  }
		  return null;
	 }
	 
	 public List<SecurityResource> findUserSecurityResourceByUserName(String username){
		  String queryString = "select sr.resourceIdentity from SecurityResource sr inner join  sr.right r inner join  r.roles role inner join  role.users u where u.username=?)";
		  List<SecurityResource> securityResources = hibernateGeneralDao.getHibernateTemplate().find(queryString, new String[]{username});
		  
		  return securityResources;
	 }
}
