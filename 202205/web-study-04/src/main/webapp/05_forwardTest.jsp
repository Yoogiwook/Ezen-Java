<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	int age = Integer.parseInt(request.getParameter("age"));
	if (age <= 19) {
%> <!-- 자바 스크립트랑 자바랑 공간을 나눠줘야함 -->
<script type="text/javascript">
	alert("19세 미만이므로 입장 불가능")
	history.go(-1)
</script>
<% // 그래서 공간을 셋으로 나눔 
} else {
	request.setAttribute("name", "성윤정");
	RequestDispatcher dispatcher = request.getRequestDispatcher("05_forwardResult.jsp");
	dispatcher.forward(request, response);
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>