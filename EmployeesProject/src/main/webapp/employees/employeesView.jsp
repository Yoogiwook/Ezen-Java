<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/emp.css">
</head>
<body>
<div id="wrap" align="center">
<h1>정보 보기</h1>
<table>
	<tr>
		<th>아이디</th>
		<td>${emp.id}</td>
	</tr>
	<tr>
		<th>비밀번호</th>
		<td>${emp.pass}</td>
	</tr>
	<tr>
		<th>이름</th>
		<td>${emp.name}</td>
	</tr>
	<tr>
		<th>권한</th>
			<c:choose>
				<c:when test="${emp.lev == 'A'}">
					<td>운영자</td>
				</c:when>
				<c:otherwise>
					<td>일반사원</td>
				</c:otherwise>
			</c:choose> 
	</tr>
	<tr>
		<th>성별</th>
			<c:choose>
				<c:when test="${emp.gender == '1' }">
					<td>남자</td>
				</c:when>
				<c:otherwise>
					<td>여자</td>
				</c:otherwise>
			</c:choose>
	</tr>
	<tr>
		<th>전화번호</th>
		<td>${emp.phone}</td>
	</tr>
	<tr>
		<th>가입일</th>
		<td><fmt:formatDate value="${emp.enter}"/></td>
	</tr>
</table>
<br><br>
<input type="button" value="수정" 
	onclick="location.href='EmployeesServlet?command=employees_update_form&name=${emp.name}' " >
<input type="button" value="삭제" 
	onclick="location.href='EmployeesServlet?command=employees_delete&name=${emp.name}' ">
<input type="button" value="목록"  onclick="location.href='EmployeesServlet?command=employees_list'">
<input type="button" value="등록"  onclick="location.href='EmployeesServlet?command=employees_write_form'">
</div>
</body>
</html>