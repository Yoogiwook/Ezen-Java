<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" >
	function nicknameok(){
		opener.form.us_nickname.value = document.form.us_nickname.value;
		opener.form.renickname.value = document.form.us_nickname.value;
		self.close();
	}
</script>
<title>중복체크</title>
</head>
<body>
	<h2>닉네임 중복확인</h2>
	<form action="nicknameCheck" method="post" name="form">
		닉네임 :
		<input type="text" name="us_nickname" value="${nickname}">
		<input type="submit" value="중복체크">
		<br>

		<c:if test="${result == 'N'}">
			${nickname}는 이미 사용중인 닉네임 입니다.
		</c:if>

		<c:if test="${result == 'Y'}">
			${nickname}는 사용 가능한 닉네임 입니다.
			<input type="button" value="사용" class="cancel"
				onclick="nicknameok()"
			>
		</c:if>
	</form>
</body>
</html>