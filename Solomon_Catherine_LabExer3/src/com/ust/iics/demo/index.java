package com.ust.iics.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index.html")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		RequestDispatcher rd;
		
		out.println("<html>");
		out.println("<head> <title> Login </title> </head>");
		out.println ("<body>");
		
		rd = request.getRequestDispatcher("/Design/header.html");
		rd.include(request, response);
		
		
		out.println("<form action = 'processLogin.html' method = 'post'>");
		
		out.println("<p><b> Employee ID: </b> <input type='text' name = 'empid'></p>");
		out.println("<p><b> Name: </b> <input type = 'text' name = 'name'></p>");
		out.println("<p><b> Department: </b> <input type='text' name = 'dept'</p>");
		out.println("<p><b> Hours Worked: </b> <input type='text' name = 'hour'</p>");
		out.println("<p><b>Rate per Hour: </b> <input type='text' name = 'rate'</p>");

		out.println("<p> <input type = 'submit' value = 'Generate Gross Pay'>");
		
		rd = request.getRequestDispatcher("footer.html");
		rd.include(request, response);
		out.println("</body>");
		out.println("</html>");
		
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
