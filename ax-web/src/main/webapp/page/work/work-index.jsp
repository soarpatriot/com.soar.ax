<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
	<head>
	  <link href="${ctx}/style/displaytag/css/screen.css" rel="stylesheet" type="text/css" />
	  <script type="text/javascript">
	     $(function(){
	        $("#addTaskButton").click(function(){
	             window.location="${ctx}/s3/work/new"
	        });
	     })
	  </script>
	</head>
	<body>
        <div class="clear"></div>
		<div>
			<display:table name="workContents" id="workContent" requestURI="${ctx}/s3/work" sort="external" defaultsort="1" pagesize="10" export="true">
					<display:column property="beginTime" title="Begin Time"/>
					<display:column property="endTime" title="End Time"/>
					<display:column property="workDescription" title="Work Description"/>
					<display:column title="Operation">
					    <a href="${ctx}/s3/work/${workContent.id}/edit">Edit</a> ||
					    <a href="${ctx}/s3/work/${workContent.id}/edit">Edit</a>
					</display:column>
			</display:table>
			
			<div>
			  <input id="addTaskButton" class="button" type="button" value="add"/>
			</div>
		</div>
	</body>
</html>
