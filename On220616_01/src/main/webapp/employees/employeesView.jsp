<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보 보기</title>
<link rel="stylesheet" type="text/css" href="css/employees.css">
</head>
<body>
	<div id="wrap" align="center">
		<h1>정보 보기</h1>
		<table>
			<tr><th>아이디</th><td style="width:700px">${employees.id}</td></tr>
			<tr><th>비밀번호</th><td>${employees.pass}</td></tr>
			<tr><th>이름</th><td>${employees.name}</td></tr>
			<tr>
				<th>권한</th>
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
			</tr>
			<tr>
				<th>성별</th>
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
			</tr>
			<tr><th>전화번호</th><td>${employees.phone}</td></tr>
			<tr><th>가입일</th><td>${employees.enter}</td></tr>
		</table><br><br>
		<input type="button" value="수정" onclick="location.href='employees.do?command=update_form&id=${employees.id}'">
		<input type="button" value="삭제" onclick="location.href='employees.do?command=delete&id=${employees.id}'">
		<input type="button" value="목록" onclick="location.href='employees.do?command=list'">
		<input type="button" value="등록" onclick="location.href='employees.do?command=write_form'">
	</div>
</body>
</html>