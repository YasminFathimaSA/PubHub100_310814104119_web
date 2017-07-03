package com.bookapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mybday.UserDAO;
import mybday.UserModel;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		HttpSession session=request.getSession();
		session.setAttribute("name",name); 
		
		
		UserModel user=new UserModel();
		user.setUsername(name);
		user.setPassword(password);
		UserDAO dao=new UserDAO();
		try {
			boolean flag = dao.login(user);
			if(flag)
			{
				PrintWriter out=response.getWriter();
				out.print(" ");
				RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
				rd.include(request, response);
			}
			else
			{
				PrintWriter out=response.getWriter();
				out.print("Username and password doesnot match ");
				RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
				rd.include(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

}
