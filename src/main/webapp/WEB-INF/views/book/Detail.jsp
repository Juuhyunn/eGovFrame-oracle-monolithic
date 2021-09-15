<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>

<body>

<h2>책 상세 (findById)</h2>

<form action="<%= application.getContextPath() %>/books/detail/bookId">
  <div class="imgcontainer">
    <img src="img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="bookId"><b>조회할 책 Id</b></label>
    <input type="text" placeholder="Enter bookId" name="bookId" required>
    <button type="submit">Detail</button>
  </div>

</form><hr/>
<form action="<%= application.getContextPath() %>/books/detail/bookTitle">
<h3>bookTitle으로 찾기</h3>
  <div class="container">
    <label for="bookTitle"><b>조회할 bookTitle</b></label>
    <input type="text" placeholder="Enter bookTitle" name="bookTitle" required>
    <button type="submit">Detail</button>
  </div>
</form><hr/>
<form action="<%= application.getContextPath() %>/books/detail/price">
<h3>price로 찾기</h3>
  <div class="container">
    <label for="price"><b>조회할 책 price</b></label>
    <input type="text" placeholder="Enter price" name="price" required>
    <button type="submit">Detail</button>
  </div>
</form><hr/>
<form action="<%= application.getContextPath() %>/books/detail/pubId">
<h3>pubId로 찾기</h3>
  <div class="container">
    <label for="pubId"><b>조회할 책 pubId</b></label>
    <input type="text" placeholder="Enter pubId" name="pubId" required>
    <button type="submit">Detail</button>
  </div>
</form><hr/>
  <div>
  <button type="button" onclick="location.href='./bookDetail'">Detail</button>
  <button type="button" onclick="location.href='./bookList'">List</button>
  <button type="button" onclick="location.href='./bookRegi'">Register</button>
  <button type="button" onclick="location.href='./bookUp'">Update</button>
  <button type="button" onclick="location.href='./bookDel'">Delete</button>
  </div>

</body>
</html>