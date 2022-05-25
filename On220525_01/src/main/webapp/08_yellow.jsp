<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
<style type="text/css">
	body{background-color:yellow;}
</style>
</head>
<body>
	<h3>[forward 액션 태그에 대한 예제]</h3><hr>
	이 파일은 yellow.jsp 입니다.<hr>
	브라우저에 나타나는 URL과 전혀 상관 없는 파일입니다.
	<h1><%=request.getParameter("name") %>~~~</h1>
</body>
</html>