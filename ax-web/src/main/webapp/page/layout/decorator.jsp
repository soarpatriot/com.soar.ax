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
 		<link href="${ctx}/style/yui3/yui3.css" rel="stylesheet" type="text/css" />
 		<link href="${ctx}/style/main.css" rel="stylesheet" type="text/css" />
 	
		<script type="text/javascript" src="${ctx}/scripts/jquery/jquery-1.4.4.min.js"></script>
        <script type="text/javascript" src="${ctx}/scripts/yui3/yui-min.js"></script>
        <script>

		    //  Call the "use" method, passing in "node-menunav".  This will load the
		    //  script and CSS for the MenuNav Node Plugin and all of the required
		    //  dependencies.
		
		    YUI().use('node-menunav', function(Y) {
		
		        //  Retrieve the Node instance representing the root menu
		        //  (<div id="productsandservices">) and call the "plug" method
		        //  passing in a reference to the MenuNav Node Plugin.
		
		        var menu = Y.one("#productsandservices");
		
		        menu.plug(Y.Plugin.NodeMenuNav);
		
		        //  Show the menu now that it is ready
		
		        menu.get("ownerDocument").get("documentElement").removeClass("yui3-loading");
		
		    });
		
		</script>
		<decorator:head></decorator:head>
		<decorator:usePage id="templete"></decorator:usePage>
	</head>
	<body class="yui3-skin-sam">
	
	   <div id="doc">
		
			<div id="main">
				<%@ include file="/page/layout/header.jsp"%>
				
				
					<decorator:body></decorator:body>
				
				
				<%@ include file="/page/layout/footer.jsp"%>
			
		    </div>
		
       </div>
	</body>
</html>
