<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
  <head>
    <title>Role Rights</title>
    
  </head>
  
  <body>
   <p>
     <h3> Manage role's rights</h3>
    
   </p>
   <div>
     <form:form method="post" class="yform" commandName="userRolesWapper" action="${ctx}/s3/authorization/save-user-roles">
     
     <table>
      
       <tr>
         
         <td>Role ID</td>
         <td>Role Name</td>
         <td>Role Code</td>
         <td>Role Description</td>
         <td>Manage Role Rights</td>
       </tr>
       <c:forEach items="${roles}" var="role">
       <tr>
         <td>${role.id}</td>
         
	     <td>${role.roleName}</td>
	     <td>${role.roleCode}</td>
	     <td>${role.id}</td>
	     <td></td>
       </tr>
       </c:forEach>
       <tr>
         <td>
         	<div class="type-button">
              <input type="button" value="button" id="button1" name="button1" />
              <input type="reset" value="reset" class="reset" id="reset" name="reset" />
              <input type="submit" value="Save Changes"  class="submit" id="submit" name="submit" />
            </div>
         </td>
       </tr>
     </table>
     
     </form:form>
   </div>
    
  </body>
</html>
