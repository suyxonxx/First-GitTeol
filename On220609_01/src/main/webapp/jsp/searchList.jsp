<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, com.shopmanager.dao.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="dao" class="com.shopmanager.dao.ShopDAO"/>
<%
	request.setCharacterEncoding("UTF-8");
	String type = (String)session.getAttribute("type");
	String search = (String)session.getAttribute("search");
	List<ShopVO> list = dao.searchList(type, search);
	System.out.println(type);
	System.out.println(search);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 찾기</title>
<link rel="stylesheet" type="text/css" href="../css/baseStyle.css">
<style type="text/css">
	section table{width:950px; margin:100px auto;}
	section table td a{text-decoration:none; color:black;}
	section table td a:hover{color: Cornflowerblue;}
</style>
</head>
<body>
	<div id="search_area"><table id="search"><tr><td></td></tr></table><br></div>
	<%@ include file="body_top.jsp" %>
	<section>
			<h3 id="section_title">회원 검색 결과</h3>
		<table border="1">
			<tr>
				<th>회원번호</th>
				<th>회원성명</th>
				<th>전화번호</th>
				<th>주소</th>
				<th>가입일자</th>
				<th>고객등급</th>
				<th>거주지역</th>
			</tr>
<%
	for(ShopVO vo : list) {
		String grade = "직원";
		if(vo.getGrade().equals("A")) grade = "VIP";
		else if(vo.getGrade().equals("B")) grade = "일반";
%>
 			<tr>
 				<td><a href="memberUpdate.jsp?custno=<%=vo.getCustno() %>"><%=vo.getCustno() %></a></td>
 				<td><%=vo.getCustname() %></td>
 				<td><%=vo.getPhone() %></td>
 				<td><%=vo.getAddress() %></td>
 				<td><%=vo.getJoindate().substring(0,10) %></td>
 				<td><%=grade %></td>
 				<td><%=vo.getCity() %></td>
 			</tr>
<%		} %>
		</table>
	</section>
	<%@ include file="body_bottom.jsp" %>
</body>
</html>