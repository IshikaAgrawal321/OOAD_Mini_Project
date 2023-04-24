<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page isELIgnored= "false" %>
    
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Gift Card Form</title>
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
  margin: 10px 400px;
  padding: 20px 20px;
}
</style>
  </head>
  <body>
  <h4 style="text-align:right;padding:30px">${uname }</h4>
	<div>
    <h1><center>Gift-Card Form</center></h1>
    <form action="giftcard-send" method="post">
<input type="hidden" name="uname" id="uname" value="${uname }" />
<input type="hidden" name="choice" id="choice" value="${choice }" />
      <label for="recv"><b>Receiver:</b></label>
      <input type="text" id="recv" name="recv" required><br><br>

      <label for="msg"><b>Message:</b></label>
      <input type="text" id="msg" name="msg" required><br><br>
      
      <input type="submit" value="Send">
    </form>
</div>
  </body>
</html>
    