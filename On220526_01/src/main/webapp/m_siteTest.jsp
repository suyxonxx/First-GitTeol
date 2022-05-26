<%@page import="java.net.URLEncoder" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String site = request.getParameter("site");
	
	if(site.equals("naver")) {
		response.sendRedirect("https://www.naver.com");
	} else if (site.equals("daum")) {
		response.sendRedirect("https://www.daum.net");
	} else if (site.equals("nate")) {
		response.sendRedirect("https://www.nate.com");
	} else if (site.equals("google")) {
		response.sendRedirect("https://www.google.com");
	}
%>