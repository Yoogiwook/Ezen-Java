<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="script/emp.js"></script>
</head>
<body>
<div align="center">
<h1>정보 수정</h1>
	<form name="frm" action="EmpServlet" method="post">
		<input type="hidden" name="command" value="emp_update_action">
		<input type="hidden" name="id" value="${emp.id }">
		<table>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="id" value="${emp.id }" readonly></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pass" ></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" value="${emp.name }"></td>
			</tr>
			<tr>
				<th>권한</th>
				<td>
					<select name="lev">
						<option value="A">운영자</option>
						<option value="B">일반사원</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>성별</th>
				<td>
					<select name="gender">
						<option value="1">남자</option>
						<option value="2">여자</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><input type="text" name="phone" value="${emp.phone }"></td>
			</tr>
		</table>
		<br><br>
		<input type="submit" value="확인" onclick="return empUpdateCheck()">
		<input type="reset" value="취소">
		<input type="button" value="목록" onclick="location.href='EmpServlet?command=emp_list'">
	</form>
</div>
</body>
</html>