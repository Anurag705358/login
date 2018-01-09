package com.anurag;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("uname");
		String email=request.getParameter("email");
		HttpSession session = request.getSession();
		ServletContext context=getServletContext();
		if(username!=" "&&username!=null)
		{
		session.setAttribute("username",username);
		//session.setAttribute("email",email);
		context.setAttribute("username",username);
		//context.setAttribute("email",email);
		}
		
		
		out.println("Welcome " + username +" whose email is " + email);
		out.println("<br/>Welcome " + (String)session.getAttribute("username")); //+" whose email is " + (String)session.getAttribute("email"));
		out.println("<br/>Welcome " + (String)context.getAttribute("username"));//+" whose email is " + (String)context.getAttribute("email"));
		
		
		
		
		
		
	}

}
