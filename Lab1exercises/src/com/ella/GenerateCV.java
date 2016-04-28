package com.ella;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GenerateCV
 */
@WebServlet("/GenerateCV")
public class GenerateCV extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public GenerateCV() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String lname= request.getParameter("lname");
		String fname= request.getParameter("fname");
		String mname= request.getParameter("mname");
		String bdate= request.getParameter("bdate");
		String mstatus= request.getParameter("mstatus");
		String haddress= request.getParameter("haddress");
		String paddress= request.getParameter("paddress");
		String cdetails= request.getParameter("cdetails");
		String college= request.getParameter("college");
		String hschool= request.getParameter("hschool");
		String gschool= request.getParameter("gschool");
		out.println("<h1>Curriculm Vitae</h1>");
		out.println("Last name: " + lname + "<br>");
		out.println("First name: " + fname + "<br>");
		out.println("Middle name: " + mname + "<br>");
		out.println("Birthdate: " + bdate + "<br>");
		out.println("Marital Status: " + mstatus + "<br>");
		out.println("Home Address: " + haddress + "<br>");
		out.println("Provincial Address: " + paddress + "<br>");
		out.println("Contact Details: " + cdetails + "<br>");
		out.println("Education History");
		out.println("Tertiary: " + college + "<br>");
		out.println("Secodary: " + hschool + "<br>");
		out.println("Primary: " + gschool + "<br>");
		out.close();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
