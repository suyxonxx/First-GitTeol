<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int no = Integer.parseInt(request.getParameter("no"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>삭제 확인</title>
<style type="text/css">
.container{margin-top: 50px;}
.row{margin: 0px auto; width: 960px;}
h1{text-align: center;}
</style>
<!-- <script type="text/javascript" src="http://code.jquery.com/jquery.js"></script>
<script type="text/javascript">
	$(function() {
		$('#delBtn').click(function() {
			let pwd = $('#pwd').val();
			if(pwd.trim() == "") { //비밀번호 입력값 확인 => '#(id)', '.(class)'
				$('#pwd').focus();
				return;
			}
		})
		$.ajax({
			type: 'POST',
			url: 'delete_impl.jsp',
			data: {"no": $('#no').val, "pwd": pwd};
			success:function(res) {
				let r = res.trim();
				if(r == 0) {
					alert("비밀번호를 바르게 입력해주세요.")
					$('#pwd').val("");
					$('#pwd').focus();
				} else {
					location.href = "list.jsp";
				}
			}
		})
	})
</script> -->
</head>
<body>
	<div class="container">
		<h1>삭제 확인</h1>
		<div class="row">
			<form method="get" action="delete_impl.jsp">
				<table class="table">
					<tr>
						<td class="text-center">
							비밀번호 : <input type="password" name="pwd" size="15" class="input-sm">
							<input type="hidden" name="no" value=<%=no %> id="no">
						</td>
					</tr>
					<tr>
						<td class="text-center">
							<input type="submit" value="삭제" class="btn btn-sm btn-primary" id="delBtn">
							<input type="button" value="취소" class="btn btn-sm btn-primary"
							 onclick="javascript:history.back()">
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>