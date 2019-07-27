import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class fact extends HttpServlet
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
		out.println("<h3 align=center><font face=Times new roman color=navy>Hard facts</font></h3>");
		out.println("<font face='Times new roman' size=4>");
		out.println("Visa International has the largest global ATM network in over 113 countries.");

		out.println("<p>Mastercard International has over 23,000 member financial institutions serving consumers");
		out.println(" in 220 countries and territories and has over 3,50,000 ATM locations around the globe.</p>");

		out.println("The first card was issued in India by Visa in 1981.");

		out.println("The country's first Gold Card was also issued from Visa in 1986.");

		out.println("<p>The first international credit card was issued to a restricted number of customers by Andhra Bank");
		out.println("in 1987 through the Visa program, after getting special permission from the Reserve Bank of India.</p>");
		out.println("<a href='http://localhost:8080/servlet/homepage'><img align=right src='d:/student/madhav/project/home3.gif'></a>");
		out.println("</body>");
		out.println("<html>");
		out.close();
  	 }
}