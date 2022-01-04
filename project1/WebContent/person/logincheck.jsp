<%@page import="dao.PersonDAO"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    	request.setCharacterEncoding("utf-8");	// 한글 인코딩
    
    	String uid = request.getParameter("id");	//입력한 값을 String형 변수 uid에 저장
    	String ups = request.getParameter("ps");	//입력한 값을 String형 변수 ups에 저장
    	
    	PersonDAO dao = new PersonDAO();	//dao 객체 생성
    	
    	int code = dao.login(uid,ups); 	// dao.login에 uid,ups를 입력하고 결과값을 int형 변수 code로 저장
    	
    	if(code == 1){//회원 아이디가 아예 존재하지 않는 경우
    		response.sendRedirect("/join.jsp");	//join.jsp로 이동
    	}else if(code == 2){// 아이디는 디비에 존재하는데 비번이 일치하지 않는 경우
    		response.sendRedirect("/login.jsp");//login.jsp로 이동
    	}else {//아이디와 비밀번호가 모두 일치하는 경우
    		session.setAttribute("id", uid);	//세션이 유지되는 동안 id가 저장된다.
    		response.sendRedirect("/main.jsp");	//main.jsp로 이동
    	}
    
    %>