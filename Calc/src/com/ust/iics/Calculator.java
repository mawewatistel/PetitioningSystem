package com.ust.iics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Calculator.html")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CBean conv = new CBean();
		PrintWriter out = response.getWriter();
	
		
		if (((request.getParameter("num1") != null) 
				&& (request.getParameter("num1").trim().length()>0))){
			
					conv.setnum1(Double.parseDouble(request.getParameter("num1")));
					conv.setnum2(Double.parseDouble(request.getParameter("num2")));
					conv.setCurrency(request.getParameter("currency"));
					
					conv.compute();
					
					request.setAttribute("compDetails", conv);
					
					if (request.getAttribute("compDetails") != null){
						
						out.println(" <br>	<br> Total: " + conv.getOutput() + "</font>");
					}
					
				
				
				
		}
	}
	
		
}


