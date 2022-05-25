<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=request.getParameter("name") %>님 안녕하세요!
	당신의 아이디는 <%=request.getParameter("id") %> 입니다.
	<br>저희 홈페이지에 방문해 주셔서 감사합니다.<br>
</body>
</html>