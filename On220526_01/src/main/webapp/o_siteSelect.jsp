<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>웹 사이트 이동하기</title>
</head>
<body>
	<form action="o_siteTest.jsp" method="post">
		<h1>검색 엔진 정보 페이지</h1>
		<h3>검색 엔진을 선택하세요.</h3>
		<select name="site">
			<option value="https://www.naver.com" selected>네이버</option>
			<option value="https://www.daum.net">다음</option>
			<option value="https://www.nate.com">네이트</option>
			<option value="https://www.google.com">구글</option>
		</select>
			<input type="submit" value="확인">
	</form>
</body>
</html>