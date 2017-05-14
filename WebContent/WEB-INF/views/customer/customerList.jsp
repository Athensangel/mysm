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
<form action="">
 <a href="${pageContext.request.contextPath}/customer/jumpSavaCustomer" >添加</a>
<table border="1px;">
	<tr>
		<th>id号</th>
		<th>姓名</th>
		<th>性别</th> 
		<th>电话号码</th>
		<th>电子邮箱 </th>
		<th>订单</th>
		<th>操作</th>
	</tr>
	<c:forEach var="customer" items="${customerVoList}" varStatus="status">
	<tr>
		<td>${customer.cid}</td>
		<td>${customer.name}</td>
		<td>${customer.gender}</td>
		<td>${customer.phone}</td>
		<td>${customer.email}</td>
		<td>${customer.orders}</td>
		<td><a href="${pageContext.request.contextPath}/customer/jumpUpdateCustomer?cid=${customer.cid}" >编辑|</a>
	     <a href="${pageContext.request.contextPath}/customer/delCustomers?cid=${customer.cid}" >删除</a>
		</td>
	</tr>
	</c:forEach>
</table>
</form>
</body>
</html>