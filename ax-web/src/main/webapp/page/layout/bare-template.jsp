<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
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
    <link rel="shortcut icon" href="${ctx}/assets/ico/favicon.ico">
    <link rel="apple-touch-icon" href="${ctx}/assets/ico/apple-touch-icon.png">
    <link rel="apple-touch-icon" sizes="72x72" href="${ctx}/assets/ico/apple-touch-icon-72x72.png">
    <link rel="apple-touch-icon" sizes="114x114" href="${ctx}/assets/ico/apple-touch-icon-114x114.png">
    
    
	<decorator:head></decorator:head>
  </head>
  
  <body>
       <%@ include file="/page/layout/logo.jsp"%> 
       <decorator:body></decorator:body>
       <%@ include file="/page/layout/js-files.jsp"%>
   </body>
</html>
