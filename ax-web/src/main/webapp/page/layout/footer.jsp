<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="org.springframework.security.core.context.*" %>

<%@ page import="org.springframework.security.core.Authentication" %>
<%@ page import="org.springframework.security.core.GrantedAuthority" %>
<%@ include file="/page/common/taglibs.jsp"%>
<div  class="container">
	<footer class="footer">
	        <p class="pull-right"><a href="#">Back to top</a></p>
	        <p>Designed and built with all the love in the world @Soar</p>
	        <p>All rights reserved. @2012 Powerd by AX</p>
	</footer>
	
	
	<div>
	
	   
	
	  <%--
                Object ob =  request.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
                if(null != ob){
                  SecurityContext se = (SecurityContext)ob;
           
                se.getAuthentication();
           
                   out.print("SE::::::::::"+  se.getAuthentication().getPrincipal());
                   
                   
                    out.print("-----------------------------------------------------------------------------------" );
                }
           
           
           
                
       --%>
	</div>
</div>
