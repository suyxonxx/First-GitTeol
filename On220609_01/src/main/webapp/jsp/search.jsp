<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.shopmanager.dao.*, java.net.URLEncoder"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>search</title>
</head>
<body>
	<form method="get" action="search_impl.jsp">
		<div id="search_area">
			<table id="search">
				<tr>
					<td style="font-weight:bold;">회원 찾기 : 
						<select name="type">
							<option value="custno">회원번호</option>
							<option value="custname">회원성명</option>
							<option value="phone">회원전화</option>
							<option value="address">회원주소</option>
							<option value="joindate">가입일자</option>
							<option value="grade">고객등급</option>
							<option value="city">도시코드</option>
						</select>
					</td>
					<td><input type="search" name="search" size="30">&nbsp;</td>
					<td><input type="submit" value="검색"></td>
				</tr>
			</table><br>
		</div>
	</form>
</body>
</html>