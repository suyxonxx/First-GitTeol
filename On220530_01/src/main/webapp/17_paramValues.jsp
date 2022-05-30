<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL과 JSTL</title>
</head>
<body>
	당신이 선택한 항목입니다.<hr>
	<c:forEach var="item" items="${paramValues.item}" varStatus="status">
		${item} <c:if test="${not status.last}">, </c:if>
	</c:forEach>
</body>
</html>