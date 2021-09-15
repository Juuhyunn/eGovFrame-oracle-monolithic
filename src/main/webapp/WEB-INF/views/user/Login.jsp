<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%= application.getContextPath() %>"/>    
    

<jsp:include page="../common/head.jsp"/>
<body>

<h2>Login</h2>

<form action="${ctx}/customers/login " method="post">

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
<form action="${ctx}/oracle">
  <div class="container">  
    <button type="submit">Go~!</button>
  </div>
</form>

</body>
</html>