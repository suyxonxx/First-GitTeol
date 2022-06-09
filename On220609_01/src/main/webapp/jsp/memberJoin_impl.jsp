<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.shopmanager.dao.*"%>
<jsp:useBean id="dao" class="com.shopmanager.dao.ShopDAO"/>
<jsp:useBean id="vo" class="com.shopmanager.dao.ShopVO">
	<jsp:setProperty property="*" name="vo"/>
</jsp:useBean>
<%
	dao.shopInsert(vo);
	response.sendRedirect("memberList.jsp");
%>