package com.ust.iics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/errorPageServlet.html")
public class errorPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title> Computation </title></head>");
		out.println("	<body>");
		
		int error = 0;
		
		if (request.getParameter("errCode") !=null){
			error = Integer.parseInt(request.getParameter("errCode"));
		}
		
		switch (error){
		case 1: out.println("Missing Parameter");
				break;
		case 2: out.println("Invalid input");
				break;
		}
		
		
		out.println("	<body>");
		out.println("</html>");
		
		out.close();
	}

}
