<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%!
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String uid = "scott";
	String pass = "tiger";
	String sql = "SELECT * FROM EMPLOYEE";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC</title>
<style type="text/css">
	table{width:500px; margin:0 auto; text-align:center;}
	table tr th{background-color:Slateblue; color:#FFF;}
	table tr td{background-color:Lightsteelblue; color:Darkslateblue;}
</style>
</head>
<body>
	<table>
		<tr>
			<th>이름</th>
			<th>주소</th>
			<th>주민등록번호</th>
		</tr>
		<%
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, uid, pass);
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery(sql);
				
				while(rs.next()) {
					out.println("<tr>");
					out.println("<td>" + rs.getString("name") + "</td>");
					out.println("<td>" + rs.getString("address") + "</td>");
					out.println("<td>" + rs.getString("ssn") + "</td>");
					out.println("</tr>");
				}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(conn != null) conn.close();
					if(pstmt != null) pstmt.close();
					if(rs != null) rs.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		%>
	</table>
</body>
</html>