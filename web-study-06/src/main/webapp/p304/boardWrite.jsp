<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8"); %>
	<jsp:useBean id="board" class="com.mission.javabeans.BoardBean"/>
	<jsp:setProperty name="board" property="*"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보 처리 페이지</title>
</head>
<body>
	<h1>입력 완료된 회원 정보</h1>
	<table>
		<tr>
			<td>작성자</td>
			<td><jsp:getProperty name="board" property="name"/></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><jsp:getProperty name="board" property="pass"/></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><jsp:getProperty name="board" property="email"/></td>
		</tr>
		<tr>
			<td>글 제목</td>
			<td><jsp:getProperty name="board" property="title"/></td>
		</tr>
		<tr>
			<td>글 내용</td>
			<td><jsp:getProperty name="board" property="content"/></td>
		</tr>
	</table>
</body>
</html>