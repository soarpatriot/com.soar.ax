<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
	<head>
	    <meta name="decorator" content="index-templeate"/>
		<title>WS</title>
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
	   <div class="yui3-g">
		  <form action="${ctx}/j_spring_security_check" method="post" class="login-form">
		  
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
		  </form>
		</div>
	</body>
</html>
