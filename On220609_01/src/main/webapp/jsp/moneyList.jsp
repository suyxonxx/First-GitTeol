<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, javax.sql.*"%>
<%
	request.setCharacterEncoding("UTF-8");
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "system";
	String pwd = "1234";
	String sql = "SELECT MEM.CUSTNO, MEM.CUSTNAME, MEM.GRADE, SUM(MON.PRICE) "
				+ "FROM MEMBER_TBL_02 MEM, MONEY_TBL_02 MON "
				+ "WHERE MEM.CUSTNO = MON.CUSTNO "
				+ "GROUP BY MEM.CUSTNO, MEM.CUSTNAME, MEM.GRADE "
				+ "ORDER BY SUM(MON.PRICE) DESC";
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,id,pwd);
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원매출조회</title>
<link rel="stylesheet" type="text/css" href="../css/baseStyle.css">
<style type="text/css">
	section table{width:600px; margin:150px auto; text-align:center;}
	section table td a{text-decoration:none; color:black;}
	section table td a:hover{color: Cornflowerblue;}
</style>
</head>
<body>
	<%@ include file="body_top.jsp" %>
	<section>
		<h3 id="section_title">쇼핑몰 회원 등록</h3>
		<table border="1">
			<tr>
				<th>회원번호</th>
				<th>회원성명</th>
				<th>고객등급</th>
				<th>　매출　</th>
			</tr>
<%
	while(rs.next()){
		String grade = "직원";
		if(rs.getString(3).equals("A")) grade = "VIP";
		else if(rs.getString(3).equals("B")) grade = "일반";
%>
			<tr>
				<td><a href="memberUpdate.jsp?custno=<%=rs.getInt(1) %>" id="td_1"><%=rs.getInt(1) %></a></td>
				<td><%=rs.getString(2) %></td>
				<td><%=grade %></td>
				<td><%=rs.getInt(4) %></td>
			</tr>
<%		} %>
		</table>
	</section>
	<%@ include file="body_bottom.jsp" %>
</body>
</html>
<%		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
%>