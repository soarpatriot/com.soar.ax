<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<!DOCTYPE HTML>
<html>
	<head>
    <title><decorator:title default="Access OVP" /></title>
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
	<link href="${ctx}/public/stylesheets/select2.css" rel="stylesheet">
	<link href="${ctx}/public/stylesheets/avgrund/style.css" rel="stylesheet">
	<link href="${ctx}/public/stylesheets/avgrund/avgrund.css" rel="stylesheet">
	
	<script src="${ctx}/public/javascripts/jquery/jquery-1.8.3.min.js"></script>
    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href="${ctx}/public/img/favicon.ico">
    <decorator:head></decorator:head>
  </head>
  
  <body>
  	   <div class="container-fluid">
  	   	   <!--[if lt IE 9 ]>
			  <div class="row-fluid">
  	            <div class="span8 offset2">
  	               <div class="alert alert-danger">
  	                <h4>Warning!</h4>
  	            	Please note that OVP Client (only Client) no longer supports Internet Explorer versions 6 7 or 8
					We recommend upgrading to the latest Internet Explorer, Google Chrome, or Firefox.
					If you are using IE 9 or later, make sure you turn off "Compatibility View".
					<p class="lead">
					   You can also access OVP use IE 6 7 and 8 through previous Client <a href="${ctx}/index-pre.jsp"><h3>OVP Previous Client</h3></a>
					</p>
				   </div>	
  	            </div>
  	          </div>  
		   <![endif]-->
	       <%@ include file="/page/layout/ovp-logo.jsp"%> 
	       
	       <decorator:body></decorator:body>
	   </div>    
	   <%@ include file="/page/layout/ovp-footer.jsp"%> 
       
       <%@ include file="/page/layout/js-files.jsp"%>
       
   </body>
</html>
