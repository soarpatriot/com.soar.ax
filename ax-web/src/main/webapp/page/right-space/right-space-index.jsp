<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
	<head>
	   <title>Right Space Display</title>
	   <script type="text/javascript">
	       
	       $(function(){
	          
	          $("#add-right-space-btn").click(function(){
	             window.location.href="${ctx}/right-space/new";
	          })
	          $("a[name='delete-right-space-btn']").click(function(){
	             
	             var aForm = $(this).parent();
	             $('#my-modal').modal('show');
	             $('#model-confirm-btn').click(function(){
	                 aForm.submit();
	             });
	             $('#model-close-btn').click(function(){
	                 $('#my-modal').modal('hide');
	             })
	             //
	          })
	       })
	    </script>
	</head>
  
	<body>
        <p>
          ${message}
        </p>
		<section id="tabs">

		<div class="row">

			<div class="span12 columns">
				<h2>
					Rights Space Management
				</h2>
				
				
				<div id="myTabContent" class="tab-content">
					<div class="tab-pane fade in active" id="home">
					    <p>
					      <input type="button" id="add-right-space-btn" name="add-right" class="btn" value="Add Right Space"/> 
					    </p>
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>
										Right Space
									</th>
									<th>
										Right Space Description
									</th>
									<th>
										Right Code
									</th>
									<th>
										Operation
									</th>
								</tr>
							</thead>
							<tbody>
							    <c:forEach var="rightSpace" items="${rightSpaces}" >
							        <tr>
										<td>
											${rightSpace.name}
										</td>
										<td>
											${rightSpace.description}
										</td>
										<td>
											${rightSpace.code}
										</td>
										<td>
											<a href="${ctx}/right-space/${rightSpace.id}/edit">edit</a>
											<form:form id="right-form" action="${ctx}/right-space/${rightSpace.id}" method="delete">
											  
											   <input type="hidden" value="${rightSpace.id}"/>
											   <a name="delete-right-space-btn" href="#delete-right-space">delete</a>
											</form:form>

										</td>
									</tr>
							    </c:forEach>
								
								

							</tbody>
						</table>


						<div class="pagination">

							<ul>

								<li>
									<a href="#">Prev</a>
								</li>

								<li class="active">

									<a href="#">1</a>
								</li>

								<li>
									<a href="#">2</a>
								</li>

								<li>
									<a href="#">3</a>
								</li>

								<li>
									<a href="#">4</a>
								</li>

								<li>
									<a href="#">Next</a>
								</li>

							</ul>

						</div>
					</div>
					

							
				</div>


			</div>


		</div>
      </section>
      
      <div class="modal hide fade in" id="my-modal">
        <div class="modal-header">    
        <a class="close" data-dismiss="modal">×</a>
        <h3>Operation Confirm</h3></div>
        <div class="modal-body">
        <p>Do you really want to do thing?</p></div><div class="modal-footer">
        <a id="model-close-btn" href="#" class="btn">Close</a>
        <a id="model-confirm-btn" href="#" class="btn btn-primary">Confirm</a></div>
      </div>
	</body>
</html>
