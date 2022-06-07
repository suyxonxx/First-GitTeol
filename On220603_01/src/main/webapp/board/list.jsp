<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import=" java.util.*, com.it.dao.*, java.text.* "%>

<jsp:useBean id="dao" class="com.it.dao.BoardDAO" />

<%
	//1. 사용자 입력값 받기(page)
	String strpage = request.getParameter("page");
	if (strpage == null) {
		strpage = "1";
	}
	int curpage = Integer.parseInt(strpage);
	
	//2. 데이타베이스로 부터 데이터를 읽어 온다
	List<BoardVO> list = dao.boardListData(curpage);
	int totalpage = dao.boardTotalPage();
	
	//페이지 나누기
	final int BLOCK = 3;
	int startpage = ((curpage - 1) / BLOCK * BLOCK) + 1; //1/3*3+1=2
	int endpage = ((curpage - 1) / BLOCK * BLOCK) + BLOCK; //1/3*3+3=4
	
	if (endpage > totalpage)
		endpage = totalpage;
	
	//오늘 날짜
	String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>자유게시판</title>
<style type="text/css">
.container{margin-top: 50px;}
.row{margin: 0px auto; width: 960px;}
h1{text-align: center;}
</style>
</head>
<body>
	<div class="container">
		<h1>자유게시판</h1>
		<div class="row">
			<table class="table">
				<tr>
					<td><a href="insert.jsp" class="btn btn-sm btn-primary">새글</a>
					</td>
				</tr>
			</table>
			<table class="table">
				<tr class="danger">
					<th class="text-center" width=10%>번호</th>
					<th class="text-center" width=45%>제목</th>
					<th class="text-center" width=15%>이름</th>
					<th class="text-center" width=20%>작성일</th>
					<th class="text-center" width=10%>조회수</th>
				</tr>
				<%
					for (BoardVO vo : list) {
				%>
				<tr>
					<td class="text-center" width=10%><%=vo.getNo()%></td>
					<td width=45%><a href="detail.jsp?no=<%=vo.getNo()%>">
						<%=vo.getSubject()%></a>&nbsp;
						<sup style="color: red">new</sup>
					</td>
					<td class="text-center" width=15%><%=vo.getName()%></td>
					<td class="text-center" width=20%><%=vo.getDbday()%></td>
					<td class="text-center" width=10%><%=vo.getHit()%></td>
				</tr>
				<%
					}
				%>
			</table>
			<div class="row">
				<div class="text-center">
					<ul class="pagination">
						<%
							if(startpage > 1) {
						%>
							<li><a href="list.jsp?page=<%=startpage - 1%>">&lt;</a></li>
						<%	
							}
						%>
						<%
							for(int i = startpage; i <= endpage; i++) {
								String act = "";
								if(curpage == i) act = "class=active";
						%>
							<li <%=act %>><a href="list.jsp?page=<%=i %>"><%=i %></a></li>
						<%
							}
						%>
						<%
							if(endpage < totalpage) {
						%>
							<li><a href="list.jsp?page=<%=endpage + 1%>">&gt;</a></li>
						<%
							}
						%>
					</ul>
				</div>
			</div>
		</div>
	</div>
</body>
</html>