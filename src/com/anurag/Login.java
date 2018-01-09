package com.anurag;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		
		out.println(uname+"fasdfsdf0"+password);
		
		if (password.equals("admin123")) {
			out.println("dfasfasd0");
			
			
			request.getRequestDispatcher("hello.jsp").forward(request, response);
			/*
			 * out.print("Welcome, "+uname); HttpSession
			 * session=request.getSession();
			 * session.setAttribute("uname",uname);
			 */

		} else {
			out.println("Sorry Invalid username or password");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}

		out.close();

	}

}
