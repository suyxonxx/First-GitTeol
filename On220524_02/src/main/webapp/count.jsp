<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	int global_cnt = 0;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int local_cnt = 0;
		
		out.print("local_cnt : ");
		out.print(++local_cnt);
		
		out.print("<br>global_cnt : ");
		out.print(++global_cnt);
		out.print("<br><br>");
		
		Calendar date = Calendar.getInstance();
		SimpleDateFormat today = new SimpleDateFormat("yyyy년 MM월 dd일");
	%>
	<%= today.format(date.getTime())%>	
</body>
</html>