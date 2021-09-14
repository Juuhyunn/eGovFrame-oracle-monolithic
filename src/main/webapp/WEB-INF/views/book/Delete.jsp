<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>

<body>

<h2>사용자 삭제</h2>

<form action="${contextPath}/customers/delete">
  <div class="imgcontainer">
    <img src="img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="custId"><b>삭제할 회원 ID</b></label>
    <input type="text" placeholder="Enter custId" name="custId" required>
        
    <button type="submit">Delete</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
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