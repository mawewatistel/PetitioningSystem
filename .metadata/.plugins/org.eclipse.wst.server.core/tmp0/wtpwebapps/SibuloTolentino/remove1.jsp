<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Petition Class</title>
</head>
<body>
<form action ="home.jsp" method = "post">
<img src ="Images/ust.JPG" alt = "Missing Image!=" width = 1350 height= ><br>
<input type="submit" name="one" id="remove" value="Schedule" style="width:33%" style="height:15%"/>
<input type="submit" name="two" id="remove" value="Create A Petition Class" style="width:33%" style="height:15%"/>
<input type="submit" name="three" id="remove" value="Log out" style="width:33%" style="height:15%"/></form>
<% if (request.getParameter("one") != null) {
    response.sendRedirect("home.jsp");
}
else if (request.getParameter("two") != null) {
    response.sendRedirect("create.jsp");
}
else if (request.getParameter("three") != null) {
    response.sendRedirect("index.jsp");
}

else if (request.getParameter("rone") != null){
	response.sendRedirect("remove1.jsp");
}
else if (request.getParameter("rtwo") != null){
	response.sendRedirect("remove2.jsp");
}
else if (request.getParameter("rthree") != null){
	response.sendRedirect("remove3.jsp");
}
else if (request.getParameter("rfour") != null){
	response.sendRedirect("remove4.jsp");
}
else if (request.getParameter("rfive") != null){
	response.sendRedirect("remove5.jsp");
}
else if (request.getParameter("rsix") != null){
	response.sendRedirect("remove6.jsp");
}
else if (request.getParameter("rone") != null){
	response.sendRedirect("remove1.jsp");
}
else if (request.getParameter("rone") != null){
	response.sendRedirect("remove1.jsp");
}
else if (request.getParameter("rone") != null){
	response.sendRedirect("remove1.jsp");
} %>
<br>
<table border="1" align="right" style ="width: 20%">
<tr>
<th> Available Schedule </th>
</tr>
<tr>
<td>(2 Units)PHY M 7-8 W 8-9</td>
</tr>
<tr>
<td><form><input type="submit" name="two" value="Add schedule to subjects"/></form></td>
</tr>
<tr>
<td> (2 Units)APP M 7-8 W 8-9 </td>
</tr>
<tr>
<td> <form><input type="submit" name="two" value="Add schedule to subjects"/></form></td>
</tr>
<tr>
<td>(3 Units) IS 206 M 7-10</td>
</tr>
<tr>
<td> <form><input type="submit" name="two" value="Add schedule to subjects"/></form></td>
</tr>
</table>
<table border="1" style ="width: 75%">
<tr>
<th> Subject </th>
<th> Subject Description</th>
<th> Lec Units</th>
<th> Lab Units</th>
<th> Section</th>
<th> Schedule </th>
</tr>
<tr>
<td>FIL 1</td>
<td> Subject Description </td>
<td>3</td>
<td>Lab Units</td>
<td>Section</td>
<td>Schedule</td>
<td><form><input type="submit"  name="rtwo" value="Remove" style="width:100%"></form></td>
</tr>
<tr>
<td>PHL 1</td>
<td> Subject Description </td>
<td>3</td>
<td>Lab Units</td>
<td>Section</td>
<td>Schedule</td>
<td><form><input type="submit"  name="rthree" value="Remove" style="width:100%"></form></td>
</tr>
<tr>
<td>ICS 111</td>
<td> Subject Description </td>
<td>3</td>
<td>1</td>
<td>Section</td>
<td>Schedule</td>
<td><form><input type="submit"  name="rfour" value="Remove" style="width:100%"></form></td>
</tr>
<tr>
<td>PE</td>
<td> Subject Description </td>
<td>3</td>
<td>Lab Units</td>
<td>Section</td>
<td>Schedule</td>
<td><form><input type="submit"  name="rfive" value="Remove" style="width:100%"></form></td>
</tr>
<tr>
<td>NSTP</td>
<td> Subject Description </td>
<td>3</td>
<td>Lab Units</td>
<td>Section</td>
<td>Schedule</td>
<td><form><input type="submit"  name="rsix" value="Remove" style="width:100%"></form></td>
</tr>
</table>
<br>
<table border="1" align="right" style="width: 25%">
<tr>
<th> Available Petition Subject (Approved)</th>
</tr>
<tr>
<td> (3 Units) MATH 101 F 7-10 </td>
</tr>
<tr>
<td> <form><input type="submit" name="two"  value="Add schedule to subjects" align="center"/></form></td>
</tr>
</table>
<table align="center">
<tr>
	<th>TOTAL UNITS:</th>
	<th>19 Units</th> 
	<th><a href="submit.jsp"> SUBMIT</a>
</table>
<br><br>
<p>*Schedule will not be submitted if above 24 unit</p>
<p>*Subjects cannot be added if there are conflicts in the schedule</p>
<style>
h1 {
	font-family: consolas;
	font-size: 300%;
	color: blue;
}

h2 {
	font-family: calibri;
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
table, th, td {
border: 1px solid black;
border-collapse: collapse;
}
th, td {
padding: 4px;
text-align: center;
font-family: calibri;  
}
input[type="submit"]{
    background: #87CEFA; 
    border: 1px double #DDD; 
    border-radius: 5px; 
    box-shadow: 0 0 5px #333; 
    color: ; 
    outline: none; 
    font-family: "verdana";
    font-color: black;
    height: 25px;
}
input.remove{
	height:30em; 
}
</style>
</body>
</body>
</html>