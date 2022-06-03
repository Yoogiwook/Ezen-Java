<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
<c:when test="${param.color == 1}">
	<span style="color: red;">빨강</span>
</c:when>
<c:when test="${param.color == 2}">
	<span style="color: green;">초록</span>
</c:when>
<c:otherwise>
	<span style="color: blue;">파랑</span>
</c:otherwise>
</c:choose>

</body>
</html>