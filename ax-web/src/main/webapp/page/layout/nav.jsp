<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<div class="navbar navbar-inverse navbar-fixed-top">
  <div class="navbar-inner">
    <div class="container">
      <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </a>
      
      
      <a class="brand" href="#">AX</a>
   
      <c:choose>  
        <c:when test="${not empty SPRING_SECURITY_CONTEXT.authentication.principal.username}">
             
             <c:url value="/j_spring_security_logout" var="logoutUrl"/>
             <p class="navbar-text pull-right">Logged in as <a href="#">${SPRING_SECURITY_CONTEXT.authentication.principal.username}</a> /
                <a href="${logoutUrl}">Log Out</a>
             </p>
             
        </c:when>
        <c:otherwise>
             <p class="navbar-text pull-right"><a href="${ctx}/access/login">Login</a> / <a href="${ctx}/access/register">Register</a></p>
        </c:otherwise>
      </c:choose>
      
      <div class="nav-collapse collapse">
        <ul class="nav">
        
         
          <li class="<c:if test='${hightLight eq "Overview"}'>active</c:if>">
            <a href="./index.html">Overview</a>
          </li>
          
          <li class="<c:if test='${hightLight eq "Components"}'>active</c:if>">
            <a href="./components.html">Components</a>
          </li>
         
          
          <li class="active">
            <a href="${ctx}/authorization">Management Authorization</a>
          </li>
          <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li><a href="#">Action</a></li>
                  <li><a href="#">Another action</a></li>
                  <li><a href="#">Something else here</a></li>
                  <li class="divider"></li>
                  <li class="nav-header">Nav header</li>
                  <li><a href="#">Separated link</a></li>
                  <li><a href="#">One more separated link</a></li>
                </ul>
           </li>
          
        </ul>
      </div>
    </div>
  </div>
</div>