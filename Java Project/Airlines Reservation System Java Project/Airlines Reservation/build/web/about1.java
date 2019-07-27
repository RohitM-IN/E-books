import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class about1 extends HttpServlet
{
	 public void doGet(HttpServletRequest re,HttpServletResponse rs)
			 throws ServletException,IOException
	 {
	 	rs.setContentType("text/html");
		PrintWriter out=rs.getWriter();
		out.println("<html>");
		out.println("<head><title>cyber credit card system</title>");
		out.println("</head>");
		out.println("<body alink=#990000 vlink=#000000 bgcolor=#ded7be>");
		out.println("<a href='http://localhost:8080/servlet/pick' target='pick'>Cards</a>");
		out.println("<br><br>");
		out.println("<a href='http://localhost:8080/servlet/gloss_of_terms' target='pick'>Guide</a>");
		out.println("<br><br>");
		out.println("<a href='http://localhost:8080/servlet/best_card' target='pick'>Choose your own best card</a>");
		out.println("<br><br>");
		out.println("<a href='http://localhost:8080/servlet/cost_card' target='pick'>Cost of the cards</a>");
		out.println("<br><br>");
		out.println("<a href='http://localhost:8080/servlet/fact' target='pick'>Hard Facts</a>");
		out.println("<br><br>");
		out.println("<a href='http://localhost:8080/servlet/contact' target='pick'>Contact us</a>");
		out.println("<br><br>");
		out.println("<a href='http://localhost:8080/servlet/aboutus' target='pick'>About us</a>");
		out.println("<br><br>");
		out.println("</body>");
		out.println("</html>");
		out.close();
  	 }
}