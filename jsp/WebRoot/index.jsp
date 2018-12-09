<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 <title></title>
  </head>
  	<h1>jsp</h1><hr/>
	<a href="t1.jsp">显示Student列表</a><p/>
	<a href="t2.jsp">request请求携带参数1</a><p/>
	<a href="t3.jsp?name=Tom&age=22">request请求携带参数2</a><p/>
	<a href="t4.jsp">转发传值</a><p/>
  <body>
   
  </body>
</html>
