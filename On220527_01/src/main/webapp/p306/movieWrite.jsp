<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="movie" class="com.mission.javabeans.movieBean"/>
<jsp:setProperty name="movie" property="*"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보 처리 페이지</title>
<style type="text/css">
	textarea{width:400px; height:200px; text-align:left;}
	.leftside{font-weight:bold; text-align:center;}
</style>
</head>
<body>
	<h1>입력 완료된 정보</h1>	
	<table>
		<tr>
			<td class="leftside">제목</td>
			<td><jsp:getProperty name="movie" property="title"></jsp:getProperty></td>
		</tr>
		<tr>
			<td class="leftside">가격</td>
			<td><jsp:getProperty name="movie" property="price"></jsp:getProperty>원</td>
		</tr>
		<tr>
			<td class="leftside">감독</td>
			<td><jsp:getProperty name="movie" property="director"></jsp:getProperty></td>
		</tr>
		<tr>
			<td class="leftside">출연배우</td>
			<td><jsp:getProperty name="movie" property="actor"></jsp:getProperty></td>
		</tr>
		<tr>
			<td class="leftside">시놉시스</td>
			<td><textarea><jsp:getProperty name="movie" property="synopsis"></jsp:getProperty></textarea></td>
		</tr>
		<tr>
			<td class="leftside">장르</td>
			<td><jsp:getProperty name="movie" property="genre"></jsp:getProperty></td>
		</tr>
	</table>
</body>
</html>