<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<style type="text/css">
	h2{text-align:center;}
	table{margin:0 auto;}
	.table_left{background-color:lightgray;}
	#bottom{text-align:center;}
	textarea{width:450px; height:300px;}
</style>
</head>
<body>
	<h2>게시판 글쓰기</h2>
	<form method="post" action="boardWrite.jsp">
		<table border="1">
			<tr>
				<td class="table_left">작성자</td>
				<td><input type="text" name="name" size="20"></td>
			</tr>
			<tr>
				<td class="table_left">비밀번호</td>
				<td><input type="password" name="pass" size="20">
					(게시물 수정 삭제시 필요합니다.)</td>
			</tr>
			<tr>
				<td class="table_left">이메일</td>
				<td><input type="text" name="email" size="40"></td>
			</tr>
			<tr>
				<td class="table_left">글 제목</td>
				<td><input type="text" name="title" size="60"></td>
			</tr>
			<tr>
				<td class="table_left">글 내용</td>
				<td><textarea name="content"></textarea></td>
		</table><br>
		<div id="bottom">
			<input type="submit" value="등록">
			<input type="reset" value="다시 작성">
		</div>
	</form>
</body>
</html>