<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.Calendar"%>
<%!int global_cnt = 0;%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>

	<!-- 주석문 -->
	<%-- 주석문2 이건 소스보기에서 볼 수가 있음--%>
	<%
	// 이곳은 자바 코드로 인식하기 때문에 //로 주석 달아야함
	int local_cnt = 0;

	out.print("<br> local_cnt : ");
	out.print(++local_cnt);

	out.print("<br> global_cnt : ");
	out.print(++global_cnt + "<br>");

	Calendar date = Calendar.getInstance();
	SimpleDateFormat today = new SimpleDateFormat("yyyy년 MM월 dd일");
	%>

	<%=today.format(date.getTime())%>
</body>
</html>