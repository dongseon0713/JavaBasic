<%@page import="dao.VisitDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String ume = request.getParameter("memo");
	String sid = (String) session.getAttribute("id");

	VisitDAO dao = new VisitDAO();
	
	if(dao.insert(sid, ume)){
		response.sendRedirect("/main.jsp");
	}
	%>