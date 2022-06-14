<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/movie.css">
<title>Insert title here</title>
</head>
<body>
<div class="wrap" align="center">
<h1>정보 등록</h1>
<form method="post" enctype="multipart/form-data" name="frm">
	<table>
		<tr>
			<th>제 목 </th>
			<td><input type="text" name="title"></td>
		</tr>
		<tr>
			<th>가 격 </th>
			<td><input type="text" name="price"></td>
		</tr>
		<tr>
			<th>감 독 </th>
			<td><input type="text" name="director"></td>
		</tr>
		<tr>
			<th>배 우 </th>
			<td><input type="text" name="actor"></td>
		</tr>
		<tr>
			<th> 설 명 </th>
			<td><textarea rows="20" cols="60" name="synopsis"></textarea>
		</td>
		<tr>
			<th> 사 진 </th>
			<td><input type="file" name="poster">
		</tr>
	</table>
	<input type="submit" value="확인" onclick="return movieCheck()">
	<input type="reset" value="취소">
	<input type="button" value="목록" onclick="location.href='movieList.do'">
</form>
</div>
</body>
</html>