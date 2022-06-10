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
	String sql = "SELECT * FROM MEMBER_TBL_02";
	
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
<title>회원목록 조회/수정</title>
<link rel="stylesheet" type="text/css" href="../css/baseStyle.css">
<style type="text/css">
	section table{width:950px; margin:100px auto;}
section table td a{text-decoration:none; color:black;}
section table td a:hover{color: Cornflowerblue;}
</style>
</head>
<body>
	<header><h2>쇼핑몰 회원관리 ver 1.0</h2></header>
		<menu>
			<li><a href="memberJoin.jsp">회원등록</a></li>
			<li><a href="memberList.jsp">회원목록조회/수정</a></li>
			<li><a href="moneyList.jsp">회원매출조회</a></li>
			<li><a href="../index.jsp">홈으로</a></li>
		</menu>
	<section>
			<h3 id="section_title">쇼핑몰 회원 조회/수정</h3>
		<table border="1">
			<tr>
				<th>회원번호</th>
				<th>회원성명</th>
				<th>전화번호</th>
				<th>주소</th>
				<th>가입일자</th>
				<th>고객등급</th>
				<th>거주지역</th>
			</tr>
<%
	while(rs.next()){
		String grade = "직원";
		if(rs.getString(6).equals("A")) grade = "VIP";
		else if(rs.getString(6).equals("B")) grade = "일반";
%>
 			<tr>
 				<td><a href="memberUpdate.jsp?custno=<%=rs.getString("custno") %>"><%=rs.getString(1) %></a></td>
 				<td><%=rs.getString(2) %></td>
 				<td><%=rs.getString(3) %></td>
 				<td><%=rs.getString(4) %></td>
 				<td><%=rs.getString(5).substring(0,10) %></td>
 				<td><%=grade %></td>
 				<td><%=rs.getString(7) %></td>
 			</tr>
<%		} %>
		</table>
	</section>
	<footer>HRDKOREA Copyrightⓒ2016 All rights reserved. Human Resources Development Service of Korea.</footer>
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