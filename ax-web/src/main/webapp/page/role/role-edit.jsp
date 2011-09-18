<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    <title>User Create</title>
    
	
  </head>
  
  <body>
    <form:form method="post" commandName="role" action="/ax-web/s3/roles">
        <table>
				<tr>
				<td>Role Name:</td>
				<td><form:input path="roleName" /></td>
				</tr>
				<tr>
				<td>Role Code:</td>
				<td><form:input path="roleCode" /></td>
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
