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
        
        <form:form id="change-role-rights-form" action="${ctx}/authorization/role-rights" commandName="roleRightsForm" method="post">
        <form:hidden path="role.id"/>
		<div class="row">

			<div class="span12 columns">

           
				<div class="accordion" id="accordion2">
					<div class="accordion-group">
						<div class="accordion-heading">
							<a class="accordion-toggle" data-toggle="collapse"
								data-parent="#accordion2" href="#collapseOne">
								Collapsible Group Item #1 </a>
						</div>
						<div id="collapseOne" class="accordion-body collapse in">
							<div class="accordion-inner">
							    <!-- 
							  <form:checkboxes items="${roleRightsForm.rights}" value="" path="rights" />
							    
							     -->
								
							</div>
						</div>
					</div>
					<div class="accordion-group">
						<div class="accordion-heading">
							<a class="accordion-toggle" data-toggle="collapse"
								data-parent="#accordion2" href="#collapseTwo">
								Collapsible Group Item #2 </a>
						</div>
						<div id="collapseTwo" class="accordion-body collapse">
							<div class="accordion-inner">
								<c:forEach var="right" items="${roleRightsForm.rights}">
								  <form:checkbox  path="roleRights" value="${right.id}"/>${right.rightType}
								</c:forEach>
								
							</div>
						</div>
					</div>
					<div class="accordion-group">
						<div class="accordion-heading">
							<a class="accordion-toggle" data-toggle="collapse"
								data-parent="#accordion2" href="#collapseThree">
								Collapsible Group Item #3 </a>
						</div>
						<div id="collapseThree" class="accordion-body collapse">
							<div class="accordion-inner">
								
								helvetica, craft beer labore wes anderson cred nesciunt
								sapiente ea proident. Ad vegan excepteur butcher vice lomo.
								Leggings occaecat craft beer farm-to-table, raw denim
								aesthetic synth nesciunt you probably haven't heard of them
								accusamus labore sustainable VHS.
							</div>
						</div>
					</div>
				</div>



			</div>

		</div>
		<div class="form-actions">
            <input type="button" id="change-role-right-btn" class="btn btn-primary" value="确定"/>
            <button class="btn">Cancel</button>
		</div>
		</form:form>
	  </section>
	</div>
  </body>
</html>
