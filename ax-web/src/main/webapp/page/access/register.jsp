<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
	<head>
		
		
	</head>
	<body>
	
	   <form:form class="form well" method="post" commandName="user" action="${ctx}/users">
        <fieldset>
        <legend>First Fieldset </legend>
        <div class="type-text">
                <label for="username">User Name:</label>
                <form:input path="username" size="5"/>
        </div>
        <div class="type-text">
                <label for="email">Email:</label>
                <form:input path="email" />
        </div>
        <div class="type-text">
                <label for="password">Password:</label>
                <form:input path="password" />
        </div>
       
   
        </fieldset>
       
		<div class="type-button">
             
            
              <input type="submit" value="提交"  class="btn-primary" id="submit" name="submit" />
        </div>
    </form:form>
	</body>
</html>
