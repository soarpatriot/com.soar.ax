<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
  <head>
    <title>Right Create</title>
    <script type="text/javascript">
      $(function(){
        $("#my-modal").modal({ 
          keyboard: false,
          show:false
        })
        $("#model-close-btn").click(function(){
          $('#my-modal').modal('hide');
        })
        
        $("#choose-right-space-btn").click(function(){
          $('#my-modal').modal('show');
          
        })
        $("input[name='space-select-radio']").click(function(){
          $("input[name='space-select-radio']").removeAttr("checked");//
          $(this).attr("checked",true);
          
         
        })
        $("#model-confirm-btn").click(function(){
          
          var $checkedBox = $("input[name='space-select-radio'][checked]");
          
          if($checkedBox === null || $checkedBox.length === 0){
            alert("please at lease select one");
            return;
          }
          
          var spaceId = $checkedBox.attr("id");
          var spaceValue = $checkedBox.attr("value");
          $("#right-space-id").attr("value",spaceId);
          $("#right-space-text").attr("value",spaceValue);
          $('#my-modal').modal('hide');
          
        })
        
        $("#add-right-btn").click(function(){
          $("#right-form").submit();
        })
        //$('#my-modal').modal('hide');
      })
    </script>
  </head>
  
  <body>
    <div class="container">
		  <form:form id="right-form" action="${ctx}/right" method="post" commandName="right" class="form-horizontal">
		       <fieldset>
			       <legend>权限管理</legend>
	               <div id="username-group" class="control-group">
		               <label class="control-label" for="rightSpace">权限空间：</label>
		               <div class="controls">
		               <form:hidden id="right-space-id" path="rightSpace.id"/>
		               
		               <input type="text" id="right-space-text" class="input" name="rightSpaceShow" readonly="true"/>
		               <input type="button" id="choose-right-space-btn" class="btn" name="aa" value="Choose">
		               </div>
	               
	               </div>
	              
	               
	               <div id="right-type-group" class="control-group">
	               <label class="control-label" for="rightType">权限类型：</label>
	               <div class="controls">
	                 <form:input id="right-type" path="rightType"/>
	               </div>
	               </div>
	               
	               <div id="resource-type-group" class="control-group">
	               <label class="control-label" for="resourceType">资源类型：</label>
	               <div class="controls">
	                  <form:input id="resource-type" path="resourceType"/>
	               </div>
	               </div>
	               
	               <div id="right-id-group" class="control-group">
	               <label class="control-label" for="resource-identity">资源ID (或名称)：</label>
	               <div class="controls">
	                   <form:input id="resource-identity" path="resourceIdentity"/>
	                 
	               </div>
	               </div>
	               
	               <div class="form-actions">
		            <input type="button" id="add-right-btn" class="btn btn-primary" value="添加"/>
		            <button class="btn">Cancel</button>
		           </div>
               </fieldset>
		      
		  </form:form>
		</div>
		
		<div id="my-modal" class="modal hide fade in">
			<div class="modal-header">
			<a class="close" data-dismiss="modal">×</a>
			<h3>Right Space</h3>
			</div>
			<div class="modal-body">
				<h4>Right Space Instruction</h4>
				<p>Right Space is used to manage the right.For there may be lots of resource with same style or same id,
				   in case no conflict with similar resource, and I made this concept "Right Space"
				</p>
				
				<hr>
				<h4>Detail Right Space</h4>
				 
			    <c:forEach var="rightSpace" items="${rightSpaces}" varStatus="status"> 
                    
			        <div class="span4">
			          <input id="${rightSpace.id}" type="radio" name="space-select-radio" value="${rightSpace.name}">${rightSpace.name}
			        </div>
			        <c:if test="${status.count/2 == 0}">
			         <br/>
			        </c:if>
			    </c:forEach>
			    
			    
			</div>
			<div class="modal-footer">
			<a id="model-close-btn" href="#" class="btn">Close</a>
            <a id="model-confirm-btn" href="#" class="btn btn-primary">Confirm</a></div>
        </div>
        
         
			    
  </body>
</html>
