<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보 입력 폼</title>
<style type="text/css">
	h1{text-align:center; text-indent:-480px;}
	table{margin:0 auto;}
	textarea{width:600px; height:100px;}
	#bottom{text-align:center;}
</style>
</head>
<body>
	<form method="post" action="ItemWrite.jsp">
		<h1>정보 입력 폼</h1>
		<table>
			<tr>
				<td>상품명</td>
				<td><input type="text" name="name" size="30"></td>
			</tr>
			<tr>
				<td>가격</td>
				<td><input type="text" name="price" size="30"></td>
			</tr>
			<tr>
				<td>설명</td>
				<td><textarea name="description"></textarea></td>
			</tr>
		</table>
		<div id="bottom">
			<input type="submit" value="전송">
			<input type="reset" value="취소">
		</div>
	</form>
</body>
</html>