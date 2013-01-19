<!DOCTYPE html>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
<head>
	<title>Basic TreeGrid - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="${ctx}/public/stylesheets/jquery-easyui/themes/bootstrap/easyui.css">
	<link rel="stylesheet" type="text/css" href="${ctx}/public/stylesheets/jquery-easyui/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="${ctx}/public/stylesheets/jquery-easyui/demo.css">
	<script type="text/javascript" src="${ctx}/public/javascripts/jquery-easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript">
		$(function(){
			$('#orders-table').treegrid({
				title:'TreeGrid with Footer',
				iconCls:'icon-ok',
				width:700,
				height:250,
				
				rownumbers: true,
				animate:true,
				collapsible:true,
				pagination: true,
				fitColumns:true,
				url:'${ctx}/public/temp/treegrid_data2.json',
				idField:'id',
				treeField:'name',
				showHeader:true,
				showFooter:true,
				columns:[[
	                {title:'Task Name',field:'name',width:180},
					{field:'persons',title:'Persons',width:60,align:'right'},
					{field:'begin',title:'Begin Date',width:80},
					{field:'end',title:'End Date',width:80},
					{field:'progress',title:'Progress',width:120,
					    formatter:function(value){
					    	if (value){
						    	var s = '<div style="width:100%;border:1px solid #ccc">' +
						    			'<div style="width:' + value + '%;background:#cc0000;color:#fff">' + value + '%' + '</div>'
						    			'</div>';
						    	return s;
					    	} else {
						    	return '';
					    	}
				    	}
					}
				]]
			});
		})
	</script>
</head>
<body>
    <div class="row-fluid">
       <div class="span8 offset2">
       		<h2>Orders</h2>
			<table id="orders-table" title="Folder Browser" class="easyui-treegrid">
			</table>
       </div>
    </div>
	
</body>
</html>