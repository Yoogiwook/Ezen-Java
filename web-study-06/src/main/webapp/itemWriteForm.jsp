<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>정보 입력 폼</h1>
<form method="post" action="itemWrite.jsp">
	<table>
		<tr>
			<td> 상품명 </td>
			<td> <input type="text" name="name"></td>
		</tr>
		<tr>
			<td> 가격 </td>
			<td> <input type="text" name="price"></td>
		</tr>
		<tr>
			<td> 설명 </td>
			<td> <textarea rows="10" cols="30" name="description"></textarea>
		</td>
	</table>
	<input type="submit" value="전송">
	<input type="reset" value="취소">
</form>
</body>
</html>