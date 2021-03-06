<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>

<body>

<h2>출판사 수정</h2>

<form action="<%= application.getContextPath() %>/pubs/update" method="post">
  <div class="imgcontainer">
    <img src="img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="orderId"><b>수정할 출판사 orderId</b></label>
    <input type="text" placeholder="Enter pubId" name="pubId" required>

    <label for="pubName"><b>pubName</b></label>
    <input type="text" placeholder="Enter pubName" name="pubName" required>
    
    <label for="mgrName"><b>mgrName</b></label>
    <input type="text" placeholder="Enter mgrName" name="mgrName" required>

    <label for="phone"><b>phone</b></label>
    <input type="text" placeholder="Enter phone" name="phone" required>
        
    <button type="submit">Update</button>

  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>
  <div>
  <button type="button" onclick="location.href='./pubDetail'">Detail</button>
  <button type="button" onclick="location.href='./pubList'">List</button>
  <button type="button" onclick="location.href='./pubRegi'">Register</button>
  <button type="button" onclick="location.href='./pubUp'">Update</button>
  <button type="button" onclick="location.href='./pubDel'">Delete</button>
  </div>

</body>
</html>