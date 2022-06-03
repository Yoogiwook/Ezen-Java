<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
	<c:when test="${param.log == 'user'}">
		<c:redirect url="user_main.jsp?id=${param.id}"></c:redirect>
	</c:when><!-- id값을 같이 넘겨주기 위해서 .jsp뒤에 ?id=${param.id}를 붙였음 -->
	<c:otherwise>
		<c:redirect url="admin_main.jsp?id=${param.id}"></c:redirect>
	</c:otherwise>
</c:choose>
</body>
</html>