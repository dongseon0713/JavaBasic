
<%@page import="java.sql.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Class.forName("com.mysql.jdbc.Driver");	//드라이버 로딩
Connection conn = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/testdb","root","0000");
//객체 생성
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM user");

String str = "";

while(rs.next()){
	str += rs.getString("no") + ". " + rs.getString("id") + ", " + rs.getString("name") + ", " + rs.getString("ts") + "<br><hr>";
}

out.print(str);


%>
</body>
</html>