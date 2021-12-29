<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
	
	String uid = request.getParameter("id");
	String ups = request.getParameter("ps");
	String una = request.getParameter("name");
	
	String sql = "INSERT INTO USER(id,ps,NAME) VALUES";
	sql += "('"+ uid+ "','" + ups + "','" + una + "')";
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/testdb","root","0000");
	Statement stmt = conn.createStatement();
	
	int count = stmt.executeUpdate(sql);
	
	if(count == 1){
		out.print("회원가입 완료");
	}else{
		out.print("오류발생");
	}

%>