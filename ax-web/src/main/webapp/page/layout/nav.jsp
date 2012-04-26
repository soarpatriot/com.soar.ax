<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/page/common/taglibs.jsp"%>
<div class="navbar navbar-fixed-top">
  <div class="navbar-inner">
    <div class="container">
      <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </a>
      
      <!-- 
      <a class="brand" href="./index.html">Bootstrap</a>
       -->
      <a class="brand" href="#">Project name</a>
      <c:if test="${not empty userId}">
      </c:if>
      <c:choose>  
        <c:when test="${not empty userId}">
             <p class="navbar-text pull-right">Logged in as <a href="#">username</a></p>
             <c:url value="/j_spring_security_logout" var="logoutUrl"/>
             <li><a href="${logoutUrl}">Log Out</a></li>
        </c:when>
        <c:otherwise>
             <p class="navbar-text pull-right"><a href="login">Login</a></p>
        </c:otherwise>
      </c:choose>
      
      <div class="nav-collapse">
        <ul class="nav">
        
         
          <li class="<c:if test='${hightLight eq "Overview"}'>active</c:if>">
            <a href="./index.html">Overview</a>
          </li>
          
          <li class="<c:if test='${hightLight eq "Components"}'>active</c:if>">
            <a href="./components.html">Components</a>
          </li>
          <li class="">
            <a href="./javascript.html">Javascript plugins</a>
          </li>
          <li class="">
            <a href="./less.html">Using LESS</a>
          </li>
          <li class="divider-vertical"></li>
          <li class="">
            <a href="./download.html">Customize</a>
          </li>
          <li class="">
            <a href="${ctx}/authorization">Management Authorization</a>
          </li>
          
          
        </ul>
      </div>
    </div>
  </div>
</div>