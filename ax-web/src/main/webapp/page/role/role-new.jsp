<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    <title>User Create</title>
    
	
  </head>
  
  <body>
    <form:form method="post" commandName="role" action="${ctx}/roles">
        <table>
				<tr>
				<td>Role Name1:</td>
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
