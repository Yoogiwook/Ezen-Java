<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" >
	function idok(){
		opener.form.us_id.value = document.form.us_id.value;
		opener.form.reid.value = document.form.us_id.value;
		self.close();
	}
</script>
<title>중복체크</title>
</head>
<body>
	<h2>아이디 중복확인</h2>
	<form action="idCheck" method="post" name="form">
		아이디 :
		<input type="text" name="us_id" value="${user}">
		<input type="submit" value="중복체크">
		<br>

		<c:if test="${result == 'N'}">
			${user}는 이미 사용중인 아이디 입니다.
		</c:if>

		<c:if test="${result == 'Y'}">
			${user}는 사용 가능한 아이디입니다.
			<input type="button" value="사용" class="cancel"
				onclick="idok()"
			>
		</c:if>
	</form>
</body>
</html>