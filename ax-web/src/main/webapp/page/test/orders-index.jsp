<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Orders  --</title>
</head>
<body>
    <s:actionmessage />
    <table>
        <tr>
            <th>ID</th>
            <th>Client</th>
            <th>Amount</th>
            <th>Actions</th>
        </tr>
        <s:iterator value="model">
        <tr>
            <td>${id}</td>
            <td>${clientName}</td>
            <td>${amount}</td>
            <td><a href="orders/${id}">View</a> |
                <a href="orders/${id}/edit">Edit</a> |
                <a href="orders/${id}/deleteConfirm">Delete</a></td>
        </tr>
        </s:iterator>
    </table>    	
    <a href="orders/new">Create a new order</a>
</body>
</html>
	