<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<div class="type-text">
        <label for="beginTime">Begin Time:</label>
        <form:input id="beginTime" path="beginTime" class="Wdate" type="text" onFocus="WdatePicker({lang:'en',dateFmt:'yyyy-MM-dd HH:mm:ss'})" readOnly="true"/>
</div>
 

 <div class="type-text">
        <label for="endTime">End Time:</label>
        <form:input id="endTime" path="endTime" class="Wdate" type="text" onFocus="WdatePicker({lang:'en',dateFmt:'yyyy-MM-dd HH:mm:ss'})" readOnly="true"/>
</div>

<div class="type-text">
        <label for="workDescription">WorkDescription:</label>
        <form:textarea rows="5" cols="60" wrap="physical" path="workDescription" />
</div>
	        