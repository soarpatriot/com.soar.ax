<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
  <head>
    <title>Authorization Page</title>
  </head>
  
  <body>
   
   <div>
     <table class="table table-bordered table-striped">
       <thead>
       <tr>
         <td>User ID</td>
         <td>User Name</td>
         <td>Email</td>
         <td>Password</td>
         <td>Modify Role</td>
       </tr>
       </thead>
       
       <tbody>
       <c:forEach items="${users}" var="user">
       
       <tr>
         <td>${user.id}</td>
	     <td>${user.username}</td>
	     <td>${user.email}</td>
	     <td>${user.password}</td>
         <td>
           <c:forEach items="${user.roles}" var="role">
              ${role.roleName},
           </c:forEach>
         </td>
         <td><a href="${ctx}/authorization/${user.id}/user-roles">manage user's roles</a></td>     
       </tr>
       </c:forEach>
       </tbody>
     </table>
   </div>
    
   
     
  </body>
</html>
