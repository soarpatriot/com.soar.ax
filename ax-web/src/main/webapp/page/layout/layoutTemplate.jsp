<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My Site -<decorator:title default="Welcome! " /></title>
    <decorator:head></decorator:head>
  </head>
  <body>
 	 	<p><font color="red">Ax web</font></p>
    	<decorator:body></decorator:body>
    	<p><font color="red">Ax footer</font></p>
  </body>
</html>
