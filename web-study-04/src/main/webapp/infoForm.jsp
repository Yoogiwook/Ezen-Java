<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	가입할 ID와 Password 및 자기소개를 입력하세요.
	<form action="infoResult.jsp" method="post">
		ID : <input type="text" name="id"><br> 
		Password :	<input type="password" name="pw"><br>
		자기소개<br>
		<textarea name="desc" cols="50" rows="4"></textarea><br>
		<input type="submit" value="전송">
		<input type="reset" value="초기화">

	</form>
</body>
</html>