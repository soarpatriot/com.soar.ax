<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>My JSP 'index.jsp' starting page</title>
    
	
  </head>
  
  <body>
      <p>Role information</p>
      <table>
         <tr>
           <th>id</th>
           <th>loginName</th>
           <th>password</th>
         </tr>
         <tr>
            <td>${role.id}</td>
            <td>${role.roleName}</td>
            <td>${role.roleCode}</td>
         </tr>
      </table>
  </body>
</html>
