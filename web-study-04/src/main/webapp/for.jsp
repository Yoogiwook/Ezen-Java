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
</head>
<body>
<h1>1부터 <%= request.getParameter("num") %>까지 자연수 합 구하기</h1>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	int sum = 0;
	for(int i=1; i<num+1; i++){
		out.print(i + " ");
		sum += i;
	}
	out.print(" = " + sum);
%>
</body>
</html>