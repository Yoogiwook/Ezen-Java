<%@page import="util.DBManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="util.*"%>
<%
	DBManager.getConnection();
%>
 <jsp:forward page="productList.do" />