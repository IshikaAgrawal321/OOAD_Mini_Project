<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored= "false" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Flight Booking Form</title>
<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: 
#CBEBF5;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #65DFF6;
}


div {
  border-radius: 5px;
  background-color: #f2f2f2;
  margin: 150px 400px;
  padding: 20px 20px;
}
</style>
  </head>
  <body>
	<div>
    <h1><center>Flight Booking Form</center></h1>
    <form action="search-flight" method="post">
      <label for="from"><b>From:</b></label>
      <input type="text" id="from" name="from" required><br><br>
      
      <label for="to"><b>To:</b></label>
      <input type="text" id="to" name="to" required><br><br>
      
      <label for="date"><b>Date:</b></label>
      <input type="date" id="date" name="date" required><br><br>
      
      <label for="passengercount"><b>Travellers:</b></label>
      <input type="number" id="passengercount" name="passengercount" required><br><br>
      
      <input type="submit" value="Search">
      
    </form>
</div>
  </body>
</html>
    