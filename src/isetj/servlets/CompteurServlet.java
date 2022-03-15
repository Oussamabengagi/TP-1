package isetj.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CompteurServlet
 */
@WebServlet("/CompteurServlet")
public class CompteurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompteurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    private int hitCount; 

    public void init() { 
       
       hitCount = 0;
    } 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  response.setContentType("text/html");

	      hitCount++; 
	      
	      PrintWriter out = response.getWriter();
	      
	      
	      out.println( 
	         "<html>\n" +
	            "<head><title> Compteur  </title></head>\n" +
	            "<body >\n" +
	               "<h1 align = \"center\"> Total page Refreshs : </h1>\n" +
	               "<h2 align = \"center\">" + hitCount + "</h2>\n" +
	            "</body> " +
	        " </html>"
	      );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
