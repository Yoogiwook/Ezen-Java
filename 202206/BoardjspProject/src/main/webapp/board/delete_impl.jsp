<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.it.dao.*"
%>

<jsp:useBean id="dao" class="com.it.dao.BoardDAO" />

<%
	String no = request.getParameter("no");
	String pwd = request.getParameter("pwd");

	int result = dao.boardDelete(Integer.parseInt(no), pwd);
	if (result == 1) {
%>
	<script>
		alert("데이터가 삭제됐습니다.");
		location.href="list.jsp";
	</script>
<%
	} else {
%>
	<script>
		alert("비밀번호가 틀립니다.");
		history.back();
	</script>
<%
	}
%>