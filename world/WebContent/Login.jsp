<%@page import="dao.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--	JSP의 스트립팅 요소 5가지
<%  .... %> 스크립틀릿 scriptlet 일반 자바 코드 삽입
<%@ .... %> 지시어 directive
<%= .... %> 표현식 expression
<%! .... %> 선언문 declaration
 주석 comment --%>		
 
 <!-- html 주석 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <% String uid = request.getParameter("id"); 
 	String ups = request.getParameter("ps"); 
 	 
 	 UserDAO dao = new UserDAO();
 	 
 	 int result = dao.login(uid,ups);
 	 
 	 if(result==1){
 		 out.print("아이디가 존재하지 않습니다.");
 		response.sendRedirect("login.html");
 	 }else if(result == 2){
 		 out.print("비밀번호가 일치하지 않습니다.");
 		response.sendRedirect("login.html");
 	 }else{
 		 session.setAttribute("id",	"uid");
 		 response.sendRedirect("main.jsp");
 	 }
%>
</body>
</html>