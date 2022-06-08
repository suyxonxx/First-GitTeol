<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.it.dao.*"%>
<jsp:useBean id="dao" class="com.it.dao.BoardDAO"/>
<%
	int no = Integer.parseInt(request.getParameter("no"));
	BoardVO vo = dao.boardDetailData(no);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>상세보기</title>
<style type="text/css">
.container{margin-top: 50px;}
.row{margin: 0px auto; width: 960px;}
h1{text-align: center;}
</style>
</head>
<body>
	<div class="container">
		<h1>상세보기</h1>
		<div class="row">
			<table class="table">
				<tr>
					<th width=20% class="text-center info">번호</th>
					<td width=30% class="text-center"><%=vo.getNo() %></td>
					<th width=20% class="text-center info">작성일</th>
					<td width=30% class="text-center"><%=vo.getDbday() %></td>
				</tr>
				<tr>
					<th width=20% class="text-center info">이름</th>
					<td width=30% class="text-center"><%=vo.getName() %></td>
					<th width=20% class="text-center info">조회수</th>
					<td width=30% class="text-center"><%=vo.getHit() %></td>
				</tr>
				<tr>
					<th width=20% class="text-center info">제목</th>
					<td colspan="3"><%=vo.getSubject() %></td>
				</tr>
				<tr>
					<td colspan="4" class="text-left" height="200">
						<pre style="white-space:pre-wrap;border:none;background-color: white;"><%=vo.getContent() %></pre>
					</td>
				</tr>
				<tr>
					<td colspan="4" class="text-right">
						<a href="update.jsp?no=<%=vo.getNo() %>" class="btn btn-xs btn-danger">수정</a>
						<a href="delete.jsp?no=<%=vo.getNo() %>" class="btn btn-xs btn-success">삭제</a>
						<a href="list.jsp" class="btn btn-xs btn-primary">목록</a>
					</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>