<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보 삭제</title>
	<link rel="stylesheet" type="text/css" href="../css/movie.css">
	<script type="text/javascript" src="script/movie.js"></script>
</head>
<body>
	<div id="wrap" align="center">
		<h1>정보 삭제</h1>
		<form method="post" enctype="multipart/form-data" name="frm">
			<input type="hidden" name="code" value="${movie.code}">
			<input type="hidden" name="noimage" value="${movie.poster}">
			<table>
				<tr>
					<td>
						<c:choose>
							<c:when test="${empty movie.poster}">
								<img src="images/noimage.jpg">
							</c:when>
							<c:otherwise>
								<img src="images/${movie.poster}">
							</c:otherwise>
						</c:choose>
					</td>
					<td>
						<table>
							<tr>
								<th style="width:70px">제　목</th>
								<td style="width:550px">${movie.title}</td>
							</tr>
							<tr>
								<th>가　격</th>
								<td>${movie.price}</td>
							</tr>
							<tr>
								<th>감　독</th>
								<td>${movie.director}</td>
							</tr>
							<tr>
								<th>배　우</th>
								<td>${movie.actor}</td>
							</tr>
							<tr>
								<th>시놉시스</th>
								<td>${movie.synopsis}</td>
							</tr>
							<tr>
								<th>사　진</th>
								<td>${movie.poster}</td>
							</tr>
						</table>
					</td>
				</tr>
			</table><br>
			<input type="submit" value="삭제" onclick="alert('정보 삭제가 완료되었습니다.')">
			<input type="button" value="목록" onclick="location.href='/movieList.do'">
		</form>
	</div>
</body>
</html>