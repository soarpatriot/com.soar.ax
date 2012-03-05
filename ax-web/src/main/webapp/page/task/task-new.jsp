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
			<form:form method="post" commandName="task" action="${ctx}/s3/task">
	        <fieldset>
	        <legend>Task</legend>
	        
	                <label for="title">Task Title:</label>
	                <form:input path="title" size="5"/>
	     
	                <label for="detail">Task Detail:</label>
	                <form:input path="detail" />
	       
	        <div class="type-text">
	                <label for="followAction">Task FollowAction:</label>
	                <form:input path="followAction" />
	        </div>
	        <div class="type-text">
	                <label for="owner">Owner:</label>
	                <form:input path="owner" />
	        </div>
	       
	        <div class="type-text">
	                <label for="executor">Executor:</label>
	                <form:input path="executor" />
	        </div>
	        <div class="type-text">
	                <label for="targetDate">Target Date:</label>
	                <form:input path="targetDate" class="Wdate" type="text" onFocus="WdatePicker({lang:'en',dateFmt:'yyyy-MM-dd HH:mm:ss'})" readOnly="true"/>
	        </div>
	         <div class="type-text">
	                <label for="status">Status:</label>
	                <form:input path="status" />
	        </div>
	       
	         <div class="type-text">
	                <label for="updateDate">Update Date:</label>
	                <form:input path="updateDate" class="Wdate" type="text" onFocus="WdatePicker({lang:'en',dateFmt:'yyyy-MM-dd HH:mm:ss'})" readOnly="true"/>
	        </div>
	        <div class="type-text">
	                <label for="belongToWave">Belong To Wave:</label>
	                <form:input path="belongToWave" />
	        </div>
	        
	         <div class="type-text">
	                <label for="defectId">Defect Id:</label>
	                <form:input path="defectId" />
	        </div>
	        <div class="type-text">
	                <label for="manDay">Man Day:</label>
	                <form:input path="manDay" />
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
