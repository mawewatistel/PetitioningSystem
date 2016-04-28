package com.ust.iics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.iics.model.ConvBean;


@WebServlet("/showResultServlet.html")
public class showResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		out.println("<html>");
		out.println("<head><title> Convertion </title></head>");
		
		
		if (request.getAttribute("compDetails") != null){
			ConvBean conv = (ConvBean)request.getAttribute("compDetails");
			
			out.println(" <br>	<br> <font style = 'font-size:35px'> Currency: " + conv.getCurrency() + "</font>");
			out.println(" <br>	<br><font style = 'font-size:35px'> Peso: " + conv.getPeso() + "</font>");
			out.println(" <br>	<font style = 'font-size:35px'> Total:" + conv.getOutput()+ "</font>");
		}
		

		out.println("	<body>");
		out.println("</html>");
		
		out.close();
	}

}
