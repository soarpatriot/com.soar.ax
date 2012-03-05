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
			<form:form class="work-form" method="post" commandName="workContent" action="${ctx}/s3/work">
	        <fieldset>
	        <legend>Work Content</legend>
	        <%@ include file="work-form.jsp"%>
	        
	        
	        </fieldset>
	       
			<div class="type-button">
	             
	              <input type="reset" value="reset" class="button"  id="reset" name="reset" />
	              <input type="submit" value="Save Changes"  class="button" id="submit" name="submit" />
	        </div>
	        </form:form>
	   </div>
	</body>
</html>
