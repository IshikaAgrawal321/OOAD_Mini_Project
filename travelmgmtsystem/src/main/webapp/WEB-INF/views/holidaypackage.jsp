<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Holiday package Form</title>
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

button{
background-color: #65DFF6;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  -webkit-transition-duration: 0.4s; /* Safari */
  transition-duration: 0.4s;}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  margin: 15px 400px;
  padding: 20px 20px;
}
</style>
  </head>
  <body>
	<div>
    <h1><center>Holiday package Form</center></h1>
    <form action="search-package" method="post">
      <label for="from"><b>Source:</b></label>
      <input type="text" id="from" name="from" ><br><br>
      
      <label for="to"><b>Destination:</b></label>
      <input type="text" id="to" name="to" ><br><br>
	<label for="passengercount"><b>No. of Rooms (4 people in a room):</b></label>
      <input type="text" id="passengercount" name="passengercount" ><br><br>
      
      <label for="date"><b>Date:</b></label>
      <input type="date" id="date" name="date" ><br><br>

	
	
	<label for="preference"><b>Flight preference</b></label>
      <input type="submit" name="flightpref" value="With Flight">
      <input type="submit" name="flightpref" value="Without Flight">
    </form>
</div>
  </body>
</html>