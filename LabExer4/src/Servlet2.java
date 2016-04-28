

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * Default constructor. 
     */
    public Servlet2() {
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
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		 HttpSession session=request.getSession(false);  
	
		 
		Cookie cookie = null;
		  Cookie[] cookies = null;
		  cookies = request.getCookies();
		 
		  if( cookies != null ){
		         out.println("<h2> Found Cookies Name and Value</h2>");
		         out.println("Cookies Founded  ( REFRESH! ) :<br>");
		         for (int i = 0; i < cookies.length; i++){
		            cookie = cookies[i];
		           
		            	out.println("<br>"+cookie.getName());
		          	         }
		         	
		        
		         	//out.println("<br><br>Number of Telco determined = "+session.getAttribute("hitler"));
		         out.println("<br><br>Number of TELCO determined by program:");
		         out.println("<br>SMART:"+(Integer)session.getAttribute("hit"));
		         out.println("<br>GLOBE:"+(Integer)session.getAttribute("hit2"));
		         out.println("<br>SUN:"+(Integer)session.getAttribute("hit3"));
		         int total = (Integer)session.getAttribute("hit3")+(Integer)session.getAttribute("hit2")+(Integer)session.getAttribute("hit");
		         out.println("<br><br>Total Entry = "+total);
		         
		         out.println("<br><br>Total number of cookies = "+ cookies.length);
		         out.println("<br><br>Input value:<br> " + (String)session.getAttribute("carrier") + " - " + (String)session.getAttribute("num"));
		         out.println("<br><br>Equivalent value:<br> " + (String)session.getAttribute("carrierString") + " - " + (String)session.getAttribute("result"));
		         out.println("<br><br>Your phone number = "+(String)session.getAttribute("carrier")+(String)session.getAttribute("result"));
		         out.println("<form action='Servlet2' method='post'>");
		         out.println("<br><input type='submit' value='Refresh'>");
		         out.println("</form>");
		         out.println("<form action='NewFile.html' method='post'>");
		         out.println("<input type='submit' value='Go Back'>");
		         out.println("</form>");
		      }else{
		          out.println("<h2>No cookies founded. Refresh to view the newly created cookies.</h2>");
		          out.println("<form action='Servlet2' method='post'>");
			      out.println("<br><input type='submit' value='Refresh'>");
			      out.println("</form>");
		          out.println("<form action='NewFile.html' method='post'>");
			      out.println("<input type='submit' value='Go Back'>");
			      out.println("</form>");
		      }
		
		
	}

}
