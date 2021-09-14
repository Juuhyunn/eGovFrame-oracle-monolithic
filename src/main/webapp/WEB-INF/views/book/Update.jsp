<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>

<body>

<h2>책 수정</h2>

<form action="${contextPath}/books/update" method="post">
  <div class="imgcontainer">
    <img src="img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="bookId"><b>수정할 책 ID</b></label>
    <input type="text" placeholder="Enter bookId" name="bookId" required>

    <label for="bookTitle"><b>bookTitle</b></label>
    <input type="text" placeholder="Enter bookTitle" name="bookTitle" required>
    
    <label for="price"><b>address</b></label>
    <input type="text" placeholder="Enter price" name="price" required>

    <label for="pubId"><b>pubId</b></label>
    <input type="text" placeholder="Enter pubId" name="pubId" required>
        
    <button type="submit">Login</button>

  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
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