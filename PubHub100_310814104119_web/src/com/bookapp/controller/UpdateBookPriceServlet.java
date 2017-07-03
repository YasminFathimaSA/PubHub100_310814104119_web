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


@WebServlet("/UpdateBookPriceServlet")
public class UpdateBookPriceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		int price=Integer.parseInt(request.getParameter("price"));
		BookModel book=new BookModel();
		book.setId(id);
		book.setPrice(price);
		BookDAO dao=new BookDAO();
		try {
			dao.updatePrice(book);
			PrintWriter out=response.getWriter();
			out.print("Book price has been edited");
			RequestDispatcher rd=request.getRequestDispatcher("UpdatePrice.jsp");
			rd.include(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			PrintWriter out=response.getWriter();
			out.print("Update Failed");
			response.sendRedirect("UpdatePrice.jsp");
		}
	}

}
