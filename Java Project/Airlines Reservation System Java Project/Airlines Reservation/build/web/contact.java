import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class contact extends HttpServlet
{
	 public void doGet(HttpServletRequest re,HttpServletResponse rs)
			 throws ServletException,IOException
	 {
	 	rs.setContentType("text/html");
		PrintWriter out=rs.getWriter();
		out.println("<html>");
		out.println("<head><title>Cyber Credit Card System</title>");
		out.println("<body bgcolor=#fbfbf1>");
		out.println("<marquee align=center bgcolor=#ded7bd direction=left behavior=slide>");
		out.println("<font face='Times new roman' size=5 color=#990000><b> ");
		out.println("CYBER CREDIT CARD SYSTEM</font>");
		out.println("</marquee><br>");
		out.println("<h3 align=center><font face=Times new roman color=navy>Contact</font></h3>");
		out.println("<font face='Times new roman' size=4>");
		out.println("<p>G.BHAGAVATHINATH<br>");
		out.println("S/o V.GURUSAMY,<br>");
		out.println("L2/89,RAILARNAGAR,<br>");
		out.println("MADURAI,<br>");
		out.println("Tamil Nadu.<br>");
		out.println("PH: 3112793<br>");
		out.println("E-mail:mrbhaga@yahoo.co.in<br>");
		out.println("<a href='http://localhost:8080/servlet/homepage'><img align=right src='d:/student/madhav/project/home3.gif'></a>");
		out.println("</body>");
		out.println("<html>");
		out.close();
  	 }
}