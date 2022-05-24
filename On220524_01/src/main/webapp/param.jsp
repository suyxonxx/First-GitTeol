<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서블릿</title>
<script type="text/javascript" src="param.js"></script>
</head>
<body>
	<form action="ParamServlet" method="get" name="frm">
		아이디 : <input type="text" name="id"><br>
		나이 : <input type="text" name="age"><br>
		<input type="submit" value="전송" onclick="return check()">
	</form>
</body>
</html>