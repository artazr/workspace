package first.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class hello
 */
@WebServlet("/hello")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    

     // Set response content type
     response.setContentType("text/html");
     
     
     PrintWriter out;
     out = response.getWriter();
     // Create the HTML page
     out.println("<HTML>");
     out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
     out.println("<BODY>");
     out.println("<H1>Hello World from our First Servlet</H1>");
     out.println("<form method='post' action='hello'>");
     out.println("<fieldset>");
     out.println("<legend>Test Form</legend>");
     out.println("<br />");
     out.println("<label for='firstName'>Nom</label>");
     out.println("<input type='text' id='firstName' name='firstName' value='' size='20' maxlength='20' />");
     out.println("<br />");
     out.println("<label for='lastName'>Prénom</label>");
     out.println("<input type='text' id='lastName' name='lastName' value='' size='20' maxlength='20' />");
     out.println("<br />");
     out.println("<label for='birthDate'>Date de naissance</label>");
     out.println("<input type='date' id='date' name='birthDate' />");
     out.println("<br />");
     out.println("<label for='genre'>Sexe :</label><br>");
     out.println("<label><input type='radio' name='gender' value='Femme'>Femme</label>");
     out.println("<label><input type='radio' name='gender' value='Homme'>Homme</label>");
     out.println("<br>");
     out.println("<input type='submit' value='Envoyer' class='sansLabel' />");
     out.println("</fieldset>");
     out.println("</form>");
     out.println("</BODY></HTML>");
     //close the output stream
     out.close();
     Cookie c = new Cookie("firstName", "lastName");
     response.addCookie(c);
     
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		///Creation Cookies
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String birthDate = request.getParameter("birthDate");
		String gender = request.getParameter("gender");

		PrintWriter out = response.getWriter();
		
		out.println("<HTML>\n<BODY>\n" +
		"<H1>Recapitulatif des informations</H1>\n" +
		"<UL>\n" 
		+ "<LI>Nom: " + firstName + "</LI>\n" +
		"<LI>Prénom: " + lastName + "</LI>\n" +
		"<LI>Date de naissance: " + birthDate + "</LI>\n" +
		"<LI>Sexe :" + gender + "</LI>\n" +
		"</UL></BODY></HTML>"); 
		
		Cookie firstNameCookie = new Cookie("firstName", firstName);
		Cookie lastNameCookie = new Cookie("lastName", lastName);
		Cookie birthDateCookie = new Cookie ("birthDate", birthDate);
		Cookie genderCookie = new Cookie ("gender", gender);
		
		/* Set lifetime to 24h */
		firstNameCookie.setMaxAge(60 * 60 * 24);
		lastNameCookie.setMaxAge(60 * 60 * 24);
		birthDateCookie.setMaxAge(60 * 60 * 24);
		genderCookie.setMaxAge(60 * 60 * 24);
		
		response.addCookie(firstNameCookie);
		response.addCookie(lastNameCookie);
		response.addCookie(birthDateCookie);
		response.addCookie(genderCookie);
		
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H1>Read Cookie</H1>");
		out.println("<form method='post' action='ReadCookie'>");
		out.println("<input type='submit' value='Cookie' class='sansLabel' />");
		out.println("</form>");
		out.println("</BODY></HTML>");
	}
}