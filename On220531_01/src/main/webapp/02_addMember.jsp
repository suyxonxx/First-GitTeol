<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%!
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String uid = "scott";
	String pass = "tiger";
	
	String sql = "INSERT INTO MEMBER VALUES(?, ?, ?, ?, ?, ?)";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("NAME");
		String userid = request.getParameter("USERID");
		String pwd = request.getParameter("PWD");
		String email = request.getParameter("EMAIL");
		String phone = request.getParameter("PHONE");
		String admin = request.getParameter("ADMIN");
		
		try {
			//1. JDBC 드라이버 로드
				Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. 데이터베이스 연결 객체인 Connection 생성
				conn = DriverManager.getConnection(url, uid, pass);
			//3. PreparedStatement 객체 생성
				pstmt = conn.prepareStatement(sql);
			//4. 바인딩 변수 채우기
				pstmt.setString(1, name);
				pstmt.setString(2, userid);
				pstmt.setString(3, pwd);
				pstmt.setString(4, email);
				pstmt.setString(5, phone);
				pstmt.setInt(6, Integer.parseInt(admin));
			//5. SQL문을 실행하여 결과 처리
				pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//6. 사용한 리소스 해제
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	%>
	<h3>회원 가입 성공</h3>
	<a href="01_allMember.jsp">전체 회원 목록 보기</a>
</body>
</html>