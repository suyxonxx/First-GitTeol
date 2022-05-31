<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC</title>
<style type="text/css">
	#ta{width:600px; height:150px;}
	#bottom{margin:0 300px;}
</style>
</head>
<body>
	<h1>정보 입력 폼</h1>
	<form method="get" action="itemWriteResult.jsp">
		상품명<input type="text" name="name"><br>
		가격　<input type="text" name="price"><br>
		설명　<textarea name="description" id="ta"></textarea><br>
		<div id="bottom"><input type="submit" value="전송">
		<input type="reset" value="취소"></div>
	</form>
</body>
</html>