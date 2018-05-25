<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title></title>
</head>
<body>
	<h1>EL表达式</h1>
	<h3>(1)获取常量或变量(必须先存入域中)的值</h3>
	${ "Hello JSP" }
	
	<% 
		String name = "关羽"; 
		request.setAttribute("name1", name);
	%>
	${ name1 }
	
	<h3>(2)获取域中的数组或者集合中的数据</h3>
	<%
		String[] names = {"陈子枢","王海涛","齐雷"};
		request.setAttribute("names",names);
	%>
	${ names[0] }
	${ names[1] }
	${ names[2] }
	
	<h3>(3)获取域中的Map集合中的数据</h3>
	<%
		Map map = new HashMap();
		map.put("name", "林青霞");
		map.put("age", 18);
		pageContext.setAttribute("map", map);
	%>
	${ map.get("name") }
	${ map.name }
	${ map["name"] }
	
	${ 3 > 5 ? "yes" : "no" }
	
	
	
</body>
</html>