<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
	<head>
		
		
	</head>
	<body>
	
	   <form:form class="form-horizontal well" method="post" commandName="user" action="${ctx}/users">
        <fieldset>
	        <legend>用户注册</legend>
	        <div class="control-group">    
		         <label class="control-label" for="input01">用户名</label>
		         <div class="controls">      
			         
			         <form:input class="input-xlarge" path="username" size="5"/>       
			         
		         </div>   
	        </div>
	              
	        <div class="control-group">    
		         <label class="control-label" for="input01">Email</label>
		         <div class="controls">      
			         <form:input path="email" class="input-xlarge"/>
			           
			        
		         </div>   
	        </div>
	        
	        <div class="control-group">    
		         <label class="control-label" for="input01">密码</label>
		         <div class="controls">      
			         <form:password path="password" class="input-xlarge"/>
		         </div>   
	        </div>
        </fieldset>
		<div class="control-group">
		    <div class="controls">
                 <input type="submit" value="提交"  class="btn btn-primary" id="submit" name="submit" />
            </div>
        </div>
    </form:form>
	</body>
</html>
