<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
	<head>
	  <script type="text/javascript">
	     $(function(){
	        $("#addTaskButton").click(function(){
	             window.location="${ctx}/s3/task/new"
	        });
	     })
	  </script>
	</head>
	<body>
        <div class="clear"></div>
		<div>
			<display:table name="tasks" id="tasks" requestURI="${ctx}/s3/task" sort="external" defaultsort="1" pagesize="10" export="true">
					
					<display:column property="defectId" title="DefectId"/>
					<display:column property="title" title="Task Title"/>
					<display:column property="detail" title="Task Detail"/>
					<display:column property="followAction" title="Task FollowAction:"/>
					<display:column property="owner" title="Owner"/>
					<display:column property="executor" title="Executor"/>
					<display:column property="targetDate" title="Target Date"/>
					<display:column property="status" title="Status" sortable="true"/>
				    <display:column property="updateDate" title="Update Date"  sortable="true"/>
				    <display:column property="belongToWave" title="Belong To Wave"  sortable="true"/>
				    <display:column property="manDay" title="Man Day"/>
			</display:table>
			
			<div>
			  <input id="addTaskButton" class="button" type="button" value="add"/>
			</div>
		</div>
	</body>
</html>
