<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL과 JSTL</title>
</head>
<body>
	당신이 입력한 정보입니다(고전적인 방식).<hr>
	아이디 : <%=request.getParameter("id") %><br>
	비밀번호 : <%=request.getParameter("pwd") %><br><br>
	
	당신이 입력한 정보입니다(EL 방식).<hr>
	아이디 : ${param.id}<br>
	비밀번호 : ${param["pwd"]}
	<!-- 참고로, ${param["pwd"]}와 ${param.pwd}는 표현 방식만 다를 뿐, 기능은 똑같음. -->
</body>
</html>