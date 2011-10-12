<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html class="js">
  <head>
   
    <title>User Create</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	  #js-info { display:block; padding: 10px 20px; background: #fee; color: #800; margin: 0 0 10px 0; }
	  .js #js-info { display:none; }
	
	  p.switch { display:none; }
	  .js p.switch { display:block; }
	  
	  .active { font-weight:bold; color: #800 !important; }
	</style>
	
    <script type="text/javascript">document.documentElement.className += " js";</script>
  </head>
  
  <body>
    <form:form method="post" class="yform" commandName="user" action="/ax-web/s3/users">
        <fieldset>
        <legend>First Fieldset (<code>text-fields</code> &amp; <code>select-boxes</code>)</legend>
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
                <label for="email">Login Name:</label>
                <form:input path="email" />
        </div>
        
        </fieldset>
       
		<div class="type-button">
              <input type="button" value="button" id="button1" name="button1" />
              <input type="reset" value="reset" class="reset" id="reset" name="reset" />
              <input type="submit" value="Save Changes"  class="submit" id="submit" name="submit" />
        </div>
    </form:form>
  </body>
</html>
