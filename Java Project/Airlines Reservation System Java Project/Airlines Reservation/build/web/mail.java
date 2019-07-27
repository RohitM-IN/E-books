import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Date;
public class mail extends HttpServlet
{
	 PrintWriter pw;
	 Connection con;
                   Statement st,st1;
	 String s1,s2,s3,s4,s5,s6,s11;
	 int sn,sn1,cn,cn1;
	 ResultSet rs;	
	public  void doGet(HttpServletRequest request,HttpServletResponse response)
			 throws ServletException,IOException
	{	
		response.setContentType("text/html");			
		PrintWriter out=response.getWriter();
		out.println("<BODY bgcolor='#fbfbf1'>");
		out.println("<br><br>");
		out.println("<div align='center'>");
		out.println("<hr>");
		out.println("u r mail send to<font color='#FF0000'>WWW.CREDITCARD.COM</font><br><br>");
		out.println("<a href='http://localhost:8080/servlet/selectoption'>Selection</a>");		
		out.println("</body>");
		out.println("</table>");
		out.println("<br><br>");
		out.close();
	}
}