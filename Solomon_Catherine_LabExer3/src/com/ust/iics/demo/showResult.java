package com.ust.iics.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/showResult.html")
public class showResult extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String emp ="";
		String nam = "";
		String dep = "";
		String hou = "";
		String rat = "";
		double grossPay, hoursW, hoursR;
		
		if ((request.getAttribute("emp") != null) &&	
			(request.getAttribute("nam") != null) &&
			(request.getAttribute("dep") != null) &&
			(request.getAttribute("hou") != null) &&
			(request.getAttribute("rat") != null))
			
		{
				emp = (String) request.getAttribute("emp");
				nam = (String) request.getAttribute("nam");
				dep = (String) request.getAttribute("dep");
				hou = (String) request.getAttribute("hou");
				rat = (String) request.getAttribute("rat");
				
		}
		
		
		
		
		
		
		
		
		
		
		out.println("<html>");
		out.println("<body>");
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/Design/header.html");
		
				
		rd.include(request, response);
		
		if(emp.trim().length()>0 || nam.trim().length()>0 || dep.trim().length()>0 || hou.trim().length()>0 || rat.trim().length()>0)
		{
			hoursW = Double.parseDouble(hou);
			hoursR = Double.parseDouble(rat);
			grossPay = hoursW * hoursR;
			
			
			out.println("  <p> Employee ID: " + emp + "</p>");
			out.println("  <p> Name: " + nam + "</p>");
			out.println("  <p> Department: " + dep + "</p>");
			out.println("  <p> Gross Pay: " + grossPay + "</p>");
			
		}
		else {
				out.println("<br>INVALID</br>");
	
		}
		
		
		
				
		
		
		rd = request.getRequestDispatcher("footer.html");
		rd.include(request, response);
		out.println("  </body>");
		out.println("</html>");
		
		
		out.close();
		
		
	
	}
}
	
		
		
		
		
		
		