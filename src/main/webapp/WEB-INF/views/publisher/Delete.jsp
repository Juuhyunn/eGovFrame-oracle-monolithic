<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<%-- <%= application-getContextPath() %> --%>
<body>

<h2>출판사 삭제</h2>

<form action="<%= application.getContextPath() %>/pubs/delete">
  <div class="imgcontainer">
    <img src="img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="pubId"><b>삭제할 출판사 Id</b></label>
    <input type="text" placeholder="Enter pubId" name="pubId" required>
        
    <button type="submit">Delete</button>

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