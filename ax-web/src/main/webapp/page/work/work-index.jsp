<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
	<head>
	  <script type="text/javascript">
	     $(function(){
	        $("#addTaskButton").click(function(){
	             window.location="${ctx}/work/new"
	        });
	       
	        $("input[name='deleteWorkButton']").click(function(){
	             if(confirm("do you really remove this work ? ")){
	             
	                $(this).parent().submit();
	                //$("#deleteWorkForm").submit();
	             }else{
	                return "";
	             }
	        });
	     })
	  </script>
	</head>
	<body>
      
			<display:table name="workContents" id="workContent" requestURI="${ctx}/s3/work" sort="external" defaultsort="1" pagesize="10" export="true">
					<display:column property="beginTime" title="Begin Time"/>
					<display:column property="endTime" title="End Time"/>
					<display:column property="workDescription" title="Work Description"/>
					<display:column title="Operation">
					    
					    <form:form id="deleteWorkForm" method="delete" action="${ctx}/work/${workContent.id}">
                            <a href="${ctx}/work/${workContent.id}/edit" class="button">Edit</a>   ||  <input id="deleteWorkButton" name="deleteWorkButton" class="button" type="button" value="Delete" />
                            
                        </form:form>
					</display:column>
			</display:table>
			
			<div>
			  <input id="addTaskButton" class="button" type="button" value="add"/>
			</div>
		
	</body>
</html>
