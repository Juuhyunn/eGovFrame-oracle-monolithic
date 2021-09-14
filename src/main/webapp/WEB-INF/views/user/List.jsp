<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>

<body>

<h2>사용자 목록</h2>

<form action="${contextPath}/customers/ " method="post">
  <div class="imgcontainer">
    <img src="img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    
        
    <button type="submit">List</button>
    
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