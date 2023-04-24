<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored= "false" %>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Trips</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
<div class="container mt-3">
      <div class="row">
      <div class="col-md-12">
      <table class="table">
  <thead class="thead-dark">
    <tr>
    <th scope="col"> </th>
      <th scope="col">Trip Type</th>
      <th scope="col">From</th>
      <th scope="col">To</th>
      <th scope="col">Departure Date</th>
      <th scope="col">Departure Time</th>
      <th scope="col">Passenger Count</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${trip }" var="t">

    <tr>
    <td></td>
      <td>${t.triptype }</td>
      <td>${t.source }</td>
      <td>${t.destination }</td>
      <td>${t.departuredate }</td>
      <td>${t.departuretime }</td>
      <td>${t.passengercount }</td>
</tr>
    </c:forEach>
  </tbody>
</table>
<a href="${pageContext.request.contextPath }/"><button class="btn btn-info">Back</button></a>
      </div>
      </div>
      </div>
</body>
</html>