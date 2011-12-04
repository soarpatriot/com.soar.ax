<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
	<head>

		<meta name="decorator" content="templete" />
		<title>My Site -<decorator:title default="${templete}" />
		</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!-- 
		<link href="${ctx}/style/yui3/yui3.css" rel="stylesheet" type="text/css" />
		 -->
 		
 		<link href="${ctx}/style/main.css" rel="stylesheet" type="text/css" />
 		<link href="${ctx}/style/yui3/prettify-min.css" rel="stylesheet" type="text/css" />
 	    <script src="${ctx}/scripts/My97DatePicker/WdatePicker.js"></script>
		<script type="text/javascript" src="${ctx}/scripts/jquery/jquery-1.4.4.min.js"></script>
        <script type="text/javascript" src="${ctx}/scripts/yui3/yui-min.js"></script>
		<decorator:head></decorator:head>
	</head>
	<body >
	   <div id="doc">
		
			
				<%@ include file="/page/layout/header.jsp"%>
				<div class="yui3-g content">
				  <decorator:body></decorator:body>
				</div>
				
				<%@ include file="/page/layout/footer.jsp"%>
		   
       </div>
	</body>
</html>
