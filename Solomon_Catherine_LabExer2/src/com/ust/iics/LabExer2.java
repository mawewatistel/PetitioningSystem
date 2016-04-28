package com.ust.iics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LabExer2.html")
public class LabExer2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();

	    String laname = "";
	    String finame = "";
	    String midname = "";
	    String bday = "";
	    String marstatus = "";
	    String homeadd = "";
	    String mobileno = "";
	    String emailadd = "";    
	    String tertiary = "School";
	    String tyears = "Years";
	    String prog = "Program";
	    String secondary = "School";
	    String syears = "Years";
	    String primary = "School";
	    String pyears = "Years";
	 
	    
	    if (request.getParameter("lname") != null){
			laname = request.getParameter("lname");
		}
		
	    if (request.getParameter("fname") != null){
			finame = request.getParameter("fname");
		}
	    
	    if (request.getParameter("mname") != null){
			midname = request.getParameter("mname");
		}
	    
	    if (request.getParameter("bdate") != null){
			bday = request.getParameter("bdate");
		}
	    
	    if (request.getParameter("mstatus") != null){
			marstatus = request.getParameter("mstatus");
		}
	    
	    if (request.getParameter("haddress") != null){
			homeadd = request.getParameter("haddress");
		}
	    
	    if (request.getParameter("mobile") != null){
			mobileno = request.getParameter("mobile");
		}
	    
	    if (request.getParameter("emailad") != null){
			emailadd = request.getParameter("emailad");
		}
	    
	    
	    if (request.getParameter("tertiary") != null){
			tertiary = request.getParameter("tertiary");
		}
	    
	    if (request.getParameter("tyears") != null){
			tyears = request.getParameter("tyears");
		}
	    
	    if (request.getParameter("course") != null){
			prog = request.getParameter("course");
		}
	    
	    if (request.getParameter("secondary") != null){
			secondary = request.getParameter("secondary");
		}
	    
	    if (request.getParameter("syears") != null){
			syears = request.getParameter("syears");
		}
	    
	    if (request.getParameter("primary") != null){
			primary = request.getParameter("primary");
		}
	    
	    if (request.getParameter("pyears") != null){
			pyears = request.getParameter("pyears");
		}
	    
	 

	    out.print("<font size=6><b>Personal Information</b></font>");
	    out.print("<br>Last Name:  " + laname);
	    out.print("<br>First Name:  " + finame);
	    out.print("<br>Middle Name:  " + midname);	    
	    out.print("<br>Birthdate:  " + bday);
	    out.print("<br>Marital Status:  " + marstatus);
	    out.print("<br>Home Address: " + homeadd);
	    out.print("<br>Contact Details:  ");
	    out.print("<br>Mobile Number:  " + mobileno);
	    out.print("<br>Email:  " + emailadd);
	    
	    		
	    		
	    		
	    out.print("<br><br><font size=6><b>Educational History</b></font>");
	    out.print("<br>Tertiary:  " + tertiary);
	    out.print("<br>Years:  " + tyears);
	    out.print("<br>Program:  " + prog);
	    out.print("<br>Secondary:  " + secondary);
	    out.print("<br>Years:  " + syears);
	    out.print("<br>Primary:  " + primary);
	    out.print("<br>Years:  " + pyears);
	   
	  
	    
	    
	       

	}

}
