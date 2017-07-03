package com.bookapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import mybday.UserDAO;
import mybday.UserModel;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		
		UserModel user=new UserModel();
		user.setUsername(name);
		user.setPassword(password);	
		UserDAO dao=new UserDAO();
		try {
			dao.register(user);
			PrintWriter out=response.getWriter();
			out.print("Registration Success.Login In");
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		} catch (Exception e) {
			
			PrintWriter out=response.getWriter();
			out.print("You have already registered.please login");
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		
		}
		
	}

}
