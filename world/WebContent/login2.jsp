<%-- 지시어 directive 
	페이지 처리를 위해 부가적인 정보를 정의하는 데 이용
	@ annotation
	
	page - jsp 처리 방법을 정의 import 한글 설정
	include - 다른 문서를 포함... header footer
	taglib - 태그 라이브러리 설정 JSTL JSP Standard Tag Library

 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- charset=UTF-8" pageEncoding="UTF-8" GET 방식에서의 한글 처리 --%>
<%@ page import="java.util.Date" %>    
<%	// POST 방식에서의 한글 처리 
request.setCharacterEncoding("utf-8"); 
%>

<html>
<head>
<!-- HTML 주석 -->
<%-- JSP 주석 --%>
</head>
<body>
<%!	//	선언문
String res = "";
%>

<%@ include file="_header.jsp" %>
<!-- include 지시어를 사용할 때 주의할 점은 두 파일간에 이름이 같은 변수가 있으면 안된다.
	일반 자바에서와 똑같이 충돌이 일어나게 된다.
 -->
	<%	
	//	스크립트릿
	/*
		스크립트릿 내에 정의된 코드는 서블릿 변환시 그대로 삽입 된다.
		따라서 java 코드 형태로 실행된다.
		
	*/
	String uid = request.getParameter("id");
	String ups = request.getParameter("ps");
	
	res = "<h3>User ID : "+ uid + "</h3>";
	res += "<h4>User PS : " + ups + "</h4>";
	
	//	System.out.println(res);
	out.print(res);	//자바 스크립트에서는 출력할 때 out.print를 사용한다.
	out.print("<br>");
	out.print(new Date().toString());
	
	%>
</body>
</html>