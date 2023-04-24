<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored= "false" %>
    
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Holiday Package Options</title>
</head>
<body>
<div class="container mt-3">
      <div class="row">
      <div class="col-md-12">
      <form action="package-booking" method="post">
      <table class="table">
  <thead class="thead-dark">
    <tr>
    <th scope="col"> </th>
      <th scope="col">Hotel Name</th>
      <th scope="col">Nights</th>
      <th scope="col">Price</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${packages }" var="p">
    <tr>
    
    <td>
    <input type="radio" id="totalamount" name="totalamount" value="<c:out value="${p.price * passengercount}"></c:out>" />
    <input type="radio" id=${p.packageid } name="choice" value=${p.packageid }></td>
      <td>${p.hotelname }</td>
      <td>${p.nduration }</td>
      <td>${p.price }</td>
    </tr>
    </c:forEach>
  </tbody>
</table>
<button class="btn btn-warning"><a href="${pageContext.request.contextPath }/holidaypackage">Back</a></button>
<button type="submit" class="btn btn-info">Book Now</button>
</form>
      </div>
      </div>
      </div>
</body>
</html>