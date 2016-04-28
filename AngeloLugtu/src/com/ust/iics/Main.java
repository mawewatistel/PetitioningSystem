package com.ust.iics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main.html")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String lname="";
		String fname="";
		String mname="";
		String pack1="";
		String pack2="";
		String pack3="";
		String cash="";
		String mode="";
		String check="";
		String hockage="";
		double total=0;
		double total3 = 0;
		double item = 0;
		double total2 = 0;
		
		
		
		if(request.getParameter("last")!=null){
			lname=request.getParameter("last");			
		}
		
		if(request.getParameter("first")!=null){
			fname=request.getParameter("first");
		}
		if(request.getParameter("mid")!=null){
			mname=request.getParameter("mid");
		}
		
		if(request.getParameter("Pack 1")!=null){
			pack1=request.getParameter("pack1");
		}
		if(request.getParameter("Pack 2")!=null){
			pack2=request.getParameter("pack2");
		}
		if(request.getParameter("Pack 3")!=null){
			pack3=request.getParameter("pack3");
		}
		
		if(request.getParameter("hockage")!=null){
			hockage=request.getParameter("hockage");
		}
		
		if(request.getParameter("mode")!=null){
			mode=request.getParameter("mode");
		}
		if(request.getParameter("cash")!=null){
			cash=request.getParameter("cash");
		}
		if(request.getParameter("check")!=null){
			check=request.getParameter("pack3");
		}
		
		out.println("<img src ='Images/Tulips.jpg' alt = 'Missing Image!' width = 200 height= 200>");
		
		if(((request.getParameter("last") != null)
				&& (request.getParameter("last").trim().length()>0)) && ((request.getParameter("first") != null)
						&& (request.getParameter("first").trim().length()>0)) &&  ((request.getParameter("mid") != null)
								&& (request.getParameter("mid").trim().length()>0)) && ((request.getParameter("item") != null)
										&& request.getParameter("item").trim().length()>0)) {
			try {	
				if(request.getParameter("item")!=null){
				item=Double.parseDouble(request.getParameter("item"));
				}
					if(item < 0){
						out.println("Nope! Negative numbers are not allowed!!");
					}
					else{
						if (hockage.equals("Pack 1")){
			
							out.println("<html>");
							out.println("<body>");
							out.println("<img src ='Images/Tulips.jpg' alt = 'Missing Image!' width = 200 height= 200>");
							out.println("<br> <h1> Order Form </h1>");
							out.println("<br>Name:"+lname + "," + fname + " " + mname);
							out.println("<br>Package:"+hockage);
							out.println("<br>Price: 3000");
							out.println("<br>Description: Breakfast, Room");
							total = item * 3000;
							out.println("<br>Total:"+total);
							out.println("</body>");
							out.println("</html>");
						
				
									if (mode.equals("cash")) {
										out.println("Total is: " +total);
									}
									else if (mode.equals("check")) {
										total2 = total * .10;
										total3 = total2 + total;
										out.println("Total is: " +total3);
									}
							out.println("<br>Powered by: Solomon and Lugtu");
		}
			
			if (hockage.equals("Pack 2")){
					
					out.println("<html>");
					out.println("<body>");
				
					out.println("<br> <h1> Order Form </h1>");
					out.println("<br>Name:"+lname + "," + fname + " " + mname);
					out.println("<br>Package:"+hockage);
					out.println("<br>Price: 5000");
					out.println("<br>Description: Breakfast, Lunch, Room");
					total = item * 5000;
					out.println("<br>Total:"+total);
					out.println ("</body>");
					out.println("</html>");
					
						
						
							if (mode.equals("cash")) {
								out.println("<br>Total is: " +total);
							}
							else if (mode.equals("check")) {
								total2 = total * .10;
								total3 = total2 + total;
								out.println("<br>Total is: " +total3);
							}
					
					}
			
			if (hockage.equals("Pack 3")){
				
					out.println("<html>");
					out.println("<body>");
					out.println("<img src ='Images/Tulips.jpg' alt = 'Missing Image!' width = 200 height= 200>");
					out.println("<br>Name:"+lname + "," + fname + " " + mname);
					out.println("<br>Package:"+hockage);
					out.println("<br>Price: 7000");
					out.println("<br>Description: Breakfast, Lunch, Dinner, Room");
					
					total = item * 7000;
					out.println("<br>Total:"+total);
					out.println("</body>");
					out.println("</html>");
									
									if (mode.equals("cash")) {
										out.println("<br>Total is: " +total);
									}
									else if (mode.equals("check")) {
										total2 = total * .10;
										total3 = total2 + total;
										out.println("<br>Total is:" +total3);
									}
									out.println("<br> Powered by: Solomon and Lugtu");
					
			}
			
				
				}
				}
										catch (Exception nfe) {
											out.println("INVALID.");
				}
			}
										else {
											out.println("Missing Information");
				}
		out.println("<br>Powered by: Solomon and Lugtu");	
			}
			
		}
