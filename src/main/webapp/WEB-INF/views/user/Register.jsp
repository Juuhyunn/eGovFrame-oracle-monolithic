<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%= application.getContextPath() %>"/>    

<jsp:include page="../common/head.jsp"/>
<body>

<h2>사용자 추가(회원가입)</h2>

<form action="${ctx}/customers/register" method="post">
  <div class="container">
    <label for="custId"><b>custId</b></label>
    <input type="text" placeholder="Enter custId" name="custId" required>

    <label for="custName"><b>custName</b></label>
    <input type="text" placeholder="Enter custName" name="custName" required>
    
    <label for="address"><b>address</b></label>
    <input type="text" placeholder="Enter address" name="address" required>

    <label for="phone"><b>phone</b></label>
    <input type="text" placeholder="Enter phone" name="phone" required>
        
    <button type="submit">Register</button>
  </div>
</form>
<form action="${ctx}/oracle">
  <div class="container">  
    <button type="submit">Go~!</button>
  </div>
</form>
</body>
</html>