<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%
request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h1 { padding: 0 0 0 30px;}
table { border: 1px solid;}
table tr td :first-child {
	background-color: #D6EEEE;
	text-align: center;
}
</style>
</head>
<body>
	<h1>게시판 글쓰기</h1>
	<form method="post" action="boardWrite.jsp">
		<table>
			<tr>
				<td><b>작성자</b></td>
				<td><input type="text" name="name" size="20"></td>
			</tr>
			<tr>
				<td><b>비밀번호</b></td>
				<td><input type="password" name="pass" size="20">(게시물 수정 삭제시 필요합니다)</td>
			</tr>
			<tr>
				<td><b>이메일</b></td>
				<td><input type="text" name="email" size="20"></td>
			</tr>
			<tr>
				<td><b>글 제목</b></td>
				<td><input type="text" name="title" size="50"></td>
			</tr>
			<tr>
				<td><b>글 내용</b></td>
				<td><textarea name="content" rows="20" cols="70"></textarea>
			</tr>

		</table>
		<input type="submit" value="등록">
		&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset" value="다시 작성">
	</form>
</body>
</html>