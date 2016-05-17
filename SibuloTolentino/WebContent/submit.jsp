<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
h1{
font-family: "verdana";
}
p{
font-family: "verdana";
}
input[type="submit"]{
    background: #87CEFA; 
    border: 1px double #DDD; 
    border-radius: 5px; 
    box-shadow: 0 0 5px #333; 
    color: ; 
    outline: none; 
    height:25px; 
    width: 447px;
    font-family: "verdana";
    font-color: black;
}
</style>
<form action ="home.jsp" method = "post">
<img src ="Images/ust.JPG" alt = "Missing Image!=" width = 1350 height= ><br>
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
} %>
<h1><center>Schedule Submitted!</center></h1>
</style>
</body>
</html>