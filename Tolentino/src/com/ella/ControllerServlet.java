package com.ella;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ControllerServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		doGet(request, response);
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        String sname= request.getParameter("sname");
			String fname= request.getParameter("fname");
			String mname= request.getParameter("mname");
	        String PrelimLec=request.getParameter("prelimlec");  
	        double prelimlec=Double.parseDouble(PrelimLec); 
	        String PrelimLab=request.getParameter("prelimlab");
	        double prelimlab=Double.parseDouble(PrelimLab);
	        String FinalsLec=request.getParameter("finalslec");
	        double finalslec=Double.parseDouble(FinalsLec);  
	        String FinalsLab=request.getParameter("finalslab");
	        double finalslab=Double.parseDouble(FinalsLab);  
	          
	        out.println("" + sname + fname + mname + "<br>");
	        GradeBean bean=new GradeBean();  
	        bean.setPrelimLec(prelimlec);  
	        bean.setPrelimLab(prelimlab);
	        bean.setFinalsLec(finalslec);  
	        bean.setPrelimLab(finalslab);
	        
	        request.setAttribute("bean",bean);  
	          
	       
	        }  
	      
	    }  
	  
	    