<%@page import="com.ezen.market.OEM.OEMarketUserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
OEMarketUserVO uVo = new OEMarketUserVO();
String id = request.getParameter("id"); 
uVo.setId(id);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 중복확인</title>
<script type="text/javascript" src="script/OEM.js"></script>

</head>
<body>

	<h2>아이디 중복확인</h2>
	<form action="idChk.do" method="get" name="form">
		아이디 : <input type="text" name="id" value="<%= id %>" >
		<input type="submit" value="중복 체크" > <br>
		
		<c:if test = "${result == 1 }">
			<script type="text/javascript">
				opener.document.frm.userid.value = "";		
			</script>
			${userid}는 이미 사용 중인 아이디입니다.
		</c:if>
		
		<c:if test="${result==-1}">
			${userid}는 사용 가능한 아이디입니다.
			<input type="button" value="사용" class="cancel" onclick="idok()">
		</c:if>
	</form>

</body>
</html>