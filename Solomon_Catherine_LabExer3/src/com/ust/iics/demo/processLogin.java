package com.ust.iics.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/processLogin.html")
public class processLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost (request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String em ="";
		String na = "";
		String de = "";
		String ho = "";
		String ra = "";
		RequestDispatcher rd;
		

		if ((request.getParameter("empid") != null) &&
			(request.getParameter("name") != null) &&
			(request.getParameter("dept") != null) &&
			(request.getParameter("hour") != null) &&
			(request.getParameter("rate") != null))
					{
						em = request.getParameter("empid");
						na = request.getParameter("name");
						de = request.getParameter("dept");
						ho = request.getParameter("hour");
						ra = request.getParameter("rate");
					}

			if ((em.length()>0) && 
					(na.length()>0)&&
					(de.length()>0)&&
					(ho.length()>0)&&
					(ra.length()>0)) 
				
					{
						request.setAttribute("emp", em);
						request.setAttribute("nam", na);
						request.setAttribute("dep", de);
						request.setAttribute("hou", ho);
						request.setAttribute("rat", ra);

					}
			
							
			
			rd = request.getRequestDispatcher("/showResult.html");
			rd.include(request, response);
			
	
		
	}

}
