<!-- 회원 인증을 처리하기 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//실제로는 DB에서 가죠와야 하는 값
	String id = "pinksung";
	String pwd = "1234";
	String name = "성윤정";
	
	if(id.equals(request.getParameter("id")) && pwd.equals(request.getParameter("pwd"))) {
		//1. Cookie 객체 생성(username에 성윤정을 맵핑)
		Cookie cookie = new Cookie("username", "성윤정");
		//2. 속성 부여
		cookie.setMaxAge(24 * 60 * 60);
		//3. 클라이언트에 전송
		response.addCookie(cookie);
%>
		<h2>성공적으로 로그인하셨습니다.</h2>
		<p><a href="main.jsp">들어가기</a>
<%
	} else {
%>
		<h2>로그인에 실패하셨습니다.</h2>
		<p><a href="loginForm.jsp">되돌아가기</a>
<%	} %>