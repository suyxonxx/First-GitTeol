<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, java.sql.*, javax.sql.*, com.shopmanager.dao.*"%>
<jsp:useBean id="dao" class="com.shopmanager.dao.ShopDAO"/>
<%	List<ShopVO> list = dao.moneyList(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원매출조회</title>
<link rel="stylesheet" type="text/css" href="../css/baseStyle.css">
<style type="text/css">
	section table{width:600px; margin:150px auto; text-align:center;}
	section table td a{text-decoration:none; color:black;}
	section table td a:hover{color: Cornflowerblue;}
</style>
</head>
<body>
	<%@ include file="search.jsp" %>
	<%@ include file="body_top.jsp" %>
	<section>
		<h3 id="section_title">회원 매출 조회</h3>
		<table border="1">
			<tr>
				<th>회원번호</th>
				<th>회원성명</th>
				<th>고객등급</th>
				<th>　매출　</th>
			</tr>
<%
	for(ShopVO vo : list) {
		String grade = "직원";
		if(vo.getGrade().equals("A")) grade = "VIP";
		else if(vo.getGrade().equals("B")) grade = "일반";
%>
			<tr>
				<td><a href="memberUpdate.jsp?custno=<%=vo.getCustno() %>" id="td_1"><%=vo.getCustno() %></a></td>
				<td><%=vo.getCustname() %></td>
				<td><%=grade %></td>
				<td><%=vo.getPrice() %></td>
			</tr>
<%		} %>
		</table>
	</section>
	<%@ include file="body_bottom.jsp" %>
</body>
</html>