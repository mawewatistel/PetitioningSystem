

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet1() {
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
		
		String carrier = request.getParameter("carrier");
		String num = request.getParameter("num");
		String carrierString="";
		String numString = "";
		String result = "";
		
		
		if("0919".equals(carrier) || "0920".equals(carrier)){
			carrierString = "SMART";
		}
		else if("0917".equals(carrier) || "0927".equals(carrier)){
			carrierString = "GLOBE";
		}
		else if("0922".equals(carrier) || "0933".equals(carrier)){
			carrierString = "SUN";
		}
		else{
			out.println("ERROR");
		}
		
		
		boolean isLetter = true;
		for (int i=0; i<num.length(); i++){
		     if (Character.isDigit(num.charAt(i))){
		        isLetter = false;
		        break;
		     }
		     else{
		       isLetter = true; 
		       continue;
		     }
		  }
		
		if(isLetter == false){
			out.println("Input invalid.");
			out.println(" Only letters are allowed");
			out.close();	
		}
		else {
			for (int i=0; i<num.length(); i++)
			  {
				switch(num.charAt(i)){
				case 'A': 
				case 'a':
				case 'B':
				case 'b':
				case 'C':
				case 'c': numString = "2";   break;
				
				case 'D':
				case 'd':
				case 'E':
				case 'e':
				case 'F':
				case 'f': numString = "3"; break;
				
				case 'G':
				case 'g':
				case 'H':
				case 'h':
				case 'I':
				case 'i': numString = "4"; break;
				
			
				case 'J':
				case 'j':
				case 'K':
				case 'k':	
				case 'L':
				case 'l': numString = "5"; break;
				
				
				case 'M':
				case 'm':
				case 'N':
				case 'n':
				case 'O':
				case 'o': numString = "6"; break;
				
				
				case 'P':
				case 'p':
				case 'Q':
				case 'q':
				case 'R':
				case 'r':
				case 'S':
				case 's': numString = "7"; break;
					
				case 'T':
				case 't':
				case 'U':
				case 'u':
				case 'V':
				case 'v': numString = "8"; break;
				
				case 'W': 
				case 'w':
				case 'X':
				case 'x':
				case 'Y':
				case 'y':
				case 'z':
				case 'Z': numString = "9"; break;
			}
				result = result + numString;
				
			  } 
			Cookie ck = new Cookie(carrierString,carrier);
			response.addCookie(ck);
			ck.setMaxAge(0);
			
			HttpSession session = request.getSession();
			session.setAttribute("result", result);
			session.setAttribute("carrierString", carrierString);
			session.setAttribute("carrier", carrier);
			session.setAttribute("num", num);
			Integer hit = (Integer) session.getAttribute("hit");
			Integer hit2 = (Integer) session.getAttribute("hit2");
			Integer hit3 = (Integer) session.getAttribute("hit3");
			
		    if(hit == null ||hit2 == null ||hit3 == null ){
		      hit = new Integer(0);
		      hit2 = new Integer(0);
		      hit3 = new Integer(0);
		     
		    }
		    else if(num.length() == 7){
		     
		    	
		    		
		    		switch(carrier){
			    	case "0919":
			    	case "0920":
			    		hit = new Integer(hit.intValue()+1) ;
			    		break;
			    		
			    	case "0917":
			    	case "0927":
			    		hit2 = new Integer(hit2.intValue()+1) ;
			    		break;
			    	case "0922":
			    	case "0933":
			    		hit3 = new Integer(hit3.intValue()+1) ;
			    		break;
			    	}
		    }
		    
		    session.setAttribute("hit", hit);
		    session.setAttribute("hit2", hit2);  
		    session.setAttribute("hit3", hit3);  
		    
		    if(hit == 100){
		    	session.invalidate();
		    }
			if (num.length()!=7){
				out.println("ERROR. Input character must be 7.<br>");
			
			}else{
				RequestDispatcher dispatch = request.getRequestDispatcher("Servlet2");
				dispatch.forward(request, response);
				out.close();
			}
			
			
	}

}
}
