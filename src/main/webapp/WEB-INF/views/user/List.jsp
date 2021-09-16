<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%= application.getContextPath() %>"/>    

<jsp:include page="../common/head.jsp"/>

<body>

<h2>사용자 목록</h2>

<form action="${ctx}/customers/list" method="post">
  <div class="container">
    <button type="submit">List</button>
  </div>
</form>
<form action="${ctx}/customers/list/custName">
<h3>Name으로 찾기</h3>
  <div class="container">
    <label for="custName"><b>조회할 사용자 Name</b></label>
    <input type="text" placeholder="Enter custName" name="custName" required>
    <button type="submit">Detail</button>
  </div>
</form><hr/>
<form action="${ctx}/customers/list/address">
<h3>address로 찾기</h3>
  <div class="container">
    <label for="address"><b>조회할 사용자 address</b></label>
    <input type="text" placeholder="Enter address" name="address" required>
    <button type="submit">Detail</button>
  </div>
</form><hr/>
<form action="${ctx}/customers/list/phone">
<h3>phone로 찾기</h3>
  <div class="container">
    <label for="phone"><b>조회할 사용자 phone</b></label>
    <input type="text" placeholder="Enter phone" name="phone" required>
    <button type="submit">Detail</button>
  </div>
</form>
<form action="${ctx}">
  <div class="container">  
    <button type="submit">Go~!</button>
  </div>
</form>
</body>
</html>