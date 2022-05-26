<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자연수 합 구하기</title>
</head>
<body>
	<h1><%int num = Integer.parseInt(request.getParameter("end"));%>
	1부터 <%=num %>까지 자연수 합 구하기</h1>
	<%
		for(int i = 1; i < num; i++) {
			out.print(i + " + ");
		} out.print(num + " = ");
		
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		} out.println(sum);
	%>
</body>
</html>