<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%= application.getContextPath() %>"/>    

<jsp:include page="../common/head.jsp"/>

<body>

<h2>사용자 수정</h2>

<form action="${ctx}/customers/update" method="post">
  <div class="container">
    <label for="custId"><b>수정할 회원 ID</b></label>
    <input type="text" placeholder="Enter custId" name="custId" required>
    <label for="custName"><b>custName</b></label>
    <input type="text" placeholder="Enter custName" name="custName" required>
    <label for="address"><b>address</b></label>
    <input type="text" placeholder="Enter address" name="address" required>
    <label for="phone"><b>phone</b></label>
    <input type="text" placeholder="Enter phone" name="phone" required>
    <button type="submit">Update</button>
  </div>
</form>
<h2>사용자 삭제</h2>
<form action="${ctx}/customers/delete">
  <div class="container">
    <label for="custId"><b>삭제할 회원 ID</b></label>
    <input type="text" placeholder="Enter custId" name="custId" required>     
    <button type="submit">Delete</button>
  </div>
</form>
<h2>처음으로</h2>
<form action="${ctx}">
  <div class="container">  
    <button type="submit">Go~!</button>
  </div>
</form>
</body>
</html>