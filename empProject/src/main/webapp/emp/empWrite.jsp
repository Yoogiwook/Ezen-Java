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
<div id="wrap" align="center">

<h1>정보 등록</h1>
<form name="frm" method="post" action="EmpServlet?command=emp_write_action">
	<table>
		<tr>
			<th>아이디</th>		
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<th>비밀번호</th>		
			<td><input type="password" name="pass"></td>
		</tr>
		<tr>
			<th>이름</th>		
			<td><input type="text" name="name"></td>
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
			<td><input type="text" name="phone"></td>
		</tr>
	</table>	
	<br><br>
	<input type="submit" value="확인" onclick="return empCheck()">
	<input type="reset" value="취소">
	<input type="button" value="목록" onclick="location.href='EmpServlet?command=emp_list'">
</form>
</div>
</body>
</html>