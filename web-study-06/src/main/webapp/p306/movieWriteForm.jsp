<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보 등록 페이지</title>
<style type="text/css">
	textarea{width:400px; height:200px;}
	.leftside{font-weight:bold; text-align:center;}
	#bottom{text-indent: 385px;}
</style>
</head>
<body>
	<h1>정보 등록</h1>	
	<form method="post" action="movieWrite.jsp">
		<table>
			<tr>
				<td class="leftside">제목</td>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<td class="leftside">가격</td>
				<td><input type="text" name="price">원</td>
			</tr>
			<tr>
				<td class="leftside">감독</td>
				<td><input type="text" name="director"></td>
			</tr>
			<tr>
				<td class="leftside">출연배우</td>
				<td><input type="text" name="actor"></td>
			</tr>
			<tr>
				<td class="leftside">시놉시스</td>
				<td><textarea name="synopsis"></textarea></td>
			</tr>
			<tr>
				<td class="leftside">장르</td>
				<td>
					<select name="genre">
						<option>로맨스</option>
						<option>스릴러</option>
						<option>미스터리</option>
						<option selected>액션</option>
						<option>코미디</option>
						<option>애니메이션</option>
					</select>
				</td>
			</tr>
		</table>
		<div id="bottom">
			<input type="submit" value="확인">
			<input type="reset" value="취소">
		</div>
	</form>
</body>
</html>