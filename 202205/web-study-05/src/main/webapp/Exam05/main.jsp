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
	<%
	//Cookie에서 name과 value를 얻어와서 비교
	Cookie[] ck = null;
	ck = request.getCookies();
	String name = null;
	if (ck != null) {
		for (Cookie c : ck) {
			if(c.getName().equals("username"))
			out.print(c.getValue());
		}
	%>
	님 안녕하세요!!<br>
	저희 홈페이지에 방문해 주셔서 감사합니다.<br>
	즐거운 시간 되세요.<br>
	<form method="post" action="logout.jsp">
		<input type="submit" value="로그아웃">
	</form>
	<%
	} else {
	%>
	<h2>로그인에 실패했습니다.</h2>
	<p> <a href="loginForm.jsp"> 되돌아가기 </a>
	<%
	}
	%>
	
</body>
</html>