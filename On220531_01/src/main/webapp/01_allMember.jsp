<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "java.sql.*" %>
<%!
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String uid = "scott";
	String pass = "tiger";
	String sql = "SELECT * FROM MEMBER";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC</title>
<style type="text/css">table{width:800px;}</style>
</head>
<body>
	<table border="1">
		<tr>
			<th>이름</th>
			<th>아이디</th>
			<th>암호</th>
			<th>이메일</th>
			<th>전화번호</th>
			<th>권한(1 : 관리자, 0 : 일반 회원)</th>
		</tr>
		<%
			try {
				//1. 드라이브 로드
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//2. 연결
				conn = DriverManager.getConnection(url, uid, pass);
				//3. sql 문장 작성
				stmt = conn.createStatement();
				//4. sql 문장 실행
				rs = stmt.executeQuery(sql);
				//5. 실행된 결과물을 rs를 통해서 출력
				while(rs.next()) {
					out.println("<tr>");
					out.println("<td>" + rs.getString("NAME") + "</td>");
					out.println("<td>" + rs.getString("USERID") + "</td>");
					out.println("<td>" + rs.getString("PWD") + "</td>");
					out.println("<td>" + rs.getString("EMAIL") + "</td>");
					out.println("<td>" + rs.getString("PHONE") + "</td>");
					out.println("<td>" + rs.getInt("ADMIN") + "</td>");
					out.println("</tr>");
				}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(rs != null) rs.close();
					if(stmt != null) stmt.close();
					if(conn != null) conn.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		%>
	</table>
</body>
</html>