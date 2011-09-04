<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ include file="/common/taglibs.jsp"%>
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
    User list. <br>
    
    <table>
        <tr>
            <th>id</th>
            <th>loginName</th>
            <th>password</th>
             <th>operation</th>
              <th>delete</th>
        </tr>
        
       <c:forEach items="${users}" var="user" >
           <tr>
	            <td>${user.id}</td>
	            <td>${user.loginName}</td>
	            <td>${user.password}</td>
                <td><a href="${ctx}/s3/users/${user.id}">show</a>
                    <a href="${ctx}/s3/users/${user.id}/edit">edit</a> 
                </td>
                <td>
                    <form action="users/${user.id}" method="post">
                            <input type="hidden" name="_method" value="delete">
                            <input type="submit" value="Delete" />
                     </form>
                </td>
        </tr>
       </c:forEach>
        
      
    </table> 
    <p>
      <a href="${ctx}/s3/users/new">Create New User</a>
    </p>
  </body>
</html>
