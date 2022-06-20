<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="wrap" align="center">
	<h1>리스트</h1>
	<table>
		<tr>
			<td colspan="5" align="right">
				<a href="EmpServlet?command=emp_write_form_action">정보 등록</a>
			</td>
		</tr>
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>권한</th>
			<th>성별</th>
			<th>전화번호</th>
		</tr>
		<c:forEach var="emp" items="${ emplist}">
		<tr>
			<td>${ emp.id }</td>
			<td><a href="EmpServlet?command=emp_view&id=${ emp.id }">${emp.name }</a></td>
			<c:choose>
				<c:when test="${emp.lev == 'A'}">
					<td>운영자</td>
				</c:when>
				<c:otherwise>
					<td>일반사원</td>
				</c:otherwise>
			</c:choose>
			<c:choose>
				<c:when test="${emp.gender == '1'}">
					<td>남자</td>
				</c:when>
				<c:otherwise>
					<td>여자</td>
				</c:otherwise>
			</c:choose>
			<td>${emp.phone }</td>
		</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>