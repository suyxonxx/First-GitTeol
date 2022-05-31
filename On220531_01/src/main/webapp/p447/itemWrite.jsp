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
	String sql = "SELECT * FROM item";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<title>JDBC</title>
</head>
<body>
	
	<table class="table">
		<thead>
			<tr>
				<th>상품제목</th>
				<th>가격</th>
				<th>상품설명</th>
			</tr>
		</thead>
	    <tbody>
			<%
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(url, uid, pass);
					pstmt = conn.prepareStatement(sql);
					rs = pstmt.executeQuery(sql);
					
					while(rs.next()) {
						
						out.println("<tr>");
						out.println("<td>" + rs.getString("name") + "</td>");
						out.println("<td>" + rs.getString("price") + "</td>");
						out.println("<td>" + rs.getString("description") + "</td>");
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
		</tbody>
	</table>
</body>
</html>