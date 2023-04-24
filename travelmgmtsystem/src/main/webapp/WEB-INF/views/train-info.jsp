<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored= "false" %>
    
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Train Options</title>
</head>
<body>
<div class="container mt-3">
      <div class="row">
      <div class="col-md-12">
      <form action="train-booking" method="post">
      <table class="table">
  <thead class="thead-dark">
    <tr>
    <th scope="col"> </th>
      <th scope="col">Train Name</th>
      <th scope="col">Departure Time</th>
      <th scope="col">Price</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${trains }" var="t">
    <tr>
    <td>
    <input type="radio" id="totalamount" name="totalamount" value="<c:out value="${t.price * passengercount}"></c:out>" />
    <input type="radio" id=${t.trainid } name="choice" value=${t.trainid }></td>
      <td>${t.trainname }</td>
      <td>${t.departuretime }</td>
      <td>${t.price }</td>
    </tr>
    </c:forEach>
  </tbody>
</table>
<button class="btn btn-warning"><a href="${pageContext.request.contextPath }/train">Back</a></button>
<button type="submit" class="btn btn-info">Book Now</button>
</form>
      </div>
      </div>
      </div>
</body>
</html>