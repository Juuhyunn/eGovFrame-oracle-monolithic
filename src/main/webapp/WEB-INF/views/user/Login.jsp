<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>Login</h2>

<form action="<%= application.getContextPath() %>/customers/login " method="post">

  <div class="container">
    <label for="custId"><b>custId</b></label>
    <input type="text" placeholder="Enter custId" name="custId" required>

    <label for="custName"><b>custName</b></label>
    <input type="text" placeholder="Enter custName" name="custName" required>
        
    <button type="submit">Login</button>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>
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