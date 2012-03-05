<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>

	 <div class="hd-title-background">
	    <div class="hd-title">
	       <div class="h-20">
           </div>
		   <h3 style="margin-top:0px;">
		      Lenovo OVP Overall Management 
		   </h3>
			<div class="yui3-g" style="text-align:right">
				<a href="#"> Login </a> |
				<a href="#"> Contact </a> |
				<a href="#"> Imprint </a>
			</div>
	    </div>
	    
	  </div>
<div class="h-20">
</div>

<div class="hd-content">	
	<div class="yui3-g">
	    <ul id="css3menu1" class="topmenu">
			<li class="topfirst"><a href="${ctx}/s3/task" title="home" style="height:18px;line-height:15px;">Home</a></li>
			<li class="topmenu"><a href="${ctx}/s3/work" title="Item 1" style="height:18px;line-height:15px;"><span>My work</span></a>
				<ul>
					<li><a href="${ctx}/s3/work/today" title="Item 1 0">Today</a></li>
					<li><a href="${ctx}/s3/work/tomorrow" title="Item 1 0">Tomorrow</a></li>
					<li><a href="${ctx}/s3/work/yesterday" title="Item 1 0">Yesterday</a></li>
				</ul>
			</li>
			<sec:authorize access="hasRole('AU_WORKss')">
				<li class="topfirst"><a href="${ctx}/s3/task" title="Item 0" style="height:18px;line-height:15px;">用户管理</a></li>
		    </sec:authorize> 
		 </ul>
	</div>	
</div>
<div class="h-20">
</div>

	

