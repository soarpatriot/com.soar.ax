<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
	<head>
	   <title>Right Display</title>
	   <script type="text/javascript">
	       
	       $(function(){
	          
	          $("#add-right-btn").click(function(){
	             window.location.href="${ctx}/right/new";
	          })
	       })
	    </script>
	</head>
  
	<body>

		<section id="tabs">

		<div class="row">

			<div class="span12 columns">
				<h2>
					Rights Management
				</h2>
				<p>
					Click the tabs below to switch to the different management style
				</p>
				<ul id="tab" class="nav nav-tabs">
					<li class="active">
						<a href="#home" data-toggle="tab">Home</a>
					</li>
					<li>
						<a href="#profile" data-toggle="tab">Profile</a>
					</li>

				</ul>
				<div id="myTabContent" class="tab-content">
					<div class="tab-pane fade in active" id="home">
					    <p>
					      <input type="button" id="add-right-btn" name="add-right" class="btn" value="Add Right"/> 
					    </p>
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>
										Right Type
									</th>
									<th>
										Resource Type
									</th>
									<th>
										Resource ID
									</th>
									<th>
										Right Description
									</th>
									<th>
									    Right Space
									</th>
								
									
								</tr>
							</thead>
							<tbody>
							   <c:forEach var="right" items="${rights}" >
							     <tr>
									<td>
									 	${right.rightType}
									</td>
									<td>
										${right.resourceType}
									</td>
									<td>
										${right.resourceIdentity}
									</td>
									<td>
										${right.rightDescription}
									</td>
									<td>
										${right.rightSpace.name}
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
					<div class="tab-pane fade" id="profile">
						<section id="collapse">

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
												Anim pariatur cliche reprehenderit, enim eiusmod high life
												accusamus terry richardson ad squid. 3 wolf moon officia
												aute, non cupidatat skateboard dolor brunch. Food truck
												quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor,
												sunt aliqua put a bird on it squid single-origin coffee
												nulla assumenda shoreditch et. Nihil anim keffiyeh
												helvetica, craft beer labore wes anderson cred nesciunt
												sapiente ea proident. Ad vegan excepteur butcher vice lomo.
												Leggings occaecat craft beer farm-to-table, raw denim
												aesthetic synth nesciunt you probably haven't heard of them
												accusamus labore sustainable VHS.
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
												Anim pariatur cliche reprehenderit, enim eiusmod high life
												accusamus terry richardson ad squid. 3 wolf moon officia
												aute, non cupidatat skateboard dolor brunch. Food truck
												quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor,
												sunt aliqua put a bird on it squid single-origin coffee
												nulla assumenda shoreditch et. Nihil anim keffiyeh
												helvetica, craft beer labore wes anderson cred nesciunt
												sapiente ea proident. Ad vegan excepteur butcher vice lomo.
												Leggings occaecat craft beer farm-to-table, raw denim
												aesthetic synth nesciunt you probably haven't heard of them
												accusamus labore sustainable VHS.
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
												Anim pariatur cliche reprehenderit, enim eiusmod high life
												accusamus terry richardson ad squid. 3 wolf moon officia
												aute, non cupidatat skateboard dolor brunch. Food truck
												quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor,
												sunt aliqua put a bird on it squid single-origin coffee
												nulla assumenda shoreditch et. Nihil anim keffiyeh
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
					  </section>
					</div>
					
				</div>


			</div>

          
		</div>
		</section>
	</body>
</html>
