<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>body_top</title>
<link rel="stylesheet" type="text/css" href="../css/baseStyle.css">
</head>
<body>
	<form method="get" action="search.jsp">
		<div id="search_area">
			<table id="search">
				<tr>
					<td>회원 찾기 : 
						<select name="searchW">
							<option>회원번호</option>
							<option>회원성명</option>
							<option>전화번호</option>
							<option>주소</option>
							<option>가입일자</option>
							<option>고객등급</option>
							<option>거주지역</option>
						</select>
					</td>
					<td><input type="search" name="searchL" size="30">&nbsp;</td>
					<td><input type="submit" value="검색"></td>
				</tr>
			</table><br>
		</div>
	</form>
	<header><h2>쇼핑몰 회원관리 ver 1.0</h2></header>
	<menu>
		<li><a href="memberJoin.jsp">회원등록</a></li>
		<li><a href="memberList.jsp">회원목록조회/수정</a></li>
		<li><a href="moneyList.jsp">회원매출조회</a></li>
		<li><a href="index.jsp">홈으로</a></li>
	</menu>
</body>
</html>