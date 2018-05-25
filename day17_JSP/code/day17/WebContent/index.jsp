<%@page language="java"
    pageEncoding="GBK"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title></title>
</head>
<body>
	day17...index.html...<br/>
	
	<% String name = "刘德华"; %>
	
	<h1>JSP的表达式</h1>
	<%= "Hello JSP" %>
	<%= name %>
	<%= 3+4 %>
	
	
	<h1>JSP的脚本片段</h1>
	<% 
		for(int i=0;i<5;i++){
			out.print("Hello JSP<br/>");
		}
	%>
	<hr/>
	<% for(int i=0;i<5;i++){ %>
		Hello JSP<br/>
	<% } %>
	
	<h1>JSP的注释</h1>
	<% String nickname = "tom"; %>
	<%-- nickname = "tony"; --%>
	<%= nickname %>
	
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
</body>
</html>