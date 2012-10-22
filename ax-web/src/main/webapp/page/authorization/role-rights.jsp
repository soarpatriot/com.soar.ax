<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
  <head>
    <title>Role Rights</title>
    <script type="text/javascript">
       $(function(){
          $("#change-role-right-btn").click(function(){
             $("#change-role-rights-form").submit();
          })
       })
    </script>
  </head>
  
  <body>
   <h3>Manage Role's Rights</h3>
   <div>
     
   </div>
   <div class="tab-pane fade" id="profile">
		<section id="collapse">
        
		<div class="row">

			<div class="span12 columns">
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
			                    <a href="${ctx}/authorization/${role.id}/role-rights-edit">Edit Role's Right</a>
			                </td>
			               
			        </tr>
			       </c:forEach>
			        
			      
			    </table> 
              
			</div>

		</div>
		<div class="form-actions">
            <input type="button" id="change-role-right-btn" class="btn btn-primary" value="确定"/>
            <button class="btn">Cancel</button>
		</div>
		
	  </section>
	</div>
  </body>
</html>
