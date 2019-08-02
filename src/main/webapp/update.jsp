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

<form name="" action="update_do" method="post"><hr><!-- 制作修改表单 -->
<table align="center" width="20%" border=1>
<caption>修改表单</caption>
<tr>
<th >编号</th>
<td >${clothes.id}</td>

<input type="hidden" name="id" value="${clothes.id}">
</tr>
<tr>
<th width="30%">参数名</th>
<td width="70%"><input name="param_name" type="text" value="${clothes.param_name}"></td>
</tr>
<tr>
<th width="30%">参数值</th>
<td width="70%"><input name="param_value" type="text" value="${clothes.param_value}"></td>
</tr>
<tr>
<th width="30%">备注</th>
<td width="70%"><input name="remark" type="text" value="${clothes.remark}"></td>
</tr>
<tr>
<th colspan="2">
<input type="submit" name="submit" value="修改">
<input type="reset" value="重置">
</th>
</tr>
</table>
</form>
</body>
</html>