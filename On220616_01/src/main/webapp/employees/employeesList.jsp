<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 관리</title>
<link rel="stylesheet" type="text/css" href="css/employees.css">
</head>
<body>
	<div id="wrap" align="center">
		<h1>리스트</h1>
		<table class="list">
			<tr>
				<td colspan="5" style="border:white; text-align:right">
					<a href="employees.do?command=write_form">게시글 등록</a>
				</td>
			</tr>
			<tr><th>아이디</th><th>이름</th><th>권한</th><th>성별</th><th>전화번호</th></tr>
			<c:forEach var="employees" items="${empList}">
				<tr class="record">
					<td>${employees.id}</td>
					<td><a href="employees.do?command=view&id=${employees.id}">${employees.name}</a></td>
					<td>
						<c:choose>
							<c:when test="${employees.lev == 'A'}">
								<c:out value="운영자"/>
							</c:when>
							<c:when test="${employees.lev == 'B'}">
								<c:out value="일반회원"/>
							</c:when>
						</c:choose>
					</td>
					<td>
						<c:choose>
							<c:when test="${employees.gender == '1'}">
								<c:out value="남자"/>
							</c:when>
							<c:when test="${employees.gender == '2'}">
								<c:out value="여자"/>
							</c:when>
						</c:choose>
					</td>
					<td>${employees.phone}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>