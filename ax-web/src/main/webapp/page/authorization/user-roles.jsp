<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
  <head>
   
    <title>User Roles</title>
    <script type="text/javascript">
      $(function(){
          
      });
    </script>
  </head>
  
  <body>
   <p>
     <h3> Manage user's role</h3>
    
   </p>
   <div>
     <form:form method="post" class="yform" commandName="userRolesWapper" action="${ctx}/s3/authorization/save-user-roles">
     <form:hidden path="userId" value="${userId}"/>
     <table>
      
       <tr>
         <td>Check</td>
         <td>Role ID</td>
         <td>Role Name</td>
         <td>Role Code</td>
       
       </tr>
       <c:forEach items="${userRoles}" var="roleCheck">
       <tr>
         <td><form:checkbox path="roleIds" checked="${roleCheck.checked}" value="${roleCheck.role.id}"/>${roleCheck.role.id}</td>
         <td>${roleCheck.role.id}</td>
	     <td>${roleCheck.role.roleName}</td>
	     <td>${roleCheck.role.roleCode}</td>
       </tr>
       </c:forEach>
       <tr>
         <td>
         	<div class="type-button">
              <input class="button" type="button" value="button" id="button1" name="button1" />
              <input class="button" type="reset" value="reset" class="reset" id="reset" name="reset" />
              <input class="button" type="submit" value="Save Changes"  class="submit" id="submit" name="submit" />
            </div>
         </td>
       </tr>
     </table>
     
     </form:form>
   </div>
    
  </body>
</html>
