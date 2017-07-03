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


@WebServlet("/DeleteBookByPriceServlet")
public class DeleteBookByPriceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int price=Integer.parseInt(request.getParameter("price"));
		BookModel book=new BookModel();

		book.setId(price);
		BookDAO dao=new BookDAO();
		try {
			dao.removeByPrice(price);
			PrintWriter out=response.getWriter();
			out.print("Your book is removed from cart");
			RequestDispatcher rd=request.getRequestDispatcher("DeleteByPrice.jsp");
			rd.include(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			PrintWriter out=response.getWriter();
			out.print("Sorry the book doesnot exists");
			RequestDispatcher rd=request.getRequestDispatcher("DeleteByPrice.jsp");
			rd.include(request, response);
		}	
	
	}

}
