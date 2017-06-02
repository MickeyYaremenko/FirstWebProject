<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<html>
<head>
<link href="https://fonts.googleapis.com/css?family=Bree+Serif" rel="stylesheet">
<link rel='stylesheet' href='resources/bootstrap/bootstrap.css'
	type='text/css' media='all'>
<script	src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
<script src='resources/bootstrap/bootstrap.js'></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
@font-face {
  font-family: 'Glyphicons Halflings';

  src: url('resources/bootstrap/glyphicons-halflings-regular.eot');
  src: url('resources/bootstrap/glyphicons-halflings-regular.eot?#iefix') format('embedded-opentype'), url('resources/bootstrap/glyphicons-halflings-regular.woff2') format('woff2'), url('resources/bootstrap/glyphicons-halflings-regular.woff') format('woff'), url('resources/bootstrap/glyphicons-halflings-regular.ttf') format('truetype'), url('resources/bootstrap/glyphicons-halflings-regular.svg#glyphicons_halflingsregular') format('svg');
}

html {
  height: 100%;
}

body {
  	height: 100%;
  	background-image:url('resources/different/longboard1.jpg');
    background-attachment:fixed;
    background-repeat: no-repeat;
    background-size: cover;
    font-family: 'Bree Serif', serif;
}

.container {
      padding: 80px 120px;
  }
  
  /* Style the tab */
div.tab {
    float: left;
    border: 1px solid #ccc;
    background-color: rgba(241, 241, 241, 0.9);
    /*background-color: #f1f1f1;*/
    width: 20%;
    height: 100%;
 	/*opacity: 0.9;*/
 	/*border:1px solid white;*/
}

/* Style the buttons inside the tab */
div.tab button {
    display: block;
    /*background-color: inherit;*/
    background-color: rgba(210, 210, 210, 0.8);
    color: black;
    padding: 22px 16px;
    width: 100%;
    border: none;
    outline: none;
    text-align: left;
    cursor: pointer;
    /*transition: 0.3s;*/
    transition: 0.3s;
    margin-top: 10px;
    /*border: 1px solid grey;*/
    box-shadow: 3px 3px 10px #888888;
}

div.tab button:first-child {
  margin-top: 6px
}

/* Change background color of buttons on hover */
div.tab button:hover {
    /*background-color: #ddd;*/
    background-color: rgba(204, 204, 204, 1);
    border-color: grey;
    transition: 0.8s;
}

/* Create an active/current "tab button" class */
div.tab button.active {
	background-color: rgba(170, 170, 170, 1);
    /*background-color: #ccc;*/
}

/*div.tab .active {
    background-color: rgba(241, 241, 241, 1);
  
}*/
#Account-Settings {
  display: block;

}

/* Style the tab content */
.tabcontent {
    display: none;
    float: left;
    padding: 0px 12px;
    border: 1px solid #ccc;
    width: 80%;
    border-left: none;
    height: 100%;
    /*background-color:#fff;
    opacity: 0.6;*/
    background-color:rgba(255, 255, 255, 0.8);
}

.navbar{
	height: 5%;
}

.main-field {
  top: 5%;
  width: 100%;
  height: 95%;
  position: relative;
  display: block;
  
}
</style>
<script>
function openCity(evt, cityName) {
    // Declare all variables
    var i, tabcontent, tablinks;

    // Get all elements with class="tabcontent" and hide them
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    
    }

    // Get all elements with class="tablinks" and remove the class "active"
    tablinks = document.getElementsByClassName("tablinks");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");

    }

    // Show the current tab, and add an "active" class to the link that opened
	// the tab
    document.getElementById(cityName).style.display = "block";
    evt.currentTarget.className += " active";
}
</script>

<title>Your account</title>
</head>
<body>

<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span> 
      </button>
      <a class="navbar-brand" href="index.html">THE RENT STATION</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
      	<li><a href="/SportEquipmentWeb/MainServlet?action=open_user_acc">
      	<c:out value="${fn:toUpperCase(sessionScope.user.login)}"/></a></li>
      	<li><a href="cart.jsp">SHOPPING CART
      	<span class="badge"><c:out value="${sessionScope.Cart.size()}"/></span>
      	</a></li>
        <li><a href="index.html">HOME</a></li>
        <li><a href="#places">PLACES</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">CATALOG
            <span class="caret"></span>
          </a>
          <ul class="dropdown-menu">
            <li><a href="#">Bikes</a></li>
            <li><a href="#">Boards</a></li>
            <li><a href="#">Rollers</a></li> 
            <li><a href="#">Accessories</a></li>
          </ul>
        </li>
        <li><a href="#"><span class="glyphicon glyphicon-search"></span></a></li>
        
      </ul>
    </div>
  </div>
</nav>
<div class="main-field">
<div class="tab">
  <button class="tablinks active" onclick="openCity(event, 'Account-Settings')">Account Settings</button>
  <button class="tablinks" onclick="openCity(event, 'Inventory')">Inventory</button>
  <button class="tablinks" onclick="openCity(event, 'Order-History')">Order History</button>
</div>

<div id="Account-Settings" class="tabcontent">
  <h3>Account Settings</h3>
  <h4>Change password:</h4>
  <form action="MainServlet" method="POST">
  <div class="form-group">
  	<div class="col-xs-2">
	  <label for="usr">Old password:</label>
	  <input type="text" class="form-control" id="usr">
	  <label for="pwd">New password:</label>
	  <input type="password" class="form-control" id="pwd">
	  <label for="pwd">Repeat new password:</label>
	  <input type="password" class="form-control" id="pwd">
	  </div>
  </div>
  </form>
</div>


<div id="Inventory" class="tabcontent">
  <h3>Inventory</h3>
  <p>Paris is the capital of France.</p> 
</div>

<div id="Order-History" class="tabcontent">
  <h3>Order History</h3>
  <p>Tokyo is the capital of Japan.</p>
</div>
</div>

</body>
</html>