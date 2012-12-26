<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<!DOCTYPE HTML>
<html>
	<head>
    <title><decorator:title default="AX" /></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
    
    <!-- Le styles -->
    <link href="${ctx}/public/stylesheets/bootstrap.css" rel="stylesheet">
    <link href="${ctx}/public/stylesheets/bootstrap-responsive.css" rel="stylesheet">
    <link href="${ctx}/public/stylesheets/docs.css" rel="stylesheet">
    
    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href="${ctx}/public/img/favicon.ico">
    
	<decorator:head></decorator:head>
  </head>
  
  <body>
       <%@ include file="/page/layout/nav.jsp"%>
	   <div class="container mini-height">
	        <decorator:body>
	     	</decorator:body>
	   </div>
	   <%@ include file="/page/layout/footer.jsp"%>  
	   <%@ include file="/page/layout/js-files.jsp"%>
	  
   </body>
</html>
