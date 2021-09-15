<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%= application.getContextPath() %>"/>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Hello Spring MVC! 시작이당</h2>
<hr><h3>Customer</h3>
<ol>
<li><a href="${ctx}/move/user/Login">Login</a></li>
<li><a href="${ctx}/move/user/Detail">Detail</a></li>
<li><a href="${ctx}/move/user/List">List</a></li>
<li><a href="${ctx}/move/user/Register">Register</a></li>
<li><a href="${ctx}/move/user/Update">Update</a></li>
</ol>
<hr><h3>Book</h3>
<ol>
<li><a href="${ctx}/move/book/Detail">Detail</a></li>
<li><a href="${ctx}/move/book/List">List</a></li>
<li><a href="${ctx}/move/book/Register">Register</a></li>
<li><a href="${ctx}/move/book/Update">Update</a></li>
</ol>
<hr><h3>Order</h3>
<ol>
<li><a href="${ctx}/move/order/Detail">Detail</a></li>
<li><a href="${ctx}/move/order/List">List</a></li>
<li><a href="${ctx}/move/order/Register">Register</a></li>
<li><a href="${ctx}/move/order/Update">Update</a></li>
</ol>
<hr><h3>Publisher</h3>
<ol>
<li><a href="${ctx}/move/publisher/Detail">Detail</a></li>
<li><a href="${ctx}/move/publisher/List">List</a></li>
<li><a href="${ctx}/move/publisher/Register">Register</a></li>
<li><a href="${ctx}/move/publisher/Update">Update</a></li>
</ol>
</body>
</html>