<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Price</title>
</head>
<body bgcolor="palegreen">
WELCOME<%out.println(" "+session.getAttribute("name"));%><br><br>
<form action="UpdateBookPriceServlet" method="post">
Id<br><br><input type="text" name="id"><br><br>
Price<br><br><input type="text" name="price"><br><br>
<button type="submit">Update</button><br>
<br>
<br>
<a href="Home.jsp">Home</a>
</form>

</body>
</html>