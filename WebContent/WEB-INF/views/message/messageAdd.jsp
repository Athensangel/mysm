<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/message/saveMessages" method="post">
<table border="1px;">
	<tr>
		<th>姓名</th>
		<th>留言时间</th>
		<th>留言内容 </th>
		<th>留言邮箱地址</th>
	</tr>
	<tr>
	<td><input name="name"></td>
	<td><input name="createTime"></td>
	<td><input name="content"></td>
	<td><input name="email"></td>
	</tr>
</table>
   <input type="submit" value="添加">
</form>
</body>
</html>