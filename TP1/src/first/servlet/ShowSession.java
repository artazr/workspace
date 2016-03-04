package first.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
* Servlet implementation class ShowSession
*/
@WebServlet("/ShowSession")
public class ShowSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int nbVisites; 
	private ArrayList<String> items = new ArrayList();

/**
* @see HttpServlet#HttpServlet()
*/
public ShowSession() {
super();
// TODO Auto-generated constructor stub
}

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession s = request.getSession(true);

		
		
		
		
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Session</TITLE></HEAD>");
		out.println("<BODY>");
		if(s.isNew()){
			out.println("<H1>Welcome!</H1>");
			nbVisites = 0;
		}
		else{
			nbVisites++;
			out.println("<H1>Welcome Back!</H1>");
			out.println("<p>Nombre de visites : "+nbVisites+"</p>");
		}
		out.println("</BODY></HTML>");
		 
		
	
	
	}
	
	

/**
 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
 */
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	PrintWriter out = response.getWriter();
	HttpSession s = request.getSession(true);
	items.add(request.getParameter("newItem"));
	s.setAttribute("Items", items);
	out.println(""+s.getAttribute("Items"));
}
	}
