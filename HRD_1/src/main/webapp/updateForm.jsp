<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*,javax.sql.*" %>
<%
	request.setCharacterEncoding("utf-8");
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "system";
	String pwd = "1234";
	String sql = "select * from member_tbl_03 where custno = ?";
	String custno = request.getParameter("custno");
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,id,pwd);
		ps = conn.prepareStatement(sql);
		ps.setInt(1, Integer.parseInt(custno));
		rs = ps.executeQuery();
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
		<h3>회원정보수정</h3>
		<form method="post" action="updateImpl.jsp" name="frm">
<%
	if(rs.next()){
%>
			<table border="1" style="margin-left: auto; margin-right: auto;">
				<tr>
					<th>회원번호</th>
					<td><input type="text" name="custno" value="<%=rs.getString(1) %>"></td>
				</tr>
				<tr>
					<th>회원성명</th>
					<td><input type="text" name="custname" value="<%=rs.getString(2) %>"></td>
				</tr>
				<tr>
					<th>회원전화</th>
					<td><input type="text" name="phone" value="<%=rs.getString(3) %>"></td>
				</tr>
				<tr>
					<th>주소</th>
					<td><input type="text" name="address" value="<%=rs.getString(4) %>"></td>
				</tr>
				<tr>
					<th>가입일자</th>
					<td><input type="text" name="joindate" value="<%=rs.getString(5).substring(0,10) %>"></td>
				</tr>
				<tr>
					<th>고객등급[A:VIP,B:일반,C:직원]</th>
					<td><input type="text" name="grade" value="<%=rs.getString(6) %>"></td>
				</tr>
				<tr>
					<th>도시코드</th>
					<td><input type="text" name="city" value="<%=rs.getString(7) %>"></td>
				</tr>
				<tr>
					<th colspan="2">
						<input type="submit" value="수 정" onclick="return joinChk()">
						<input type="button" value="조 회" onclick="location.href='memberForm.jsp'">
					</th>
				</tr>
			</table>
<%
	}
%>
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
