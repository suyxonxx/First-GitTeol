<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, java.sql.*, javax.sql.*, com.shopmanager.dao.*"%>
<jsp:useBean id="dao" class="com.shopmanager.dao.ShopDAO"/>
<%
	int custno = Integer.parseInt(request.getParameter("custno"));
	ShopVO vo = dao.ShopUpdateData(custno);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈쇼핑 회원 정보 수정</title>
<script type="text/javascript" src="../script/shop.js"></script>
<link rel="stylesheet" type="text/css" href="../css/baseStyle.css">
<style type="text/css">
	section table{width:730px; height:330px; margin:100px auto;}
	section table input {float:left; width:300px; height:15px; margin:0 0 0 5px;}
</style>
</head>
<body>
	<%@ include file="search.jsp" %>
	<%@ include file="body_top.jsp" %>
	<form method="get" action="memberUpdate_impl.jsp" name="frm">
		<section>
			<h3 id="section_title">쇼핑몰 회원 등록</h3>
			<table border="1">
				<tr>
					<th>회원번호(자동발생)</th>
					<td><input type="text" name="custno" value="<%=vo.getCustno() %>"></td>
				</tr>
				<tr>
					<th>회원성명</th>
					<td><input type="text" name="custname" value="<%=vo.getCustname() %>"></td>
				</tr>
				<tr>
					<th>회원전화</th>
					<td><input type="text" name="phone" value="<%=vo.getPhone() %>"></td>
				</tr>
				<tr>
					<th>회원주소</th>
					<td><input type="text" name="address" value="<%=vo.getAddress() %>"></td>
				</tr>
				<tr>
					<th>가입일자</th>
					<td><input type="text" name="joindate" value="<%=vo.getJoindate().substring(0, 10) %>"></td>
				</tr>
				<tr>
					<th>고객등급 [A:VIP, B:일반, C:직원]</th>
					<td><input type="text" name="grade" value="<%=vo.getGrade() %>"></td>
				</tr>
				<tr>
					<th>도시코드</th>
					<td><input type="text" name="city" value="<%=vo.getCity() %>"></td>
				</tr>
				<tr>
					<th colspan="2">
						<button type="submit" onclick="return memberCheck()">수정</button>
						<button type="button" onclick="location.href='memberList.jsp'">조회</button>
					</th>
				</tr>
			</table>
		</section>
	</form>
	<%@ include file="body_bottom.jsp" %>
</body>
</html>