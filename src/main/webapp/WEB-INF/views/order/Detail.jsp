<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>

<body>

<h2>주문 상세 (findById)</h2>

<form action="<%= application.getContextPath() %>/orders/detail/orderId">
  <div class="imgcontainer">
    <img src="img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="orderId"><b>조회할 주문 Id</b></label>
    <input type="text" placeholder="Enter orderId" name="orderId" required>
    <button type="submit">Detail</button>
  </div>

</form><hr/>
<form action="<%= application.getContextPath() %>/orders/detail/custId">
<h3>custId으로 찾기</h3>
  <div class="container">
    <label for="custId"><b>조회할 주문 custId</b></label>
    <input type="text" placeholder="Enter custId" name="custId" required>
    <button type="submit">Detail</button>
  </div>
</form><hr/>
<form action="<%= application.getContextPath() %>/orders/detail/bookId">
<h3>bookId로 찾기</h3>
  <div class="container">
    <label for="bookId"><b>조회할 주문 bookId</b></label>
    <input type="text" placeholder="Enter address" name="bookId" required>
    <button type="submit">Detail</button>
  </div>
</form><hr/>
<form action="<%= application.getContextPath() %>/orders/detail/orderPrice">
<h3>orderPrice로 찾기</h3>
  <div class="container">
    <label for="orderPrice"><b>조회할 주문 orderPrice</b></label>
    <input type="text" placeholder="Enter orderPrice" name="orderPrice" required>
    <button type="submit">Detail</button>
  </div>
</form><hr/>
<form action="<%= application.getContextPath() %>/orders/detail/orderDate">
<h3>orderDate로 찾기</h3>
  <div class="container">
    <label for="orderDate"><b>조회할 주문 orderDate</b></label>
    <input type="text" placeholder="Enter orderDate" name="orderDate" required>
    <button type="submit">Detail</button>
  </div>
</form><hr/>
  <div>
  <button type="button" onclick="location.href='./orderDetail'">Detail</button>
  <button type="button" onclick="location.href='./orderList'">List</button>
  <button type="button" onclick="location.href='./orderRegi'">Register</button>
  <button type="button" onclick="location.href='./orderUp'">Update</button>
  <button type="button" onclick="location.href='./orderDel'">Delete</button>
  </div>

</body>
</html>