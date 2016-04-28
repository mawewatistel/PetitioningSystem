package com.ust.iics;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.iics.model.ConvBean;

@WebServlet("/Conversion.html")
public class Conversion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ConvBean conv = new ConvBean();
		
		RequestDispatcher rd;
		
		if (((request.getParameter("peso") != null) 
				&& (request.getParameter("peso").trim().length()>0))){
			
				try{
					conv.setPeso(Double.parseDouble(request.getParameter("peso")));
					
					conv.setCurrency(request.getParameter("currency"));
					
					conv.compute();
					
					request.setAttribute("compDetails", conv);
					
					rd = request.getRequestDispatcher("/showResultServlet.html");
					rd.forward(request, response);
				}
				
				catch(Exception nfe){
					rd = request.getRequestDispatcher("/errorPageServlet.html?errCode=2");
					rd.forward(request, response);
				}
		}
		
			
		else
		{
			rd = request.getRequestDispatcher("/errorPageServlet.html?errCode=1");
			rd.forward(request, response);
		}
		
	}

}
