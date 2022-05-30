<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL과 JSTL</title>
<style type="text/css">
	#c1{color:red;} #c2{color:green;} #c3{color:blue;}
</style>
</head>
<body>
	<c:choose>
		<c:when test="${param.color == 1}">
			<span id="c1">빨강</span>
		</c:when>
		<c:when test="${param.color == 2}">
			<span id="c2">초록</span>
		</c:when>
		<c:when test="${param.color == 3}">
			<span id="c3">파랑</span>
		</c:when>
	</c:choose>
</body>
</html>