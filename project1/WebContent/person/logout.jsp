<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
    	session.invalidate(); //세션을 완전히 삭제
    
		response.sendRedirect("/person/login.jsp"); //person폴더 안에 login.jsp로 이동
    
    %>