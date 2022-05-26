<!-- 회원 인증을 위해 아이디와 비밀번호를 입력받는 폼 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
	<form method="post" action="testLogin.jsp">
		<label for="userid">아이디 : </label>
		<input type="text" name="id" id="userid"><br>
		
		<label for="userpwd">암 &nbsp; 호 : </label>
		<input type="password" name="pwd" id="userpwd"><br>
		
		<input type="submit" value="로그인">
	</form>
</head>
<body>
</body>
</html>