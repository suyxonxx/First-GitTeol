<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.shopmanager.dao.*, java.net.URLEncoder"%>
<jsp:useBean id="dao" class="com.shopmanager.dao.ShopDAO"/>
<%
	request.setCharacterEncoding("UTF-8");
	String type = request.getParameter("type");
	String search = request.getParameter("search");
	dao.searchList(type, search);
	session.setAttribute("type", type);
	session.setAttribute("search", search);
	response.sendRedirect("searchList.jsp?" + type + "=" + URLEncoder.encode(search, "UTF-8"));
%>
