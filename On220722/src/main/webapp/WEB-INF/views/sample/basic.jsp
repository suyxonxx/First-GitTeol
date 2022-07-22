<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>basic page</title>
</head>
<body>
	<h1>basic page</h1>
	<h3><c:out value="${list}"/></h3>
	<h3><c:out value="${list.name}"/></h3><hr>
	<h3><c:out value="${sampleDAO}"/></h3>
	<h3><c:out value="${sampleDAO.name}"/></h3><hr>
</body>
</html>