<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%
request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="board" class="com.mission.javabeans.BoardBean" />
<jsp:setProperty name="board" property="*" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table tr td:first-child {
	text-align: center;
}
</style>
</head>
<body>
	<h1>입력 완료된 정보</h1>
	<table>
		<tr>
			<td>작성자 :</td>
			<td><jsp:getProperty property="name" name="board" /></td>
<%-- 			<td><%= board.getName() %> --%>
		</tr>
		<tr>
			<td>비밀번호 :</td>
			<td><jsp:getProperty property="pass" name="board" /></td>
		</tr>
		<tr>
			<td>이메일 :</td>
			<td><jsp:getProperty property="email" name="board" /></td>
		</tr>
		<tr>
			<td>글제목 :</td>
			<td><jsp:getProperty property="title" name="board" /></td>
		</tr>
		<tr>
			<td>글내용 :</td>
			<td><jsp:getProperty property="content" name="board" /></td>
		</tr>
	</table>
</body>
</html>