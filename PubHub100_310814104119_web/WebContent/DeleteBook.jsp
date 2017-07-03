<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Book</title>
</head>
<body bgcolor="palegreen">
WELCOME<%out.println(" "+session.getAttribute("name"));%><br><br>
<a href="DeleteById.jsp">Delete By Id</a><br><br>
<a href="DeleteByName.jsp">Delete By Name</a><br><br>
<a href="DeleteByPrice.jsp">Delete By Price</a><br><br>
<a href="DeleteAll.jsp">Delete All Books</a><br><br>
<br>
<br>
<a href="Home.jsp">Home</a>

</body>
</html>