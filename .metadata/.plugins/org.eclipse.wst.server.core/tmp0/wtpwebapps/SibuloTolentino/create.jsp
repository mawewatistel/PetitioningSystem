<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Petition class</title>
</head>
<body>
<form action ="petitionclasssubmit.jsp" method = "post">
<img src ="Images/ust.JPG" alt = "Missing Image!=" width = 1333 height= ><br>
<form><input type="submit" name="one" value="Schedule"/>
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
else if (request.getParameter("four") != null) {
    response.sendRedirect("petitionclasssubmit.jsp");
} %>

<center><p>You are in the 'Create A Petition Class' menu.</p></center></br>
<center><p>Semester: <input type="text" name="sem"/></p></center>
<center><p>College: <input type="text" name="college"/></p></center>
<center><p>Subject Name: <input type="text" name="subname"/></p></center>
<center><p>Number of Units: <input type="text" name="units"/></p></center>
<center><p>Proposed Schedule: <input type="text" name="propsched"/></p></center>
<center><p>Time: <input type="text" name="time"/></p></center>
<center><p>Professor: <input type="text" name="prof"/></p></center>
<center><form><input type="submit" name="four" value="Submit"/></center></form>
<p>*Once approved, Petition Subject will appear in 'Available Petition Subjects.</p>
<p>*It will be removed from the 'Available Petition Subjects' when slots are no longer available.</p><br><br>
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
	width: 441px;
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