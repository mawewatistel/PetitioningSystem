 

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
	Applicant person = new Applicant();
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		createApplicant(request, response);
		out.println("<html>");
		out.println("<title> This is a sample CV");
		out.println("</title>");
		out.println("<body>");
		out.println("<h2> Personal Information</h2>");
		out.println("Firstname: " + person.getFirstName() + "<br><br>");
		out.println("Lastname: " + person.getLastName() + "<br><br>");
		out.println("Middlename: " + person.getMiddleName() + "<br><br>");
		out.println("Birthdate: " + person.getBirthDate() + "<br><br>");
		out.println("Marital Status: " + person.getMaritalStatus() + "<br><br>");
		out.println("Home Address: " + person.getHomeAddress() + "<br><br>");
		out.println("Provincial Address: " + person.getProvincialAddress() + "<br><br>");
		out.println("<h2> Contact Details</h2>");
		out.println("Mobiile Number: " + person.getMobileNumber() + "<br><br>");
		out.println("Landline Number: " + person.getLandlineNumber() + "<br><br>");
		out.println("E-mail Address: " + person.getEmailAddress() + "<br><br>");
		out.println("<h2>Educational Background</h2>");
		out.println("<h2>Tertiary</h2>");
		out.println("Course: " + person.getCourse() + "<br><br>");
		out.println("School: " + person.getSchool() + "<br><br>");
		out.println("Inclusive Years: " + person.InclusiveYears() + "<br><br>");
		out.println("Honors Received: " + person.getHonorsReceived() + "<br><br>");
		out.println("<h2>Secondary</h2>");
		out.println("School: " + person.getSchool1() + "<br><br>");
		out.println("Inclusive Years: " + person.InclusiveYears1() + "<br><br>");
		out.println("Honors Received: " + person.getHonorsReceived1() + "<br><br>");
		out.println("<h2>Primary</h2>");
		out.println("School: " + person.getSchool2() + "<br><br>");
		out.println("Inclusive Years: " + person.InclusiveYears2() + "<br><br>");
		out.println("Honors Received: " + person.getHonorsReceived2() + "<br><br>");
		out.println("</body>");
		out.println("</html>");
	}
	protected void createApplicant(HttpServletRequest request, HttpServletResponse response){
		person = new Applicant();
		person.setLastName(request.getParameter("lname"));
		person.setFirstName(request.getParameter("fname"));
		person.setMiddleName(request.getParameter("mname"));
		person.setBirthDate(request.getParameter("bdate"));
		person.setMaritalStatus(request.getParameter("mstatus"));
		person.setHomeAddress(request.getParameter("haddress"));
		person.setProvincialAddress(request.getParameter("paddress"));
		person.setMobileNumber(request.getParameter("mnumber"));
		person.setLandlineNumber(request.getParameter("lnumber"));
		person.setEmailAddress(request.getParameter("eaddress"));
		person.setCourse(request.getParameter("crs"));
		person.setSchool(request.getParameter("schl"));
		person.setInclusiveYears(request.getParameter("iyears"));
		person.setHonorsReceived(request.getParameter("hreceived"));
		person.setSchool1(request.getParameter("schl1"));
		person.setInclusiveYears1(request.getParameter("iyears1"));
		person.setHonorsReceived1(request.getParameter("hreceived1"));
		person.setSchool2(request.getParameter("schl2"));
		person.setInclusiveYears2(request.getParameter("iyears2"));
		person.setHonorsReceived2(request.getParameter("hreceived2"));
	}
}
