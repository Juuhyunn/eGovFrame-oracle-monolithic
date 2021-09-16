<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%= application.getContextPath() %>"/>    
    
<jsp:include page="../common/head.jsp"/>

<body>

<h2>사용자 상세 (findById)</h2>

<form action="<%= application.getContextPath() %>/customers/detail">
<h3>Id로 찾기</h3>
  <div class="container">
    <label for="custId"><b>조회할 사용자 Id</b></label>
    <input type="text" placeholder="Enter custId" name="custId" required>
    <button type="submit">Detail</button>
  </div>
</form>
<form action="${ctx}">
  <div class="container">  
    <button type="submit">Go~!</button>
  </div>
</form>

</body>
</html>