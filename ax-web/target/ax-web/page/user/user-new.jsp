<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form:form method="post" commandName="user" action="/ax-web/spring/users">
        <table>
				<tr>
				<td>First Name:</td>
				<td><form:input path="loginName" /></td>
				</tr>
				<tr>
				<td>Last Name:</td>
				<td><form:input path="password" /></td>
				</tr>
				<tr>
				<td colspan="2">
				<input type="submit" value="Save Changes" />
				</td>
				</tr>
		</table>
    </form:form>
  </body>
</html>
