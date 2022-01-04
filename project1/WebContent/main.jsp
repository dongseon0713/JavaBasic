<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="util.ConnectionPool"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록 프로그램</title>
</head>
<body>
<%@ include file = "_header.jsp" %>
	<%
		String uid = (String) session.getAttribute("id");

	if (uid == null) {
		response.sendRedirect("/person/login.jsp");
	}

	session.setAttribute("id", uid);
	%>
	<div class="container">
		<form action="/memo/memocheck.jsp">
			<div class="form-floating">
				<textarea class="form-control" name="memo"
					placeholder="Leave a comment here" id="floatingTextarea2"
					style="height: 100px"></textarea>
				<label for="floatingTextarea2">메모</label>
			</div>
			<button class="w-100 btn btn-lg btn-primary" type="submit">완료</button>
		</form>

		<table align=center>
			<%
			Connection conn = ConnectionPool.get();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM tbvisit ORDER BY no DESC");

			while (rs.next()) {
			%>
			<tr><td colspan=2><hr></td></tr>
			<tr><td><%=rs.getString("no")%>  <%=rs.getString("memo")%></td>
			<%
				}
			%>
		</table>
	</div>
<%@ include file = "_footer.jsp" %>
</body>
</html>