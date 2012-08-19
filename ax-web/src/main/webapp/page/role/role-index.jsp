<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
  <head>
    
    <script type="text/javascript">
       
      
    </script>
  </head>
  
  <body>
    
    <table class="table table-bordered table-striped"> 
        <thead>
	        <tr>
	            <th>id</th>
	            <th>Role Name</th>
	            <th>Role Code</th>
	        </tr>
        </thead>
       <c:forEach items="${roles}" var="role" >
           <tr>
	            <td>${role.id}</td>
	            <td>${role.roleName}</td>
	            <td>${role.roleCode}</td>
                <td><a href="${ctx}/roles/${role.id}">show</a>
                    <a href="${ctx}/roles/${role.id}/edit">edit</a> 
                </td>
                <td>
                    <form action="roles/${role.id}" method="post">
                            <input type="hidden" name="_method" value="delete">
                            <input type="submit" value="Delete" />
                     </form>
                </td>
        </tr>
       </c:forEach>
        
      
    </table> 
    <p>
      <a href="${ctx}/roles/new">Create New User</a>
    </p>
  </body>
</html>
