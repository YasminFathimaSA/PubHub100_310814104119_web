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


@WebServlet("/UpdateBookNameServlet")
public class UpdateBookNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		BookModel book=new BookModel();
		book.setId(id);
		book.setName(name);
		BookDAO dao=new BookDAO();
		try {
			dao.updateName(book);
			PrintWriter out=response.getWriter();
			out.print("Book name has been edited");
			RequestDispatcher rd=request.getRequestDispatcher("UpdateName.jsp");
			rd.include(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			PrintWriter out=response.getWriter();
			out.print("Update Failed");
			RequestDispatcher rd=request.getRequestDispatcher("UpdateName.jsp");
			rd.include(request, response);
		
		}
	}

}
