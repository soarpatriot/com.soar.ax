<!DOCTYPE html>
<%@ include file="/page/common/taglibs.jsp"%>
<html>
<head>
	<title>Basic TreeGrid - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="${ctx}/public/stylesheets/jquery-easyui/themes/bootstrap/easyui.css">
	<link rel="stylesheet" type="text/css" href="${ctx}/public/stylesheets/jquery-easyui/themes/icon.css">

	<script type="text/javascript" src="${ctx}/public/javascripts/jquery-easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${ctx}/public/javascripts/jquery-easyui/datagrid-detailview.js"></script>
	<script type="text/javascript">
		$(function(){
			$('#orders-table').datagrid({
				title:'DataGrid - DetailView',
				
				striped:true,
				height:'auto',    
				remoteSort:false,
				singleSelect:true,
				rownumbers: true,
				pagination: true,
				nowrap:false,
				fitColumns:true,
				url:'${ctx}/public/temp/datagrid_data.json',
				
				view: detailview,
				detailFormatter:function(index,row){  
				   
				    //row._id = _.uniqueId('lineId-')
				    //alert( row.id);  
			        return '<div class="clearfix" style="padding:2px"><table id="line-' + index + '"></table></div>';    
			    }, 
			    onExpandRow: function(index,row){ 
			        //var lineId = _.uniqueId('lineId-');  
			         
			        $('#line-'+index).datagrid({    
			            url:'${ctx}/public/temp/treegrid_data2.json',    
			            fitColumns:true,    
			            singleSelect:true,    
			            rownumbers:true,    
			            loadMsg:'Load ...',    
			            
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
						]],    
			            onResize:function(){    
			                $('#orders-table').datagrid('fixDetailRowHeight',index);    
			            },    
			            onLoadSuccess:function(){  
			                //alert("onLoadSuccess parent "+ index);
			                setTimeout(function(){    
			                    $('#orders-table').datagrid('fixDetailRowHeight',index);    
			                },0);    
			            },
			            
			            /**
			            *shipping hiearchy grid
			            **/
			            view: detailview,
						detailFormatter:function(shipIndex,shipRow){ 
						    //alert(index);
						    var componentIndex = index + shipIndex;
						    //row._id = _.uniqueId('shipId-')   
						    //alert(componentIndex);
					        return '<div class="clearfix" style="padding:2px"><table id="ship-'+componentIndex+'"></table></div>';    
					    },     
					    onExpandRow: function(shipIndex,shipRow){  
					        //var shipId = _.uniqueId('shipId-');
					        //alert(index);
					        var componentIndex = index + shipIndex;
					        
					    	$('#ship-'+componentIndex).datagrid({    
								url:'${ctx}/public/temp/treegrid_data2.json',    
					            fitColumns:true,    
					            singleSelect:true,    
					            rownumbers:true,    
					            loadMsg:'Load ...',    
					            
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
								]],      
								
					            onResize:function(){   
					                //alert("resize, index"+ index +"   shipIndex : "+ shipIndex);
					                $('#line-'+index).datagrid('fixDetailRowHeight', shipIndex);    
					            },    
					            onLoadSuccess:function(){
					                //alert("onLoadSuccess"+ shipIndex +"   shipIndex : "+ shipIndex);    
					                 
					                $('#line-'+index).datagrid('fixDetailRowHeight', shipIndex);    
					                 
					            }
					            
					       });/**end of ship table**/
					       $('#line-'+index).datagrid('fixDetailRowHeight',shipIndex);     
					    }
			        });    
			        $('#orders-table').datagrid('fixDetailRowHeight',index);    
			    }      
			});
		});
	</script>
	<script type="text/javascript">
	/**
	columns:[[
					{field:'itemid',title:'Item ID',width:80},
					{field:'productid',title:'Product ID',width:100,sortable:true},
					{field:'listprice',title:'List Price',width:80,align:'right',sortable:true},
					{field:'unitcost',title:'Unit Cost',width:80,align:'right',sortable:true},
					{field:'attr1',title:'Attribute',width:150,sortable:true},
					{field:'status',title:'Status',width:60,align:'center'}
				]],
	**/
	
	</script>
</head>
<body>
    <div class="row-fluid">
       <div class="span8 offset2">
       		<h2>Orders</h2>
			<table id="orders-table" title="Folder Browser">
				<thead>
					<tr>
						<th field="itemid" width="80">Item ID</th>
						<th field="productid" width="100">Product ID</th>
						<th field="listprice" align="right" width="80">List Price</th>
						<th field="unitcost" align="right" width="80">Unit Cost</th>
						<th field="attr1" width="220">Attribute</th>
						<th field="status" width="60" align="center">Status</th>
					</tr>
				</thead>
				
			</table>
       </div>
    </div>
</body>
</html>