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
</head>
<body>
	<form action="for.jsp" method="post">
		<h1>For문 예제</h1>
		1부터 더할 end 값 :
		<input type="text" name="num">
		<br>
		<input type="submit" value="확인">
	</form>
</body>
</html>