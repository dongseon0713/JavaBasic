<%@page import="dao.PersonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String uid = request.getParameter("id");
	String ups = request.getParameter("ps");
	String una = request.getParameter("name");
	String uem = request.getParameter("email");


	 PersonDAO dao = new PersonDAO();
	
	if(dao.exist(uid)){
		response.sendRedirect("/person/join.jsp");
	}
	
	if(dao.insert(uid, ups, una, uem)) {
		session.setAttribute("id", uid);
		response.sendRedirect("/main.jsp");
	} 

%>