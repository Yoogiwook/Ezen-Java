<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="item" class="com.mission.javabeans.itemBean"/>
<jsp:setProperty name="item" property="*"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>입력 완료된 정보</h1>
	<table>
		<tr>
			<td>상품명 </td>
			<td><%= item.getName()%></td>
		</tr>
		<tr>
			<td>가격 </td>
			<td><%= item.getPrice()%></td>
		</tr>
		<tr>
			<td>설명 </td>
			<td><%= item.getDescription() %></td>
		</tr>
	</table>

</body>
</html>