<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import ="dao.* " %>
<%@ page import ="entity.* " %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title></title>
  </head>
<body>
	<h3>学生列表</h3>
	<table width="500" border="1">
		<thead>
			<tr>
				<th>id</th>
				<th>姓名</th>
				<th>年龄</th>
				<th>地址</th>
			</tr>
		</thead>
		<tbody>
			<%
			List list=StudentDao.getInstances().findAll();
			for(Object o : list){
				Student s=(Student)o;
				out.println("<tr>");
				out.println("<td>"+s.getId()+"</td>");
				out.println("<td>"+s.getName()+"</td>");
				out.println("<td>"+s.getAge()+"</td>");
				out.println("<td>"+s.getAddress()+"</td>");
				out.println("</tr>");
			}
			%>
		</tbody>
	</table>
  </body>
</html>
