<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보 수정</title>
<link rel="stylesheet" type="text/css" href="css/employees.css">
<script type="text/javascript" src="script/employees.js"></script>
</head>
<body>
	<div id="wrap" align="center">
		<h1>정보 수정</h1>
		<form method="post" action="employees.do" name="frm">
			<input type="hidden" name="command" value="update">
			<table>
				<tr>
					<th>아이디</th>
					<td style="width:700px"><input type="text" name="id" value="${employees.id}"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="pass" value="${employees.pass}"></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="name" value="${employees.name}"></td>
				</tr>
				<tr>
					<th>권한</th>
					<td>
						<c:choose>
							<c:when test="${employees.lev == 'A'}">
								<select name="lev">
									<option value="A" selected>운영자</option>
									<option value="B">일반회원</option>
								</select>
							</c:when>
							<c:when test="${employees.lev == 'B'}">
								<select name="lev">
									<option value="A">운영자</option>
									<option value="B" selected>일반회원</option>
								</select>
							</c:when>
						</c:choose>
					</td>
				</tr>
				<tr>
					<th>성별</th>
					<td>
						<c:choose>
							<c:when test="${employees.gender == '1'}">
								<select name="gender">
									<option value="1" selected>남자</option>
									<option value="2">여자</option>
								</select>
							</c:when>
							<c:when test="${employees.gender == '2'}">
								<select name="gender">
									<option value="1">남자</option>
									<option value="2" selected>여자</option>
								</select>
							</c:when>
						</c:choose>
					</td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td><input type="text" name="phone" value="${employees.phone}"></td>
				</tr>
			</table>
			<input type="submit" value="확인" onclick="return empCheck()">
			<input type="reset" value="취소">
			<input type="button" value="목록" onclick="location.href='employees.do?command=list'">
		</form>
	</div>
</body>
</html>