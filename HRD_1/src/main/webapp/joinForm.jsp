<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, javax.sql.*"%>
<%
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "system";
	String pwd = "1234";
	String sql = "select max(custno) from member_tbl_03";
	int custno = 100001;
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,id,pwd);
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		if(rs.next()){
			custno = rs.getInt(1)+1;
		}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/deco.css"/>
<script type="text/javascript" src="script/Chk.js"></script>
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp" %>
		<section>
		<h3>홈쇼핑 회원 등록</h3>
			<form method="post" action="joinImpl.jsp" name="frm">
				<table border="1" style="margin-left: auto; margin-right: auto;">
					<tr>
						<th>회원번호(자동발생)</th>
						<td><input type="text" name="custno" size="10px" value="<%=custno%>"></td>
					</tr>
					<tr>
						<th>회원성명</th>
						<td><input type="text" name="custname" size="10px"></td>
					</tr>
					<tr>
						<th>회원전화</th>
						<td><input type="text" name="phone" size="20px"></td>
					</tr>
					<tr>
						<th>회원주소</th>
						<td><input type="text" name="address" size="30px"></td>
					</tr>
					<tr>
						<th>가입일자</th>
						<td><input type="text" name="joindate" size="10px"></td>
					</tr>
					<tr>
						<th>고객등급[A:VIP,B:일반,C:직원]</th>
						<td><input type="text" name="grade" size="10px"></td>
					</tr>
					<tr>
						<th>도시코드</th>
						<td><input type="text" name="city" size="10px"></td>
					</tr>
					<tr>
						<th colspan="2">
							<input type="submit" value="등 록" onclick="return joinChk()">
							<input type="button" value="조 회" onclick="location.href='memberForm.jsp'">
						</th>
					</tr>
				</table>
			</form>
		</section>
	<%@ include file="footer.jsp" %>
</body>
</html>
<%
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(conn != null) conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
%>