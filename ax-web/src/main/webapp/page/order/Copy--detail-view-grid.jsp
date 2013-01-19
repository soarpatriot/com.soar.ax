<!DOCTYPE html>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
<head>
	<title>Basic TreeGrid - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="${ctx}/public/stylesheets/jquery-easyui/themes/bootstrap/easyui.css">
	<link rel="stylesheet" type="text/css" href="${ctx}/public/stylesheets/jquery-easyui/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="${ctx}/public/stylesheets/jquery-easyui/demo.css">
	<script type="text/javascript" src="${ctx}/public/javascripts/jquery-easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="${ctx}/public/javascripts/jquery-easyui/datagrid-detailview.js"></script>
	<script type="text/javascript">
	
	    $(function(){
			$('#orders-table').datagrid({
				title:'DataGrid - DetailView',
				width:500,
				height:250,
				remoteSort:false,
				singleSelect:true,
				rownumbers: true,
				pagination: true,
				nowrap:false,
				fitColumns:true,
				url:'${ctx}/public/temp/datagrid_data.json',
				columns:[[
					{field:'itemid',title:'Item ID',width:80},
					{field:'productid',title:'Product ID',width:100,sortable:true},
					{field:'listprice',title:'List Price',width:80,align:'right',sortable:true},
					{field:'unitcost',title:'Unit Cost',width:80,align:'right',sortable:true},
					{field:'attr1',title:'Attribute',width:150,sortable:true},
					{field:'status',title:'Status',width:60,align:'center'}
				]],
				view: detailview,
				detailFormatter: function(rowIndex, rowData){
					return '<table><tr>' +
							'<td rowspan=2 style="border:0"><img src="images/' + rowData.itemid + '.png" style="height:50px;"></td>' +
							'<td style="border:0">' +
							'<p>Attribute: ' + rowData.attr1 + '</p>' +
							'<p>Status: ' + rowData.status + '</p>' +
							'</td>' +
							'</tr></table>';
				}
				onExpandRow: function(index,row){    
			        $('#ddv-'+index).datagrid({    
			            url:'${ctx}/public/temp/treegrid_data2.json',    
			            fitColumns:true,    
			            singleSelect:true,    
			            rownumbers:true,    
			            loadMsg:'',    
			            height:'auto',    
			            columns:[[    
			                {field:'orderid',title:'Order ID',width:100},    
			                {field:'quantity',title:'Quantity',width:100},    
			                {field:'unitprice',title:'Unit Price',width:100}    
			            ]],    
			            onResize:function(){    
			                $('#dg').datagrid('fixDetailRowHeight',index);    
			            },    
			            onLoadSuccess:function(){    
			                setTimeout(function(){    
			                    $('#dg').datagrid('fixDetailRowHeight',index);    
			                },0);    
			            }    
			        });    
			        $('#dg').datagrid('fixDetailRowHeight',index);    
			    }    
			});
		});
		
	</script>
</head>
<body>
    <div class="row-fluid">
       <div class="span8 offset2">
       		<h2>Orders</h2>
			<table id="orders-table">
			</table>
       </div>
    </div>
	
</body>
</html>