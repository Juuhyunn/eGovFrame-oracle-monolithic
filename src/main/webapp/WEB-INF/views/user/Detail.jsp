<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>

<body>

<h2>사용자 상세 (findById)</h2>

<form action="<%= application.getContextPath() %>/customers/detail/custId">
<h3>Id로 찾기</h3>
  <div class="container">
    <label for="custId"><b>조회할 사용자 Id</b></label>
    <input type="text" placeholder="Enter custId" name="custId" required>
    <button type="submit">Detail</button>
  </div>
</form><hr/>
<form action="<%= application.getContextPath() %>/customers/detail/custName">
<h3>Name으로 찾기</h3>
  <div class="container">
    <label for="custName"><b>조회할 사용자 Name</b></label>
    <input type="text" placeholder="Enter custName" name="custName" required>
    <button type="submit">Detail</button>
  </div>
</form><hr/>
<form action="<%= application.getContextPath() %>/customers/detail/address">
<h3>address로 찾기</h3>
  <div class="container">
    <label for="address"><b>조회할 사용자 address</b></label>
    <input type="text" placeholder="Enter address" name="address" required>
    <button type="submit">Detail</button>
  </div>
</form><hr/>
<form action="<%= application.getContextPath() %>/customers/detail/phone">
<h3>phone로 찾기</h3>
  <div class="container">
    <label for="phone"><b>조회할 사용자 phone</b></label>
    <input type="text" placeholder="Enter phone" name="phone" required>
    <button type="submit">Detail</button>
  </div>
</form><hr/>

  <div>
  <button type="button" onclick="location.href='./custDetail'">Detail</button>
  <button type="button" onclick="location.href='./custList'">List</button>
  <button type="button" onclick="location.href='./custRegi'">Register</button>
  <button type="button" onclick="location.href='./custUp'">Update</button>
  <button type="button" onclick="location.href='./custDel'">Delete</button>
  <button type="button" onclick="location.href='./custLogin'">Login</button>
  </div>

</body>
</html>