<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/movie.css">
<title>Insert title here</title>
</head>
<body>
<div id="wrap" align="center">
<h1>정보 수정</h1>
<form method="post" enctype="multipart/form-data" name="frm">
	<input type="hidden" name="code" value="${movie.code }">
	<input type="hidden" name="nonmakeImg" value="${movie.poster }">	<table>
		<tr>
			<td>
				<c:choose>
					<c:when test="${empty movie.poster }">
						<img src="images/noimage.gif">
					</c:when>
					<c:otherwise>
						<img src="images/${movie.poster }">
					</c:otherwise>
				</c:choose>
			</td>
			<td>
				<table>
					<tr>
						<th style="width:80px">제 목</th>
						<td><input type="text" name="title" value="${movie.title }" size="80"></td>
					</tr>
					<tr>
						<th style="width:80px">가 격</th>
						<td><input type="text" name="price" value="${movie.price }" size="30"> 원</td>
					</tr>
					<tr>
						<th style="width:80px">감 독</th>
						<td><input type="text" name="director" value="${movie.director }" size="80"></td>
					</tr>
					<tr>
						<th style="width:80px">배 우</th>
						<td><input type="text" name="actor" value="${movie.actor }" size="80"></td>
					</tr>
					<tr>
						<th style="width:80px">시놉시스</th>
						<td><textarea rows="20" cols="60" name="synopsis">${movie.synopsis}</textarea>
					</tr>
					<tr>
						<th style="width:80px">사 진</th>
						<td><input type="file" name="poster"></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<br>
		<input type="submit" value="수정" onclick="return movieCheck()">
		<input type="button" value="목록" onclick="location.href='movieList.do'">
</form>
</div>
</body>
</html>