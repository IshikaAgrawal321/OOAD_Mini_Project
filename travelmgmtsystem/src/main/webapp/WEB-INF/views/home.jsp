<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored= "false" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Travel Management System</title>
  <style type="text/css">
  /* Global styles */
body {
  font-family: Arial, sans-serif;
  margin: 0;
  padding: 0;
}
.topnav {
  overflow: hidden;
  background-color: black;
}

.topnav h4 {
  float: right;
  color: white;
  text-align: center;
}


.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 25px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #04AA6D;
  color: white;
}
a {
  color: #0077cc;
  text-decoration: none;
}

ul {
  list-style: none;
  margin: 0;
  padding: 0;
}

/* Header styles */
header {
  background-color: #f5f5f5;
  padding: 1rem;
}

.hero {
  
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  text-align: center;
  height: 80vh;
}

.hero h1 {
font-size: 4}
  </style>
</head>
<body>
  <header>

<div class="topnav">
		<h4>Welcome ${name }</h4>
        <a href="${pageContext.request.contextPath }/holidaypackage">Holiday packages</a>
		<a href="${pageContext.request.contextPath }/flight">Flight</a>
        <a href="${pageContext.request.contextPath }/train">Train</a>
		<a href="${pageContext.request.contextPath }/giftcard">Gift Cards</a>
        <a href="${pageContext.request.contextPath }/trips">My trips</a>
        <a href="${pageContext.request.contextPath }/wallet/?name=${name }">My Wallet</a>

</div>
    <div class="hero">
      <h1>Explore the World with Us</h1>
      <p>Book your next adventure with our travel management system</p>
    </div>
  </header>
  <main>
    <section class="features">
      <div>
        <h2>Easy Booking</h2>
        <p>Our system makes it simple to book your next vacation</p>
      </div>
      <div>
        <h2>Great Destinations</h2>
        <p>Discover amazing destinations around the world</p>
      </div>
      <div>
        <h2>24/7 Support</h2>
        <p>We're here to help you every step of the way</p>
      </div>
    </section>
    <section class="destinations">
    
    </section>
  </main>




<style>
* {
  box-sizing: border-box;
}

.column {
  float: left;
  width: 33.33%;
  padding: 5px;
}

/* Clearfix (clear floats) */
.row::after {
  content: "";
  clear: both;
  display: table;
}
</style>



<div class="row"> <h2 font-size="25px" align="center">Popular Destinations</h2>
   
  <div class="column">
 
        <img src="paris.jpg" alt="Paris">
        <h3>Paris</h3>
        <p>From Rs9999</p>
        <a href="#" class="cta">Learn More</a>
      
  </div>
  <div class="column">
        <img src="tokyo.jpg" alt="Tokyo">
        <h3>Tokyo</h3>
        <p>From Rs14999</p>
        <a href="#" class="cta">Learn More</a>
    
  </div>
  <div class="column">
    
        <img src="newyok.jpg" alt="New York">
        <h3>New York</h3>
        <p>From Rs7999</p>
        <a href="#" class="cta">Learn More</a>
      
  </div>
</div>

  <footer>
    <p>&copy; 2023 Travel Management System</p>
  </footer>
</body>
</html>