<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddBook</title>
</head>
<body bgcolor="palegreen">
WELCOME<%out.println(" "+session.getAttribute("name"));%><br><br>
<center>
<form action="AddBookServlet" method="post">
Name<br><br><input type="text" name="name"><br><br>
Price<br><br><input type="text" name="price"><br>
<button type="submit">Save</button><br>
<br>
<br>
<a href="Home.jsp">Home</a>
</form>
</center>
</body>
</html>