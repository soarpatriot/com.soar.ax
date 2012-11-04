<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
	<head>
		<script type="text/javascript">
		   $(function(){
		       //$(".alert").alert('close')
		       $("#login-button").click(function(){
		          var username = $.trim($("#username").val());
		          var password = $.trim($("#password").val());
		          var validate = true;
		          if(""===username || null===username){
		            validate = false;
		            $(".alert").alert();
		            $("#username-group").addClass("error");
		            return;
		          }
		          
		          if(""===password || null===password){
		            validate = false;
		            $(".alert").alert();
		            $("#passowrd-group").addClass("error");
		            return;
		          }
		          
		          if(validate){
		            $("#login-form").submit();
				  }
		          
		         
		       });
		       
		   });
		</script>
		
	</head>
	<body>
	
	   <%-- this form-login-page form is also used as the
         form-error-page to ask for a login again.
         --%>
         
       
	   
	   
	   <div class="content">
	     <div class="login-tip">
	        <c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">  
	          <div class="alert alert-error">
	
	            <a class="close" data-dismiss="alert" href="#">×</a>
	            <h4 class="alert-heading">Warning!</h4>
	               登录失败，请重试。错误原因: <br/>  
	             ${SPRING_SECURITY_LAST_EXCEPTION.message}
	          </div>
            </c:if>
		</div>
	     
	   
		  <form id="login-form" action="${ctx}/j_spring_security_check" method="post" class="form-vertical  sign-in">
		       <fieldset>
			      
		           <div id="username-group" class="control-group">
		               <label class="control-label" for="j_username">用户名：</label>
		               <div class="controls">
		                  <input type="text" id="username" class="input-large340" name="j_username" value="${sessionScope['SPRING_SECURITY_LAST_USERNAME']}" />
		               </div>
	               </div>
	               
	               <div id="passowrd-group" class="control-group">
		               <label class="control-label" for="j_password">密码：</label>
		               <div class="controls">
		                <input type="password" id="password" class="input-large340"  name="j_password" value="" />
		               </div>
	               </div>
	               
	               <div class="control-group">
			           <div class="controls">
							<input type="checkbox" name="_spring_security_remember_me" />&nbsp;两周之内不必登陆
					   </div>
			       </div>
	               <div class="control-group">
	                    <div class="controls">
			              <input type="button" id="login-button" class="btn btn-primary" value="登录"/>
			              <div class="pull-right">
			                 <a href="#s">忘记密码</a>
			              </div>
			        </div>
				  </div>
               </fieldset>
		  </form>
		  
		  <div class="sign-in">
		       Getting Start with AX is easy 
		       <span class="pull-right">
		          <a href="#">注册</a>
		       </span>
		      
		  </div>
		</div>
 
 		<div class="background-red">
 		
 		  <div class="landscape background-red">

 		    
 		  </div>
 		 
	     
	    </div>
	</body>
</html>
