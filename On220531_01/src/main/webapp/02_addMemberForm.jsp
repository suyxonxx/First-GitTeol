<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 입력 폼</title>
</head>
<body>
	<h2>회원 정보 입력 폼</h2>
	<form method="post" action="02_addMember.jsp">
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" name="NAME"></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="USERID"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="PWD"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" name="EMAIL"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="PHONE"></td>
			</tr>
			<tr>
				<td>등급</td>
				<td>
					<input type="radio" name="ADMIN" value="1" checked>관리자
					<input type="radio" name="ADMIN" value="0">일반회원
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="전송"></td>
				<td><input type="reset" value="취소"></td>
			</tr>
		</table>
	</form>
</body>
</html>