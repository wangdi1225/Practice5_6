<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<table align="center" width="20%" border=1>
<h3 align="center">
<a href="add.jsp">点击添加表单</a>
</h3>
<tr>
<th width="20%">编号</th><th width="20%">参数名</th><th width="20%">参数值</th><th width="20%">备注</th>
</tr>
<c:forEach items="${clothesList }" var="clothes">
		<tr>
		<td><label>${clothes.id }</label></td>
		<td> <label>${clothes.param_name }</label></td>
		<td><label>${clothes.param_value }</label></td>
		<td><label>${clothes.remark }</label></td>
		<td><a href="edit_do?id=${clothes.id}">修改</a></td>
    	<td><a href="delete_do?id=${clothes.id}">删除</a></td>
		</tr>
</c:forEach>
	
		
	<tr>
</table>
</body>
</html>