<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored= "false" %>
    
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Details</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="container mt-3">
      <div class="row">
      <div class="col-md-12">
      <form action="payment-procedure-flight" method="post">
      <h6 style="text-align:center;">${uname }</h6>
      <input type="hidden" name="uname" id="uname" value="${uname }" />
      <input type="hidden" name="totalamount" id="totalamount" value="${totalamount }" />
      <input type="hidden" name="from" id="from" value="${from }" />
      <input type="hidden" name="to" id="to" value="${to }" />
      <input type="hidden" name="date" id="date" value="${date }" />
      <input type="hidden" name="passengercount" id="passengercount" value="${passengercount }" />
      <input type="hidden" name="choice" id="choice" value="${choice }" />
  <c:forEach var="i" begin= "1" end="${passengercount }">
  <label>Enter Details for Passenger ${i }</label>
  <br><br>
  <label for="name">Enter Name:</label>
    <input type="text" id="name" name="name" required><br><br>
    <label for="age">Enter Age:</label>
    <input type="number" id="age" name="age" required><br><br>
    <label for="gender">Enter Gender:</label>
    <input type="text" id="gender" name="gender" required><br><br>
    </c:forEach>
 
<button class="btn btn-warning"><a href="${pageContext.request.contextPath }/flight">Back</a></button>
<button type="submit" class="btn btn-info">Pay</button>
</form>
      </div>
      </div>
      </div>
</body>
</html>