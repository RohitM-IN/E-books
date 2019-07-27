import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class first extends HttpServlet
{
	 public void doGet(HttpServletRequest re,HttpServletResponse rs)
			 throws ServletException,IOException
	 {
	 	rs.setContentType("text/html");
		PrintWriter out=rs.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Cyber credit card system</title>");
		out.println("</head>");
		out.println("<frameset cols=20%,* border=0>");
		out.println("     <frame src='http://localhost:8080/servlet/about' scroll='no'>");
		out.println("     <frame src='http://localhost:8080/servlet/homepage' scroll='no' name='second'>");
		out.println("</frameset>");
		out.println("</noframes>");
		out.println("</html>");	
	        out.close();
  	 }
}