<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body bgcolor="palegreen">
<form action="LoginServlet" method="post">
Name<br><br><input type="text" name="name"><br><br>
Password<br><br><input type="password" name="password"><br><br>
<button type="submit">Login</button>
<br>
<br>
<a href="MainHome.jsp">Home</a>
</form>

</body>
</html>