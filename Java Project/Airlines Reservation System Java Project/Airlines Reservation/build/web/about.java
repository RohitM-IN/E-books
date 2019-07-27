import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class about extends HttpServlet
{
	 public void doGet(HttpServletRequest re,HttpServletResponse rs)
			 throws ServletException,IOException
	 {
	 	rs.setContentType("text/html");
		PrintWriter out=rs.getWriter();
		out.println("<html>");
		out.println("<head><title>cyber credit card system</title></head>");
		out.println("<body alink=#000000 vlink=maroon bgcolor=#ded7be>");
		out.println("<a href='http://localhost:8080/servlet/gloss_of_terms' target='second'>Guide</a>");
		out.println("<br><br>");
		out.println("<a href='http://localhost:8080/servlet/best_card' target='second'>Choose your own best card</a>");
		out.println("<br><br>");
		out.println("<a href='http://localhost:8080/servlet/cost_card' target='second'>Cost of the cards</a>");
		out.println("<br><br>");
		out.println("<a href='http://localhost:8080/servlet/fact' target='second'>Hard Facts</a>");	
		out.println("<br><br>");
		out.println("<a href='http://localhost:8080/servlet/contact' target='second'>Contact us</a>");
		out.println("<br><br>");
		out.println("<a href='http://localhost:8080/servlet/aboutus' target='second'>About us</a>");	
		out.println("<br><br>");
		out.println("</body></html>");
	        out.close();
  	 }
}