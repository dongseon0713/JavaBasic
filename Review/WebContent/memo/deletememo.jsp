<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="util.ConnectionPool"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제 메모</title>
</head>
<body class="text-center">
	<%@ include file="/_header.jsp"%>
	<div class="alert alert-info" role="alert">삭제 메모</div>

	<table align=center>
		<%
		Connection conn = ConnectionPool.get();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM deletememo");

		while (rs.next()) {
		%>
		<tr>
			<td colspan=2><hr></td>
		</tr>
		<tr>
			<td><%=rs.getString("no")%></td>
			<td><small><%=rs.getString("ts")%></small></td>
		</tr>
		<tr>
			<td colspan=2><%=rs.getString("memo")%></td>
		</tr>
		<%
			}
		%>
	</table>
	<%@ include file="/_footer.jsp"%>
</body>
</html>