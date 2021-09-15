<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>

<body>

<h2>출판사 상세 (findById)</h2>

<form action="<%= application.getContextPath() %>/pubs/detail/pubId">
  <div class="imgcontainer">
    <img src="img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="pubId"><b>조회할 출판사 Id</b></label>
    <input type="text" placeholder="Enter pubId" name="pubId" required>
    <button type="submit">Detail</button>
  </div>

</form><hr/>
<form action="<%= application.getContextPath() %>/pubs/detail/pubName">
<h3>pubName으로 찾기</h3>
  <div class="container">
    <label for="pubName"><b>조회할 출판사 pubName</b></label>
    <input type="text" placeholder="Enter pubName" name="pubName" required>
    <button type="submit">Detail</button>
  </div>
</form><hr/>
<form action="<%= application.getContextPath() %>/pubs/detail/mgrName">
<h3>mgrName로 찾기</h3>
  <div class="container">
    <label for="mgrName"><b>조회할 출판사 mgrName</b></label>
    <input type="text" placeholder="Enter address" name="mgrName" required>
    <button type="submit">Detail</button>
  </div>
</form><hr/>
<form action="<%= application.getContextPath() %>/pubs/detail/phone">
<h3>phone로 찾기</h3>
  <div class="container">
    <label for="phone"><b>조회할 출판사 phone</b></label>
    <input type="text" placeholder="Enter phone" name="phone" required>
    <button type="submit">Detail</button>
  </div>
</form><hr/>
  <div>
  <button type="button" onclick="location.href='./pubDetail'">Detail</button>
  <button type="button" onclick="location.href='./pubList'">List</button>
  <button type="button" onclick="location.href='./pubRegi'">Register</button>
  <button type="button" onclick="location.href='./pubUp'">Update</button>
  <button type="button" onclick="location.href='./pubDel'">Delete</button>
  </div>

</body>
</html>