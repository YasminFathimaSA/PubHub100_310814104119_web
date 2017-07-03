<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Name</title>
</head>
<body bgcolor="palegreen">
WELCOME<%out.println(" "+session.getAttribute("name"));%><br><br>
<form action="UpdateBookNameServlet" method="post">
Id<br><br><input type="text" name="id"><br><br>
Name<br><br><input type="text" name="name"><br><br>
<button type="submit">Update</button>
<br>
<br>
<a href="Home.jsp">Home</a>
</form>

</body>
</html>