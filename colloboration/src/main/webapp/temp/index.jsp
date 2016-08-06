<%@ page language="java" contentType="text/html; charset=ISO-8859-1;"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style>
* {
	padding: 0;
	margin: 0;
}

body {
	font-family: sans-serif;
	background-image: url(<c:url value="/resources/images/pic1.jpg" />);
}

a {
	text-decoration: none;
	color: #00A5CC;
}

li {
	list-style-type: none;
}

nav {
	width: 100%;
	text-align: center;
}

nav a {
	display: block;
	padding: 15px 0;
	border-bottom: 1px solid #C3AA6E;
}

nav a:hover {
	background: #E5DAC0;
	color: #FFF;
}

nav li:last-child a {
	border-bottom: none;
}

.menu {
	width: 240px;
	height: 100%;
	position: absolute;
	background: #D9C9A3;
}

.menu-icon {
	padding: 10px 20px;
	background: #E5DAC0;
	color: #98703E;
	cursor: pointer;
	float: right;
}

#menuToggle {
	display: none;
}

#menuToggle:checked - .menu {
	position: absolute;
	left: 0;
}
</style>
</head>
<body>
	<header>
		<div id="brand"><center>NIIT - Colloboration</center></div><hr>
	</header>

	<input type="checkbox" id="menuToggle">
	<label for="menuToggle" class="menu-icon">&#9776;</label>
	<nav class="menu">
		<ul>
			<li><a href="home">Home</a></li>
			<li><a href="#">Chat</a></li>
			<li><a href="#">Blog</a></li>
			<li><a href="#">Forum</a></li>
			<li><a href="login">Login </a></li>
		</ul>
	</nav>
</body>
</body>
</html>

