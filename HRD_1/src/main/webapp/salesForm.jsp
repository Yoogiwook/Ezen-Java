<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, javax.sql.*" %>
<%
	request.setCharacterEncoding("utf-8");
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "system";
	String pwd = "1234";
	String sql = "select M.custno, M.custname, M.grade, sum(O.price) " 
			+ "from member_tbl_03 M, money_tbl_03 O where M.custno = O.custno "
			+ "group by M.custno, M.custname, M.grade order by sum(O.price) desc";
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,id,pwd);
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/deco.css"/>
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<section>
	<h3>회원매출조회</h3>
		<table border="1" style="margin-left: auto; margin-right: auto;">
			<tr>
				<th>회원번호</th>
				<th>회원이름</th>
				<th>회원등급</th>
				<th>매출</th>
			</tr>
<%
	while(rs.next()){
		String grade="직원";
		if(rs.getString(3).equals("A")) grade="VIP";
		else if(rs.getString(3).equals("B")) grade="일반";
%>
			<tr>
				<td><%=rs.getString(1) %></td>
				<td><%=rs.getString(2) %></td>
				<td><%=grade %></td>
				<td><%=rs.getString(4) %></td>
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