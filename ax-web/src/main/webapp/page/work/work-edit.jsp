<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
	<head>
	  <script type="text/javascript">
	     $(function(){
	        $("addTaskButton").click(function(){
	             window.location="${ctx}/s3/task/new"
	        });
	     })
	  </script>
	</head>
	<body>
        
		<div class="yui3-g">
			<form:form method="post" commandName="workContent" action="${ctx}/s3/work">
	        <fieldset>
	        <legend>Work Content</legend>
	        <form:hidden path="id"/>
	        <div class="type-text">
	                <label for="beginTime">Begin Time:</label>
	                <form:input id="beginTime" path="beginTime" class="Wdate" type="text" onFocus="WdatePicker({lang:'en',dateFmt:'yyyy-MM-dd HH:mm:ss'})" readOnly="true"/>
	        </div>
	         
	       
	         <div class="type-text">
	                <label for="endTime">End Time:</label>
	                <form:input id="endTime" path="endTime" class="Wdate" type="text" onFocus="WdatePicker({lang:'en',dateFmt:'yyyy-MM-dd HH:mm:ss'})" readOnly="true"/>
	        </div>
	       
	        <div class="type-text">
	                <label for="workDescription">WorkDescription:</label>
	                <form:textarea col="50" path="workDescription" />
	        </div>
	        
	        
	        </fieldset>
	       
			<div class="type-button">
	             
	              <input type="reset" value="reset" class="button"  id="reset" name="reset" />
	              <input type="submit" value="Save Changes"  class="button" id="submit" name="submit" />
	        </div>
	        </form:form>
	   </div>
	</body>
</html>
