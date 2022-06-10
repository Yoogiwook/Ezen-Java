<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, javax.sql.*"%>
<%
	request.setCharacterEncoding("utf-8");
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "system";
	String pwd = "1234";
	String sql = "select * from member_tbl_02 where address like ?";
	
	String search = request.getParameter("search");
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,id,pwd);
		ps = conn.prepareStatement(sql);
		ps.setString(1, "%"+search+"%");
		rs = ps.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/common.css"/>
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<section>
		<h3>회원목록조회</h3>
		<form method="post" action="searchForm.jsp">
			<div style="text-align: center;">
				<input type="text" name="search">
				<input type="submit" value="주소검색">
			</div>
		</form>
		<table border="1" style="margin-left: auto; margin-right: auto;">
			<tr>
				<th>회원번호</th>
				<th>회원성명</th>
				<th>전화번호</th>
				<th>주소</th>
				<th>가입일자</th>
				<th>고객등급</th>
				<th>거주지역</th>
			</tr>
<%
	while(rs.next()){
		String grade = "직원";
		if(rs.getString(6).equals("A")) grade = "VIP";
		else if(rs.getString(6).equals("B")) grade = "일반";
%>
			<tr>
				<td><a href="updateForm.jsp?custno=<%=rs.getString("custno") %>"><%=rs.getString(1) %></a></td>
				<td><%=rs.getString(2) %></td>
				<td><%=rs.getString(3) %></td>
				<td><%=rs.getString(4) %></td>
				<td><%=rs.getString(5).substring(0,10) %></td>
				<td><%=grade %></td>
				<td><%=rs.getString(7) %></td>
			</tr>
<%		
	}
%>
		</table>
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