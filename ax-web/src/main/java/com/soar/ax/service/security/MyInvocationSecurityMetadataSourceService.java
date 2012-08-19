/**
 * 
 */
package com.soar.ax.service.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.util.AntPathRequestMatcher;
import org.springframework.security.web.util.RequestMatcher;
import org.springframework.stereotype.Service;

import com.soar.ax.constants.ResourceType;
import com.soar.ax.entity.authrization.Right;
import com.soar.ax.service.BaseService;


/**
 * @author liuhb7
 *
 */
@Service("mySecurityMetadataSource")
public class MyInvocationSecurityMetadataSourceService extends BaseService implements FilterInvocationSecurityMetadataSource{
	
	 private RequestMatcher urlMatcher;

	 private static Map<String, Collection<ConfigAttribute>> resourceMap = new HashMap<String, Collection<ConfigAttribute>>();;

	 public MyInvocationSecurityMetadataSourceService() {
	     loadResourceDefine();
	 }

	 private void loadResourceDefine() {
	  
	  /**//*
	   * 应当是资源为key， 权限为value。 资源通常为url， 权限就是那些以ROLE_为前缀的角色。 一个资源可以由多个权限来访问。
	   * sparta
	   */
	  
	  /*Collection<ConfigAttribute> atts = new ArrayList<ConfigAttribute>();
	  ConfigAttribute ca = new SecurityConfig("AU_WORK");
	  atts.add(ca);
	  resourceMap.put("/work/**", atts);*/
	  /*for (String auth : query) {
	   ConfigAttribute ca = new SecurityConfig(auth);

	   

	   for (String res : query1) {
	    String url = res;
	    
	    
	     * 判断资源文件和权限的对应关系，如果已经存在相关的资源url，则要通过该url为key提取出权限集合，将权限增加到权限集合中。
	     * sparta
	     
	    if (resourceMap.containsKey(url)) {

	     Collection<ConfigAttribute> value = resourceMap.get(url);
	     value.add(ca);
	     resourceMap.put(url, value);
	    } else {
	     Collection<ConfigAttribute> atts = new ArrayList<ConfigAttribute>();
	     atts.add(ca);
	     resourceMap.put(url, atts);
	    }

	   }

	  }*/


   }
	 @Override
	 public Collection<ConfigAttribute> getAllConfigAttributes() {
		 
		 String hql = "from Right r where r.resourceType='URL'";
		 List<Right> rights = find(hql);
		 
		 Collection<ConfigAttribute> atts = new ArrayList<ConfigAttribute>();
		 for(Right r : rights){
			
			 ConfigAttribute ca = new SecurityConfig(String.valueOf(r.getId()));
			 atts.add(ca);
			 resourceMap.put(r.getResourceIdentity(),atts);

		 }
		 
		 
	  return atts;
	 }

	 // 根据URL，找到相关的权限配置。
	 @Override
	 public Collection<ConfigAttribute> getAttributes(Object object)
	   throws IllegalArgumentException {
      
		 getAllConfigAttributes();	 
	  // object 是一个URL，被用户请求的url。
	  String url = ((FilterInvocation) object).getRequestUrl();
	  
	        int firstQuestionMarkIndex = url.indexOf("?");

	        if (firstQuestionMarkIndex != -1) {
	            url = url.substring(0, firstQuestionMarkIndex);
	        }

	  Iterator<String> ite = resourceMap.keySet().iterator();
      
	  urlMatcher = new AntPathRequestMatcher(url);
	  HttpServletRequest request = ((FilterInvocation) object).getHttpRequest();
	  while (ite.hasNext()) {
	   String resURL = ite.next();
	   
	   if (urlMatcher.matches(request)) {

	      return resourceMap.get(resURL);
	   }
	  }
      return null;
	 }

	 @Override
	 public boolean supports(Class<?> arg0) {

	  return true;
	 }

}
