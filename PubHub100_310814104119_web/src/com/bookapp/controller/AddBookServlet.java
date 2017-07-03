package com.bookapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mybday.BookDAO;
import mybday.BookModel;


@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		int price=Integer.parseInt(request.getParameter("price"));
		BookModel book=new BookModel();
		book.setName(name);
		book.setPrice(price);
		BookDAO dao=new BookDAO();
		try {
			dao.save(book);
			PrintWriter out=response.getWriter();
			out.print("Book has been added to your cart");
			RequestDispatcher rd=request.getRequestDispatcher("AddBook.jsp");
			rd.include(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			PrintWriter out=response.getWriter();
			out.print("Sorry the book already exists");
			RequestDispatcher rd=request.getRequestDispatcher("AddBook.jsp");
			rd.include(request, response);
			
		}
	}

}
