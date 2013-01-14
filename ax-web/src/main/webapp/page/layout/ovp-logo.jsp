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
	  <a class="brand" href="#">Access OVP</a>
	  <div class="nav-collapse collapse">
        <ul class="nav">
          <li class="<c:if test='${hightLight eq "Overview"}'>active</c:if>">
            <a id="about" href="#about">About</a>
          </li>
        </ul>
      </div>
    </div>
  </div>
</div>