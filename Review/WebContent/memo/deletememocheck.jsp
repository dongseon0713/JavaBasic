<%@page import="dao.MemoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");


	String uid = request.getParameter("id");
	String ume = request.getParameter("memo");

	 MemoDAO dao = new MemoDAO();
	
	if(dao.insert1(uid,ume)){
		response.sendRedirect("deletememo.jsp");
	}



%>