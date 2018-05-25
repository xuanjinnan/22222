<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title></title>
</head>
<body>
	<h1>JSTL标签库</h1>
	<h3>c:set标签</h3>
	<h5>(1)往指定的域中添加一个属性</h5>
	<c:set var="name" value="张三丰"
					 scope="page"></c:set>
	<%-- 
		scope属性: 指定将属性存入到哪一个域中, 取值为:
			page: 表示PageContext域
			request: 表示request域
			session: 表示session域
			application: 表示ServletContext域
	 --%>
	${ name }
	
	<h5>(2)修改域中已有的属性</h5>
	<c:set var="name" value="张无忌"
					 scope="page"></c:set>
	${ name }
	
	<h5>(3)修改域中Map集合中的属性</h5>
	<%
		Map map = new HashMap();
		map.put("name", "周杰伦");
		map.put("job", "歌手");
		pageContext.setAttribute("map", map);
	%>
	${ map.name }
	${ map.job }
	
	<c:set target="${ map }" 
		property="job" value="演员"></c:set>
	${ map.job }
		
		
		
	<h3>c:if标签</h3>
	<c:if test="${ 3>5 }">yes</c:if>
	<c:if test="${ !(3>5) }">no</c:if>
	

	<h3>c:forEach标签</h3>
	
	
	
	
	
	
	
	
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















