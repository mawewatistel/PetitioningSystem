<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Petition Classes</title>
</head>
<body>
<form action ="home.jsp" method = "post">
<img src ="C:\Users\Acer\Desktop\ust.jpg" alt = "No Image Found=" width = 950 height =><br>
<input type="submit" name="one" value="Schedule"/>
	
<input type="submit" name="two"
			value="Create A Petition Class" >
<input type="submit"  name="three"value="Log out"></form>
<% if (request.getParameter("one") != null) {
    response.sendRedirect("home.jsp");
}
else if (request.getParameter("two") != null) {
    response.sendRedirect("create.jsp");
}
else if (request.getParameter("three") != null) {
    response.sendRedirect("index.jsp");
}
 %>
<br><br><br>*******SCHEDULE*******
<style>
h1 {
	font-family: consolas;
	font-size: 300%;
	color: blue;
}

h2 {
	font-family: calibri;
}

input[type="submit"] {
	background: #87CEFA;
	border: 1px double #DDD;
	border-radius: 5px;
	box-shadow: 0 0 5px #333;
	color:;
	outline: none;
	height: 25px;
	width: 447px;
	font-family: "verdana";
	font-color: black;
}

p {
	font-family: "verdana";
}

input[type="text"] {
	background: white;
	border: 1px double black;
	border-radius: 5px;
	box-shadow: 0 0 5px yellow;
	color: black;
	outline: center;
	height: 25px;
	width: 275px;
	font-family: "verdana";
}
</style>
</body>
</html>