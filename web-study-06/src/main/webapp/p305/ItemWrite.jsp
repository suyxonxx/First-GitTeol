<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8"); %>
	<jsp:useBean id="item" class="com.mission.javabeans.ItemBean"/>
	<jsp:setProperty name="item" property="*"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보 처리 페이지</title>
</head>
<body>
	<h1>입력 완료된 정보</h1>
	<table>
		<tr>
			<td>상품명</td>
			<td><jsp:getProperty property="name" name="item"/></td>
		</tr>
		<tr>
			<td>가격</td>
			<td><jsp:getProperty property="price" name="item"/></td>
		</tr>
		<tr>
			<td>설명</td>
			<td><jsp:getProperty property="description" name="item"/></td>
		</tr>
	</table>
</body>
</html>