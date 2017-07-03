<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body bgcolor="palegreen">
		<%Object username=request.getSession().getAttribute("name");out.print("WELCOME "+username);%>
	<table border=1>
		<thead>   
			<tr>
				<th>id</th>
				<th>name</th>
				<th>price</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="book" items="${books}">
				<tr>
					<td>${book.id}</td>
					<td>${book.name}</td>
					<td>${book.price}</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>


	<a href="AddBook.jsp">Add a book to cart</a><br>
	<a href="UpdateBook.jsp">Edit a book in cart</a><br>
	<a href="DeleteBook.jsp">Remove a book from cart</a><br>
	<a href="/PubHub100_310814104119_web/FindAllServlet">List all books in cart</a><br>
	<a href="FindByName.jsp">Find a book in cart</a><br>

	

</body>
</html>