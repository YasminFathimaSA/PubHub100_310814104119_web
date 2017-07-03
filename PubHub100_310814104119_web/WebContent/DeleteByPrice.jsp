<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete By Price</title>
</head>
<body bgcolor="palegreen">
WELCOME<%out.println(" "+session.getAttribute("name"));%><br><br>
<form action="DeleteBookByPriceServlet" method="post">
Price<br><br><input type="text" name="price"><br><br>
<button type="submit">Remove</button><br>
<br>
<br>
<a href="Home.jsp">Home</a>
</form>

</body>
</html>