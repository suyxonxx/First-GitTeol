<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.shopmanager.dao.*, java.util.Date, java.text.SimpleDateFormat"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="dao" class="com.shopmanager.dao.ShopDAO"/>
<jsp:useBean id="vo" class="com.shopmanager.dao.ShopVO"/>
<%String today = new SimpleDateFormat("yyyyMMdd").format(new Date());%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원등록</title>
<link rel="stylesheet" type="text/css" href="../css/baseStyle.css">
<style type="text/css">
	section table{width:730px; height:290px; margin:100px auto;}
	section table input {float:left; width:300px; height:15px; margin:0 0 0 5px;}
</style>
</head>
<body>
	<header><h2>쇼핑몰 회원관리 ver 1.0</h2></header>
	<form method="get" action="memberJoin_impl.jsp">
		<menu>
			<li><a href="memberJoin.jsp">회원등록</a></li>
			<li><a href="memberList.jsp">회원목록조회/수정</a></li>
			<li><a href="moneyList.jsp">회원매출조회</a></li>
			<li><a href="../index.jsp">홈으로</a></li>
		</menu>
		<section>
			<h3 id="section_title">쇼핑몰 회원 등록</h3>
			<table border="1">
				<tr>
					<th>회원번호(자동발생)</th>
					<td><input type="text" name="custno" value="${dao.seqCustno(vo)}"></td>
				</tr>
				<tr>
					<th>회원성명</th>
					<td><input type="text" name="custname"></td>
				</tr>
				<tr>
					<th>회원전화</th>
					<td><input type="text" name="phone"></td>
				</tr>
				<tr>
					<th>회원주소</th>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<th>가입일자</th>
					<td><input type="text" name="joindate" value=<%=today%>></td>
				</tr>
				<tr>
					<th>고객등급 [A:VIP, B:일반, C:직원]</th>
					<td><input type="text" name="grade"></td>
				</tr>
				<tr>
					<th>도시코드</th>
					<td><input type="text" name="city"></td>
				</tr>
				<tr>
					<th colspan="2">
						<button type="submit" onclick="alert('회원등록이 완료되었습니다.')">등록</button>
						<button type="button" onclick="location.href='memberList.jsp'">조회</button>
					</th>
				</tr>
			</table>
		</section>
		<footer>HRDKOREA Copyrightⓒ2016 All rights reserved. Human Resources Development Service of Korea.</footer>
	</form>
</body>
</html>