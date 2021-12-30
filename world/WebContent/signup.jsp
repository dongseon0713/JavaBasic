<%@page import="dao.UserDAO"%>
<%@page import="util.ConnectionPool"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
	
	String uid = request.getParameter("id");
	String ups = request.getParameter("ps");
	String una = request.getParameter("name");
	
	/* String sql = "INSERT INTO USER(id,ps,NAME) VALUES";
	sql += "('"+ uid+ "','" + ups + "','" + una + "')"; */
/* 	//1.드라이버 로드
	Class.forName("com.mysql.jdbc.Driver");
	//2.DB연결
	Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/testdb","root","0000"); */
			
	/* 		Connection conn = ConnectionPool.get();
	//3.SQL구문
	Statement stmt = conn.createStatement(); */
	//4.결과 받기
	UserDAO dao = new UserDAO();
	
	int count = dao.insert(uid,ups,una);
	
	if(count == 1){
		out.print("회원가입 완료");
	}else{
		out.print("오류발생");
	}

%>