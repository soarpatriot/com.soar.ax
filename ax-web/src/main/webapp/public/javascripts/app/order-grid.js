(function(){
    
  	$(function(){
			//list-data
			//orderHeaderUrl:'${ctx}/public/temp/datagrid_data.json',
		    var orderGrid = {
		    	lineItemHeader:${lineItem},
		    	deliveryHeader:${delivery},
		    	orderHeaderUrl:'${ctx}/order/list.json',
		    	lineItemUrl: '${ctx}/public/temp/treegrid_data2.json',
		    	shipUrl: '${ctx}/public/temp/treegrid_data2.json'
		    };
		    
			$('#orders-table').datagrid({
				title:'Order - Grid',
				columns:[orderGrid.lineItemHeader],
				striped:true,
				height:'400',    
				remoteSort:false,
				singleSelect:true,
				rownumbers: true,
				pagination: true,
				nowrap:true,
				fitColumns:true,
				url:orderGrid.orderHeaderUrl,

				//delivery View
				view: detailview,
				detailFormatter:function(index,row){  
			        return '<div class="clearfix" style="padding:2px"><table id="line-' + index + '"></table></div>';    
			    }, 
			    onExpandRow: function(index,row){ 
			        //var lineId = _.uniqueId('lineId-');  
			        //alert(row.productid);
			        $('#line-'+index).datagrid({    
			            height:'400',
			            fitColumns:true,    
			            singleSelect:true,    
			            rownumbers:true,    
			            loadMsg:'Load ...',    
			            data:row.deliveries,
						columns:[orderGrid.deliveryHeader],    
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
						    var componentIndex = index + shipIndex;
					        return '<div class="clearfix" style="padding:2px"><table id="ship-'+componentIndex+'"></table></div>';    
					    },     
					    onExpandRow: function(shipIndex,shipRow){  
					        var componentIndex = index + shipIndex;
					    	$('#ship-'+componentIndex).datagrid({    
								height:'400',
								url:orderGrid.shipUrl,    
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
					                $('#line-'+index).datagrid('fixDetailRowHeight', shipIndex);    
					            },    
					            onLoadSuccess:function(){
					                $('#line-'+index).datagrid('fixDetailRowHeight', shipIndex);    
					            },
					            /**
					            * serial view
					            **/
					            view: detailview,
					            detailFormatter:function(serialIndex,serialRow){ 
								    var componentIndex = index + shipIndex + serialIndex;
							        return '<div class="clearfix" style="padding:2px"><table id="serial-'+componentIndex+'"></table></div>';    
							    }, 
							    onExpandRow: function(serialIndex,serialRow){  
							        var componentIndex = index + shipIndex + serialIndex;
							    	$('#serial-'+componentIndex).datagrid({    
										height:'400',
										url:orderGrid.shipUrl,    
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
							                $('#ship-'+shipIndex).datagrid('fixDetailRowHeight', serialIndex);    
							            },    
							            onLoadSuccess:function(){
							                $('#ship-'+shipIndex).datagrid('fixDetailRowHeight', serialIndex);    
							            }
						            });/**end of serial table**/   
						            $('#ship-'+shipIndex).datagrid('fixDetailRowHeight',serialIndex);    
						        }   
							    
					       });/**end of ship table**/
					       $('#line-'+index).datagrid('fixDetailRowHeight',shipIndex);     
					    }
			        });/**end of line table**/   
			        $('#orders-table').datagrid('fixDetailRowHeight',index);    
			    }      
			});
		});
})(orderGrid);