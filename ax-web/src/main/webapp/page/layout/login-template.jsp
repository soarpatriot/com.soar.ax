<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
  <head>
        <meta name="decorator" content="templete" />
		<title><decorator:title default="${templete}" />
		</title>
		<link rel="stylesheet" type="text/css" href="${ctx}/style/yui2/reset-fonts-grids.css"/>
 		<link rel="stylesheet" type="text/css" href="${ctx}/style/menu/menu.css"  />
 		<link rel="stylesheet" type="text/css" href="${ctx}/style/main.css"/>
 		<link rel="stylesheet" type="text/css" href="${ctx}/style/yui3/prettify-min.css"/>
 	    <script type="text/javascript" src="${ctx}/scripts/My97DatePicker/WdatePicker.js"></script>
		<script type="text/javascript" src="${ctx}/scripts/jquery/jquery-1.4.4.min.js"></script>
        <script type="text/javascript" src="${ctx}/scripts/yui3/yui-min.js"></script>
		<decorator:head></decorator:head>
  </head>
  <body class="yui-skin-sam">
      <div id="doc4" class="yui-t7">
            <div id="hd" role="banner">
	 	 	    <%@ include file="/page/layout/ovp-banner.jsp"%>
	 	 	</div>
	 	 	<div id="bd" role="main" class="content content-min-height">   
		        <div class="yui-g"> 
		    	  <decorator:body></decorator:body>
		    	</div>  
			</div>  
	    	<div id="ft" role="contentinfo">
				<%@ include file="/page/layout/footer.jsp"%>
		    </div>  
	   </div>		
  </body>
</html>
