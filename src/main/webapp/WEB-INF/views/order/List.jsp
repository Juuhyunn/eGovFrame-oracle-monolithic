<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>

<body>

<h2>주문 목록</h2>

<form action="${contextPath}/orders/list " method="post">
  <div class="imgcontainer">
    <img src="img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <button type="submit">List</button>
  </div>
</form>
  <div>
  <button type="button" onclick="location.href='./orderDetail'">Detail</button>
  <button type="button" onclick="location.href='./orderList'">List</button>
  <button type="button" onclick="location.href='./orderRegi'">Register</button>
  <button type="button" onclick="location.href='./orderUp'">Update</button>
  <button type="button" onclick="location.href='./orderDel'">Delete</button>
  </div>
</body>
</html>