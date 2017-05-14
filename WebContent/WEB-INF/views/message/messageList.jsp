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
 <a href="${pageContext.request.contextPath}/message/jumpMessageAdd" >添加</a>
<table border="1px;">
	<tr>
		<th>id号</th>
		<th>姓名</th>
		<th>留言时间</th>
		<th>留言内容 </th>
		<th>留言邮箱地址</th>
		<th>操作</th>
	</tr>
	<c:forEach var="message" items="${messageList}" varStatus="status">
	<tr>
		<td>${message.id}</td>
		<td>${message.name}</td>
		<td>${message.createTime}</td>
		<td>${message.content}</td>
		<td>${message.email}</td>
		<td><a href="${pageContext.request.contextPath}/message/jumpUpdateMessage?id=${message.id}" >编辑|</a>
	     <a href="${pageContext.request.contextPath}/message/deleteMessage?id=${message.id}" >删除</a>
		</td>
	</tr>
	</c:forEach>
</table>
</form>
</body>
</html>