<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@page isELIgnored= "false" %>
    
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Gift Card Options</title>
</head>
<body>
<div class="container mt-3">
      <div class="row">
      <div class="col-md-12">
      <form action="giftcard-booking" method="post">
      <table class="table">
  <thead class="thead-dark">
    <tr>
    <th scope="col"> </th>
      <th scope="col">Destination</th>
      <th scope="col">Occasion</th>
      <th scope="col">Price</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${giftcard }" var="g">
    <tr>
    <td>
    <input type="radio" id="totalamount" name="totalamount" value="<c:out value="${g.price }"></c:out>" />
    <input type="radio" id=${g.giftcardid } name="choice" value=${g.giftcardid }></td>
      <td>${g.destination }</td>
      <td>${g.occasion }</td>
      <td>${g.price }</td>
    </tr>
    </c:forEach>
  </tbody>
</table>
<button class="btn btn-warning"><a href="${pageContext.request.contextPath }/">Back</a></button>
<button type="submit" class="btn btn-info">Book Now</button>
</form>
      </div>
      </div>
      </div>
</body>
</html>