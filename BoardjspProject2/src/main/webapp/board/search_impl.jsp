<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.it.dao.*" %>
<jsp:useBean id="dao" class="com.it.dao.BoardDAO"/>
<%
	response.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="vo" class="com.it.dao.BoardVO">
<jsp:setProperty property="*" name="vo"/>
</jsp:useBean>
<%
	String sel = request.getParameter("sel");
	String qr = request.getParameter("qr");
	boolean chk = dao.boardSearch(sel, qr);
	
	if(chk == true){
		response.sendRedirect("detail.jsp?no="+vo.getNo());
	}else{
%>
		<script>
			alert("검색결과 없음")
			history.back();
		</script>
<%
	}
%>