<!-- 07_firstPage.jsp에서 설정한 속성 값을 브라우저에 출력한다. -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
<style type="text/css">
	body{background-color:Lightsteelblue; color: Darkslateblue;}
</style>
</head>
<body>
	<h1>SECOND PAGE</h1>
	하나의 페이지 속성 : <%=pageContext.getAttribute("name") %><br>
	하나의 요청 속성 : <%=request.getAttribute("name") %><br>
	하나의 세션 속성 : <%=session.getAttribute("name") %><br>
	하나의 애플리케이션 속성 : <%=application.getAttribute("name") %><br>
	<a href="07_thirdPage.jsp">또 다른 페이지</a>
	<%//request.getRequestDispatcher("07_thirdPage.jsp").forward(request, response); %>
</body>
</html>