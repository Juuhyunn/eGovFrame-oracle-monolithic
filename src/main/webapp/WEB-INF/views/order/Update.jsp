<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>

<body>

<h2>주문 수정</h2>

<form action="<%= application.getContextPath() %>/orders/update" method="post">
  <div class="imgcontainer">
    <img src="img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="orderId"><b>수정할 주문 orderId</b></label>
    <input type="text" placeholder="Enter orderId" name="orderId" required>

    <label for="custId"><b>custId</b></label>
    <input type="text" placeholder="Enter custId(FK)" name="custId" required>
    
    <label for="bookId"><b>bookId</b></label>
    <input type="text" placeholder="Enter bookId(FK)" name="bookId" required>

    <label for="orderPrice"><b>orderPrice</b></label>
    <input type="text" placeholder="Enter orderPrice" name="orderPrice" required>
    
    <label for="orderDate"><b>orderDate</b></label>
    <input type="date" placeholder="Enter orderDate" name="orderDate" required>
        
    <button type="submit">Update</button>

  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
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