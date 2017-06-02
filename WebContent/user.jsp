<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<html>
<head>
<link href="https://fonts.googleapis.com/css?family=Bree+Serif" rel="stylesheet">
<link rel='stylesheet' href='resources/bootstrap/bootstrap.css' type='text/css' media='all'>
<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
<script src='resources/bootstrap/bootstrap.js'></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
@font-face {
  font-family: 'Glyphicons Halflings';

  src: url('resources/bootstrap/glyphicons-halflings-regular.eot');
  src: url('resources/bootstrap/glyphicons-halflings-regular.eot?#iefix') format('embedded-opentype'), url('resources/bootstrap/glyphicons-halflings-regular.woff2') format('woff2'), url('resources/bootstrap/glyphicons-halflings-regular.woff') format('woff'), url('resources/bootstrap/glyphicons-halflings-regular.ttf') format('truetype'), url('resources/bootstrap/glyphicons-halflings-regular.svg#glyphicons_halflingsregular') format('svg');
}
body{
font-family: 'Bree Serif', serif;
}
.container {
      width: 80%;
      margin: 10px auto;
      text-align: center;
  }
.container h3 {
  font-size: 55px;
  font-weight: bold;
  color: #5F5F5F;
  letter-spacing: 10px;
  text-shadow: 2px 2px 0px #d5d5d5,
    2px 2px 0px rgba(0, 0, 0, 0.2);
    -webkit-animation:colorchange 15s infinite alternate;
}

.container .headText {
  font-size: 30px;
  color: #5F5F5F;
    letter-spacing: .1em;
  text-shadow: 
    1px 0px 1px #ccc, 0px 1px 1px #eee, 
    2px 1px 1px #ccc, 1px 2px 1px #eee,
    3px 2px 1px #ccc, 2px 3px 1px #eee;
   }
@-webkit-keyframes colorchange {
      0% {
        color: #5F5F5F;
      }
      10% {
        color: #8e44ad;
      }
      20% {
        color: #1abc9c;
      }
      30% {
        color: #d35400;
      }
      40% {
        color: #5F5F5F;
      }
      50% {
        color: #34495e;
      }
      60% {
        color: #5F5F5F;
      }
      70% {
        color: #2980b9;
      }
      80% {
        color: #f1c40f;
      }
      90% {
        color: #2980b9;
      }
      100% {
        color: #5F5F5F;
      }
    }
  .person {
      margin-bottom: 20px;
      width: 80%;
      height: 80%;
      opacity: 0.7;
  }
  .person:hover {
      
  }
  .box-item {
    border: 1px solid #BFBFBF;
    border-radius: 5%;
    margin: 15px;
    width: 100%;
    height: 320px;
    -webkit-filter: grayscale(10%); /* Safari 6.0 - 9.0 */
    filter: grayscale(10%);
    background: #F8F8F8;
    box-shadow: 1px 0px 1px #ccc, 0px 1px 1px #eee, 
    2px 1px 1px #ccc, 1px 2px 1px #eee;

  }
  .box-item:hover {
    filter: grayscale(0%);
    -webkit-filter: grayscale(0%);
    filter: none;
    -webkit-box-shadow: 5px 5px 5px 0px rgba(122,122,122,0.5);
    -moz-box-shadow: 5px 5px 5px 0px rgba(122,122,122,0.5);
    box-shadow: 5px 5px 5px 0px rgba(122,122,122,0.5);
    transition: 1.5s all;
    background: white;
    cursor: pointer;
    border-color: #9A9A9A;
    transform: scale(1.03);
  }
  .box-item:hover .item-name {
    display: none;
    transition: 1s all;
  }
  .box-item:hover .item-hover {
    display: block;
    transition: 1s all;
    color: #FF6666;
    letter-spacing: 3px;
  }
  .box-item p {
    font-size: 20px;
    letter-spacing: 3px;
    color: #4A4A4A;
  }
  form {
    margin: 0;
    padding: 0;
  }
  input {
    margin: 0;
    padding: 0;
  }
  .row {
    margin: 0 auto;
    text-align: center;
    position: relative;
  }
