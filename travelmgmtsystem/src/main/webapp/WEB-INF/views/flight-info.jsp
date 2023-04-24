<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored= "false" %>
    
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Flight Options</title>
</head>
<body>
<div class="container mt-3">
      <div class="row">
      <div class="col-md-12">
      <form action="flight-booking" method="post">
      <table class="table">
  <thead class="thead-dark">
    <tr>
    <th scope="col"> </th>
      <th scope="col">Flight Name</th>
      <th scope="col">Departure Time</th>
      <th scope="col">Price</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${flight }" var="f">

    <tr>
    <td>
    <input type="radio" id="totalamount" name="totalamount" value="<c:out value="${f.price * passengercount}"></c:out>" />
    <input type="radio" id=${f.flightid } name="flchoice" value=${f.flightid }></td>
      <td>${f.flightname }</td>
      <td>${f.departuretime }</td>
      <td><c:out value="${f.price * passengercount}"></c:out></td>
</tr>
    </c:forEach>
  </tbody>
</table>
<a href="${pageContext.request.contextPath }/flight"><button class="btn btn-warning">Back</button></a>
<button type="submit" class="btn btn-info">Book Now</button>
</form>
      </div>
      </div>
      </div>
</body>
</html>