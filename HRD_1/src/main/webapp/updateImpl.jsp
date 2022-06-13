<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, javax.sql.*"%>
<%
	request.setCharacterEncoding("utf-8");
	String custno = request.getParameter("custno");
	String custname = request.getParameter("custname");
	String phone = request.getParameter("phone");
	String address = request.getParameter("address");
	String joindate = request.getParameter("joindate");
	String grade = request.getParameter("grade");
	String city = request.getParameter("city");
	
	Connection conn = null;
	PreparedStatement ps = null;
	String sql = "update member_tbl_03 set custname=?, phone=?, address=?, "
				+ "joindate=?, grade=?, city=? where custno=?";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "system";
	String pwd = "1234";
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,id,pwd);
		ps = conn.prepareStatement(sql);
		ps.setString(1, custname);
		ps.setString(2, phone);
		ps.setString(3, address);
		ps.setString(4, joindate);
		ps.setString(5, grade);
		ps.setString(6, city);
		ps.setString(7, custno);
		ps.executeUpdate();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(ps != null) ps.close();
			if(conn != null) conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
%>
<script type="text/javascript">
	alert("회원정보 수정이 완료됐습니다.");
	location.href="memberForm.jsp";
</script>