.row img {
  width: 89%;
  margin-top: 10px;
}
.row input[type="image"] {
  margin-top: 10px;
}
.footer-form {
  margin-top: 40px;
  
}
.item-name {
  display: block;
  transition: 1s all;
}
.item-hover {
  display: none;
  }
</style>
<title>User page</title>
</head>
<body>
<nav class="navbar navbar-default">
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
      	<li><a href="/SportEquipmentWeb/MainServlet?action=open_user_acc"><c:out value="${fn:toUpperCase(sessionScope.user.login)}"/></a></li>
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

	<div class="container text-center">
  <h3>THE RENT STATION</h3>
  <p class="headText">We love sport!</p>
  <br>
  <div class="row">
    <div class="col-sm-4">
      <div class="box-item">
          <form action="MainServlet" method="get">
            <input type="hidden" name="action" value="choose_equip"/>
            <input type="hidden" name="category" value="bike"/>
            <input type="image" src="resources/different/bike-catalog.png" class="person" alt="Random Name">
          </form>
          <p class="item-name"><strong>Bikes</strong></p>
          <p class="item-hover"><strong>Ride a bike</strong></p>
        </div>
    </div>
    <div class="col-sm-4">
      <div class="box-item">
      <form action="MainServlet" method="get">
            <input type="hidden" name="action" value="choose_equip"/>
            <input type="hidden" name="category" value="board"/>
            <input type="image" src="resources/different/boards-catalog.png" class="person" alt="Random Name">
       </form>
          <p class="item-name"><strong>Boards</strong></p>
          <p class="item-hover"><strong>Ride a skateboard</strong></p>
      </div>
    </div>
    <div class="col-sm-4">
      <div class="box-item">
         <form action="MainServlet" method="get">
            <input type="hidden" name="action" value="choose_equip"/>
            <input type="hidden" name="category" value="rollers"/>
            <input type="image" src="resources/different/roller-catalog.png" class="person" alt="Random Name">
       </form>
        <p class="item-name"><strong>Roller blades</strong></p>
        <p class="item-hover"><strong>Ride a rollers</strong></p>
      </div>
    </div>
  </div>
    <div class="row">
    <div class="col-sm-4">
      <div class="box-item">
      <form action="MainServlet" method="get">
            <input type="hidden" name="action" value="choose_equip"/>
            <input type="hidden" name="category" value="glasses"/>
            <input type="image" src="resources/different/glasses-catalog.png" class="person" alt="Random Name">
       </form>
        <p class="item-name"><strong>Glasses</strong></p>
        <p class="item-hover"><strong>Put on glasses</strong></p>
      </div>
    </div>
    <div class="col-sm-4">
      <div class="box-item">
      <form action="MainServlet" method="get">
            <input type="hidden" name="action" value="choose_equip"/>
            <input type="hidden" name="category" value="gloves"/>
            <input type="image" src="resources/different/gloves-catalog.png" class="person" alt="Random Name">
       </form>
        <p class="item-name"><strong>Gloves</strong></p>
        <p class="item-hover"><strong>Put on gloves</strong></p>
      </div>
    </div>
    <div class="col-sm-4">
      <div class="box-item">
      <form action="MainServlet" method="get">
            <input type="hidden" name="action" value="choose_equip"/>
            <input type="hidden" name="category" value="helmet"/>
            <input type="image" src="resources/different/helmet-catalog.png" class="person" alt="Random Name">
       </form>
        <p class="item-name"><strong>Helmets</strong></p>
        <p class="item-hover"><strong>Put on helmet</strong></p>
      </div>
    </div>
  </div>
  <div class="row footer-form">
  	<form action="MainServlet" method="get">
	<input type="hidden" name="action" value="create_order"/>
	<div class="col-sm-10 col-sm-offset-1">
	<button type="submit" class="btn btn-default btn-lg btn-block" name="action" value="create_order">
          <span class="glyphicon glyphicon-shopping-cart"></span> Make an order!	
        </button>
	</div>
	</form>
	</div>
</div>

</body>
</html>