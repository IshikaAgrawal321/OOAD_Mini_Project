<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
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

input[type=password], select {
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
button {
  background-color: #CBEBF5;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 20px 170px;
  cursor: pointer;}

button:hover {
  background-color: #65DFF6;
}
</style>
  </head>
  <body>
	<div>
    <h1> <center> LOGIN </center> </h1>
    <form action="validate-user" method="post">
      <label for="username"><b>Username</b></label>
      <input type="text" id="username" name="username" required><br><br>
      
      <label for="password"><b>Password:</b></label>
      <input type="password" id="password" name="password" required><br><br>
     
      <button>Login</button>
 </form>
</div>
  </body>
</html>
