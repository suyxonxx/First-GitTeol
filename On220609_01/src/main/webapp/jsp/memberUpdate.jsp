<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.shopmanager.dao.*, java.sql.*, javax.sql.*"%>
<jsp:useBean id="dao" class="com.shopmanager.dao.ShopDAO"/>
<jsp:useBean id="vo" class="com.shopmanager.dao.ShopVO"/>
<%
	request.setCharacterEncoding("UTF-8");
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "system";
	String pwd = "1234";
	String sql = "SELECT * FROM MEMBER_TBL_02 WHERE CUSTNO=?";
	int custno = Integer.parseInt(request.getParameter("custno"));
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,id,pwd);
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, custno);
		rs = pstmt.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈쇼핑 회원 정보 수정</title>
<link rel="stylesheet" type="text/css" href="../css/baseStyle.css">
<style type="text/css">
	section table{width:730px; height:330px; margin:100px auto;}
	section table input {float:left; width:300px; height:15px; margin:0 0 0 5px;}
</style>
</head>
<body>
	<header><h2>쇼핑몰 회원관리 ver 1.0</h2></header>
	<form method="get" action="memberUpdate_impl.jsp">
<%
	if(rs.next()){
%>
		<menu>
			<li><a href="memberJoin.jsp">회원등록</a></li>
			<li><a href="memberList.jsp">회원목록조회/수정</a></li>
			<li><a href="moneyList.jsp">회원매출조회</a></li>
			<li><a href="../index.jsp">홈으로</a></li>
		</menu>
		<section>
			<h3 id="section_title">쇼핑몰 회원 등록</h3>
			<table border="1">
				<tr>
					<th>회원번호(자동발생)</th>
					<td><input type="text" name="custno" value="<%=rs.getInt("custno") %>"></td>
				</tr>
				<tr>
					<th>회원성명</th>
					<td><input type="text" name="custname" value="<%=rs.getString("custname") %>"></td>
				</tr>
				<tr>
					<th>회원전화</th>
					<td><input type="text" name="phone" value="<%=rs.getString("phone") %>"></td>
				</tr>
				<tr>
					<th>회원주소</th>
					<td><input type="text" name="address" value="<%=rs.getString("address") %>"></td>
				</tr>
				<tr>
					<th>가입일자</th>
					<td><input type="text" name="joindate" value="<%=rs.getString("joindate") %>"></td>
				</tr>
				<tr>
					<th>고객등급 [A:VIP, B:일반, C:직원]</th>
					<td><input type="text" name="grade" value="<%=rs.getString("grade") %>"></td>
				</tr>
				<tr>
					<th>도시코드</th>
					<td><input type="text" name="city" value="<%=rs.getString("city") %>"></td>
				</tr>
				<tr>
					<th colspan="2">
						<button type="submit" onclick="alert('회원정보 수정이 완료되었습니다.')">수정</button>
						<button type="button" onclick="location.href='memberList.jsp'">조회</button>
					</th>
				</tr>
			</table>
		</section>
		<footer>HRDKOREA Copyrightⓒ2016 All rights reserved. Human Resources Development Service of Korea.</footer>
	</form>
</body>
</html>
<%	
		}
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