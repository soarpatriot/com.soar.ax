<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
  <head>
   
    <title>User Create</title>
    
	

  </head>
  
  <body>
    <form:form method="post" commandName="user" action="${ctx}/users">
        <fieldset>
        <legend>First Fieldset (<code>text-fields</code> &amp; <code>select-boxes</code>)</legend>
         <div class="type-text">
                <label for="username">User Name:</label>
                <form:input path="username" size="5"/>
        </div>
        <div class="type-text">
                <label for="loginName">Login Name:</label>
                <form:input path="loginName" size="5"/>
        </div>
        <div class="type-text">
                <label for="password">Password:</label>
                <form:input path="password" />
        </div>
        <div class="type-text">
                <label for="name">Nick Name:</label>
                <form:input path="name" />
        </div>
        <div class="type-text">
                <label for="email">Email:</label>
                <form:input path="email" />
        </div>
        
        </fieldset>
       
		<div class="type-button">
             
              <input type="reset" value="reset" class="reset" id="reset" name="reset" />
              <input type="submit" value="Save Changes"  class="submit" id="submit" name="submit" />
        </div>
    </form:form>
  </body>
</html>
