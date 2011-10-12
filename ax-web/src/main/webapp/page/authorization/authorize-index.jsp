<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
  <head>
    <title>Authorization Page</title>
  </head>
  
  <body>
   
   <div>
     <table>
       <tr>
         <td>User Name</td>
         <td>Login Name</td>
         <td>Email</td>
         <td>Own Role</td>
         <td>Modify Role</td>
       </tr>
       <c:forEach items="${users}" var="user">
       <tr>
         <td>${user.id}</td>
	     <td>${user.loginName}</td>
	     <td>${user.password}</td>
         <td>
           <c:forEach items="${user.roles}" var="role">
              ${role.roleName},
           </c:forEach>
         </td>
         <td><a href="${ctx}/s3/authorization/${user.id}/user-roles">manage user's roles</a></td>     
       </tr>
       </c:forEach>
     </table>
   </div>
    
   
     
  </body>
</html>
