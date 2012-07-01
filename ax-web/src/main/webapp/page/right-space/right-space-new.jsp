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
        $("#add-right-space-btn").click(function(){
          $('#my-modal').modal('show');
          $("#right-form").submit();
        })
        
        //$('#my-modal').modal('hide');
      })
    </script>
  </head>
  
  <body>
    <div class="container">
		  <form id="right-form" action="${ctx}/right-space" method="post" commandName="rightSpace" class="form-horizontal">
		       <fieldset>
			       <legend>权限空间管理</legend>
	               <div id="username-group" class="control-group">
	               <label class="control-label" for="name">权限空间名称：</label>
	               <div class="controls">
	               <input type="text" id="right-space-name" class="input" name="name"/>
	               </div>
	               </div>
	               
	               <div id="right-space-description-group" class="control-group">
	               <label class="control-label" for="description">权限空间描述：</label>
	               <div class="controls">
	               <input type="text" id="right-space-description" name="description"/>
	               </div>
	               </div>
	               
	              
	   
	               <div id="right-description-group" class="control-group">
	               <label class="control-label" for="code">权限空间Code：</label>
	               <div class="controls">
	               <input type="text" id="right-space-code" name="code"/>
	               </div>
	               </div>
	               
	               <div class="form-actions">
		            <input type="button" id="add-right-space-btn" class="btn btn-primary" value="添加"/>
		           </div>
               </fieldset>
		      
		  </form>
		</div>
	
		
		<div id="my-modal" class="modal hide fade in">
		<div class="modal-header">
		<a class="close" data-dismiss="modal">×</a>
		<h3>Modal Heading</h3>
		</div>
		<div class="modal-body">
		<h4>Text in a modal</h4>
		<p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem.</p>
		<h4>Popover in a modal</h4>
		<p>
		<h4>Tooltips in a modal</h4>
		<p>
		<hr>
		<h4>Overflowing text to show optional scrollbar</h4>
		<p>
		<p>Cras mattis consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros.</p>
		<p>Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor.</p>
		<p>Aenean lacinia bibendum nulla sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla.</p>
		<p>Cras mattis consectetur purus sit amet fermentum. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Morbi leo risus, porta ac consectetur ac, vestibulum at eros.</p>
		<p>Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor.</p>
		<p>Aenean lacinia bibendum nulla sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla.</p>
		</div>
		<div class="modal-footer">
       </div>
  </body>
</html>
