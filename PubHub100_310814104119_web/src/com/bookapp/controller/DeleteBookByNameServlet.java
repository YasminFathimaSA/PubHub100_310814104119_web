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

@WebServlet("/DeleteBookByNameServlet")
public class DeleteBookByNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		BookModel book=new BookModel();
		book.setName(name);
		BookDAO dao=new BookDAO();
		try {
			dao.removeByName(name);
			PrintWriter out=response.getWriter();
			out.print("Your book is removed from cart");
			RequestDispatcher rd=request.getRequestDispatcher("DeleteByName.jsp");
			rd.include(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			PrintWriter out=response.getWriter();
			out.print("Sorry the book doesnot exists");
			RequestDispatcher rd=request.getRequestDispatcher("DeleteByName.jsp");
			rd.include(request, response);

		}
	}

}
