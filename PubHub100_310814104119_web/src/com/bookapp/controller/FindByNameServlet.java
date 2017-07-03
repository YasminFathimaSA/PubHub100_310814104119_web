package com.bookapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mybday.BookDAO;
import mybday.BookModel;


@WebServlet("/FindByNameServlet")
public class FindByNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		BookDAO dao=new BookDAO();
		try {
			List<BookModel>books=dao.findByName(name);
		System.out.println(books.size());
			if(books.size()>0)
			{
			RequestDispatcher rd=request.getRequestDispatcher("SearchResults.jsp");
			request.setAttribute("books",books);
			rd.forward(request,response);
			}
			else
			{
				PrintWriter out=response.getWriter();
				out.print("There are no books with such name");
				RequestDispatcher rd=request.getRequestDispatcher("FindByName.jsp");
				rd.include(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
