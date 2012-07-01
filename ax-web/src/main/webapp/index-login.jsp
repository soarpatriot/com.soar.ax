<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
	<head>
		<script type="text/javascript">
		   $(function(){
		       $(".alert").alert('close')
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
        <div class="alert alert-error">
           <a class="close" data-dismiss="alert" href="#">×</a>
           <h4 class="alert-heading">Warning!</h4>
            Best check yo self, you're not...
        </div>
	    <c:if test="${not empty param.login_error}">
	      <font color="red">
	        Your login attempt was not successful, try again.<br/><br/>
	        Reason: <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/>.
	      </font>
	    </c:if>
	   <div>
	      <c:if test="${not empty param.login_error}">
		          登录失败，请重试。错误原因:<br/>
		  </c:if>
		  <font color="red">
	         <c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
	              <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"></c:out>
	         </c:if>
		  </font>
		
	   </div>
	   <div class="container">
		  <form id="login-form" action="${ctx}/j_spring_security_check" method="post" class="form-horizontal">
		       <fieldset>
			       <legend>用户登录</legend>
	               <div id="username-group" class="control-group">
	               <label class="control-label" for="input01">用户名：</label>
	               <div class="controls">
	               <input type="text" id="username" class="input" name="j_username" value="${sessionScope['SPRING_SECURITY_LAST_USERNAME']}" />
	               </div>
	               </div>
	               
	               <div id="passowrd-group" class="control-group">
	               <label class="control-label" for="input01">密码：</label>
	               <div class="controls">
	               <input type="password" id="password" name="j_password" value="" />
	               </div>
	               </div>
	               
	               <div class="control-group">
		            <label class="control-label" for="optionsCheckbox"></label>
		            <div class="controls">
		              <label class="checkbox">
		                <input type="checkbox" name="_spring_security_remember_me" />
		                   两周之内不必登陆
		              </label>
		            </div>
		          </div>
	               
	              
	               
	               <div class="form-actions">
		            <input type="button" id="login-button" class="btn btn-primary" value="登录"/>
		            <button class="btn">Cancel</button>
		          </div>
               </fieldset>
		      
		  </form>
		</div>
	</body>
</html>
