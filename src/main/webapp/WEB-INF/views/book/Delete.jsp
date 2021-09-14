<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>

<body>

<h2>책 삭제</h2>

<form action="${contextPath}/books/delete">
  <div class="imgcontainer">
    <img src="img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="bookId"><b>삭제할 책 ID</b></label>
    <input type="text" placeholder="Enter bookId" name="bookId" required>
        
    <button type="submit">Delete</button>

  </div>

</form>
  <div>
  <button type="button" onclick="location.href='./bookDetail'">Detail</button>
  <button type="button" onclick="location.href='./bookList'">List</button>
  <button type="button" onclick="location.href='./bookRegi'">Register</button>
  <button type="button" onclick="location.href='./bookUp'">Update</button>
  <button type="button" onclick="location.href='./bookDel'">Delete</button>
  </div>

</body>
</html>