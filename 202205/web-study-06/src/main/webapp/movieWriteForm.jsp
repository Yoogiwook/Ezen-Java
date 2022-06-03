<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table tr td:first-child {
	text-align: center;
}
span{ margin: 10px 10px 0 330px;}
</style>
</head>
<body>
<h1>정보 등록</h1>
<form method="post" action="movieWrite.jsp">
	<table>
		<tr>
			<td>제목</td>
			<td><input type="text" name="title"></td>
		</tr>
		<tr>
			<td>가격</td>
			<td><input type="text" name="price">원</td>
		</tr>
		<tr>
			<td>감독</td>
			<td><input type="text" name="director"></td>
		</tr>
		<tr>
			<td>출연배우</td>
			<td><input type="text" name="actor"></td>
		</tr>
		<tr>
			<td>시놉시스</td>
			<td><textarea rows="15" cols="50" name="synopsis"></textarea>
		</tr>
		<tr>
			<td>장르</td>
			<td>
				<select name="genre">
					<option selected>로맨스</option>
					<option>스릴러</option>
					<option>미스터리</option>
					<option>액션</option>
					<option>코미디</option>
					<option>애니매이션</option>
				</select>
			</td>
		</tr>
	</table>
	<span>
		<input type="submit" value="확인"> &nbsp;&nbsp;
		<input type="reset" value="취소">
	</span>
</form>

</body>
</html>