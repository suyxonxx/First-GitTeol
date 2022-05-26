<!-- 인증된 사용자의 인증을 무효화하는 JSP 페이지 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
	<%session.invalidate(); %>
	<script>
		alert("로그아웃 되었습니다.");
		location.href="loginForm.jsp";
	</script>
</body>
</html>