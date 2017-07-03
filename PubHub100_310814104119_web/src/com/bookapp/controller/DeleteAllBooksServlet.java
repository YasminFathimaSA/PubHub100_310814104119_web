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


@WebServlet("/DeleteAllBooksServlet")
public class DeleteAllBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookModel book=new BookModel();
		BookDAO dao=new BookDAO();
		try {
			dao.removeAll(book);
			PrintWriter out=response.getWriter();
			out.print("All books in cart are removed");
			RequestDispatcher rd=request.getRequestDispatcher("DeleteAll.jsp");
			rd.include(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			PrintWriter out=response.getWriter();
			out.print("Sorry the book doesnot exists");
			RequestDispatcher rd=request.getRequestDispatcher("DeleteAll.jsp");
			rd.include(request, response);
		}
	}

}
