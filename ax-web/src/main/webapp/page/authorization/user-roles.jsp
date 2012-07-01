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
     <form:form method="post" commandName="userRolesWapper" action="${ctx}/authorization/save-user-roles">
     <form:hidden path="userId" value="${userId}"/>
     <table class="table table-bordered table-striped">
       <thead>
       <tr>
         <td>Check</td>
         <td>Role ID</td>
         <td>Role Name</td>
         <td>Role Code</td>
         <td>Role Rights</td>
       </tr>
       </thead>
       
       <tbody>
      
       <c:forEach items="${userRoles}" var="roleCheck">
       <tr>
         <td><form:checkbox path="roleIds" checked="${roleCheck.checked}" value="${roleCheck.role.id}"/>${roleCheck.role.id}</td>
         <td>${roleCheck.role.id}</td>
	     <td>${roleCheck.role.roleName}</td>
	     <td>${roleCheck.role.roleCode}</td>
	     <td><a href="${ctx}/authorization/${roleCheck.role.id}/role-rights-edit">manage role right's</a>
       </tr>
       </c:forEach>
       </tbody>
       
      
     </table>
     <div class="type-button">
              <input class="button" type="button" value="button" id="button1" name="button1" />
              <input class="button" type="reset" value="reset" class="reset" id="reset" name="reset" />
              <input class="button" type="submit" value="Save Changes"  class="submit" id="submit" name="submit" />
            </div>
     </form:form>
   </div>
    
  </body>
</html>
