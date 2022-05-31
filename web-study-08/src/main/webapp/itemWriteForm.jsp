<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>정보 입력 폼</h2>
	<form action="itemWriteResult.jsp" method="get">
		<table>
			<tr>
				<th>상품명 </th>
				<td>
					<input type="text" name="name">
				</td>
			</tr>
			<tr>
				<th>가 격 </th>
				<td>
					<input type="text" name="price">
				</td>
			</tr>
			<tr>
				<th>설 명 </th>
				<td>
					<textarea rows="20" cols="50" name="description"></textarea>
				</td>
			</tr>
		</table>
		<input type="submit" value="전송">
		<input type="reset" value="취소">
	</form>
</body>
</html>