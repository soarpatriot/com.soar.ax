<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
	<head>
		<title>WS</title>
		
		
	    
	    <script type="text/javascript">
	      
		   $(function(){
		       
		       $("#login-button").click(function(){
		          
		          $("#login-form").submit();
		       });
		   });
		</script>
		
	</head>
	<body>
	   
	   <div>
	      <c:if test="${not empty param.login_error}">
		          登录失败，请重试。错误原因:<br/>
		   </c:if>
		      <font color="red">
		         <c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
		              <c:out value="${SPRING_SECURITY_LAST_EXCEPTION}"></c:out>
		         </c:if>
		      </font>
		  
	     
	   </div>
	   <div class="container">
		  <form id="login-form" action="${ctx}/j_spring_security_check" method="post" class="login-form">
		      
		       <div class="span4 offset1">
		          <table>
		            <tr>  
		              <td>用户名：</td>
		              <td><input type="text" name="j_username" value="${sessionScope['SPRING_SECURITY_LAST_USERNAME']}" />
		              </td>
		            </tr>
		            <tr>  
		              <td>密码：</td>
		              <td><input type="password" name="j_password" value="" /></td>
		            </tr>
		            <tr>  
		              <td colspan="2">
		              <input type="checkbox" name="_spring_security_remember_me" />两周之内不必登陆<br/>
			          <a href="#tt" id="login-button" class="btn btn-primary">登录1</a>
		              </td>
		            
		            </tr>
		         </table>
		         
			           
			       
		       </div>
		        
			        
		         
		    
		     <!-- 
		     <div class="type-text">
		        <label for="username">USERNAME:  </label>
		    	<input type="text" name="j_username" value="${sessionScope['SPRING_SECURITY_LAST_USERNAME']}" />
		     </div>
		     <div class="type-text">
		        <label for="password">PASSWORD:  </label>
		        <input type="password" name="j_password" value="" />
		     </div>
		     <div class="type-button">
		    	<input type="checkbox" name="_spring_security_remember_me" />两周之内不必登陆<br/>
				
			 </div>  
			  <div class="type-button">
				  <input class="button" type="submit">  
			    </div>  
			 	
		      -->
		     
			
		  </form>
		</div>
	</body>
</html>
