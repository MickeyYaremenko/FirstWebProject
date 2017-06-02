<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<link href="https://fonts.googleapis.com/css?family=Bree+Serif"
	rel="stylesheet">
<link rel='stylesheet' href='resources/bootstrap/bootstrap.css'
	type='text/css' media='all'>
<script
	src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
<script src='resources/bootstrap/bootstrap.js'></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body {
	font-family: 'Bree Serif', serif;
}

@font-face {
	font-family: 'Glyphicons Halflings';
	src: url('resources/bootstrap/glyphicons-halflings-regular.eot');
	src: url('resources/bootstrap/glyphicons-halflings-regular.eot?#iefix')
		format('embedded-opentype'),
		url('resources/bootstrap/glyphicons-halflings-regular.woff2')
		format('woff2'),
		url('resources/bootstrap/glyphicons-halflings-regular.woff')
		format('woff'),
		url('resources/bootstrap/glyphicons-halflings-regular.ttf')
		format('truetype'),
		url('resources/bootstrap/glyphicons-halflings-regular.svg#glyphicons_halflingsregular')
		format('svg');
}

.container {
	padding: 80px 120px;
}
</style>
<title>Insert title here</title>
</head>
<body>

	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html">THE RENT STATION</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav navbar-right">
					<li><a
						href="/SportEquipmentWeb/MainServlet?action=open_user_acc"><c:out
								value="${fn:toUpperCase(sessionScope.user.login)}" /></a></li>
					<li><a href="cart.jsp">SHOPPING CART <span class="badge"><c:out
									value="${sessionScope.Cart.size()}" /></span>
					</a></li>
					<li><a href="index.html">HOME</a></li>
					<li><a href="#places">PLACES</a></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">CATALOG <span class="caret"></span>
					</a>
						<ul class="dropdown-menu">
							<li><a href="#">Bikes</a></li>
							<li><a href="#">Boards</a></li>
							<li><a href="#">Rollers</a></li>
							<li><a href="#">Accessories</a></li>
						</ul></li>
					<li><a href="#"><span class="glyphicon glyphicon-search"></span></a></li>

				</ul>
			</div>
		</div>
	</nav>


	<form action="MainServlet" method="POST">
		<div class="container">
			<ul class="list-group">
				<c:forEach items="${map}" var="entry">
					<li class="list-group-item">
						<h4 class="list-group-item-heading">
							<b><c:out value="${entry.key.name}" /></b>
						</h4>
						<p class="list-group-item-text">
							<c:forEach items="${entry.value}" var="entries">
								<c:out value="${entries.key}" />:
								<c:out value="${entries.value}" />
							</c:forEach>
						</p>
						<div class="checkbox">
							<label>
							<input type="checkbox" name="items"	value="${entry.key.name}">
							I want this!
							</label>
						</div>
					</li>
				</c:forEach>

			</ul>

			<div class="row">

				<input type="hidden" name="action" value="add_items" />
				<div class="col-sm-10 col-sm-offset-1">
					<button type="submit" class="btn btn-default btn-lg btn-block"
						name="action" value="add_items">
						<span class="glyphicon glyphicon-shopping-cart"></span> Continue
						to a cart!
					</button>
				</div>

			</div>

		</div>
	</form>

	<table class="table table-hover table-condensed">
		<tr>
			<th>Equipment title</th>
			<c:forEach items="${map}" var="entry">
				<c:forEach items="${entry.value}" var="entries">
					<th><c:out value="${entries.key}" /></th>
				</c:forEach>
			</c:forEach>
		</tr>
		<c:forEach items="${map}" var="entry">

			<tr>
				<td><c:out value="${entry.key.name}" /></td>
				<c:forEach items="${entry.value}" var="entries">
					<td><c:out value="${entries.value}" /></td>

				</c:forEach>
			</tr>
		</c:forEach>
	</table>

</body>
</html>