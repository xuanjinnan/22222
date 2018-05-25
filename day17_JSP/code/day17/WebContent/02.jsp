<%@ page language="java"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title></title>
</head>
<body>
	<h1>JSP</h1>
	<%
		pageContext.setAttribute("addr", "北京");
	%>
	
	
	
	<%= pageContext.getAttribute("addr") %>
	
</body>
</html>





