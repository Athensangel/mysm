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
<form action="${pageContext.request.contextPath}/customer/insertCoustomer" method="post">
<table border="1px;">
	<tr>
		<th>姓名</th>
		<th>性别</th> 
		<th>电话号码</th>
		<th>电子邮箱 </th>
		<th>订单</th>
	</tr>
	<tr>
	<td><input name="name"></td>
	<td><input name="gender"></td>
	<td><input name="phone"></td>
	<td><input name="email"></td>
	<td><input name="orders"></td>
	</tr>
</table>
   <input type="submit" value="添加">
</form>
</body>
</html>