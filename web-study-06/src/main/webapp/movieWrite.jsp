<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="movie" class="com.mission.javabeans.MovieBean" />
<jsp:setProperty name="movie" property="*" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table tr td:first-child { text-align: center; }
</style>
</head>
<body>
<h1>입력 완료된 정보</h1>
<table>
	<tr>
		<td>제목</td>
		<td><%= movie.getTitle() %></td>
	</tr>
	<tr>
		<td>가격</td>
		<td><%= movie.getPrice() %></td>
	</tr>
	<tr>
		<td>감독</td>
		<td><%= movie.getDirector() %></td>
	</tr>
	<tr>
		<td>출연배우</td>
		<td><%= movie.getActor() %></td>
	</tr>
	<tr>
		<td>시놉시스</td>
		<td><textarea rows="15" cols="50"><%= movie.getSynopsis() %></textarea></td>
	</tr>
	<tr>
		<td>장르</td>
		<td><%= movie.getGenre() %></td>
	</tr>
	
</table>
</body>
</html>