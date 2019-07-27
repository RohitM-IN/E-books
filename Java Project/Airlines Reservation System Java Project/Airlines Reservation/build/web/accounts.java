
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class accounts extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
				throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<body bgcolor='#fbfbf1'>");
		out.println("<br><img align=left src='d:/student/madhav/project/rose.gif'>");
		out.println("<center>");
		out.println("<br><br><br><br><br><br><br><big>WELCOME ACCOUNTS DETAILS OPTIONS </big>"); 
		out.println("<br><br>");
		out.println("<a href='http://localhost:8080/servlet/newaccounts'>NEWACCOUNT CREATION</a>");	
		out.println("<br><br>");
		out.println("<a href='http://localhost:8080/servlet/oldaccount'>OLDACCOUNT DEATILS</a><br>");
		out.println("<br><img align=right src='d:/student/madhav/project/rose.gif'>");
		out.println("</body>");
		out.println("</form>");
		out.println("</html>");
	}
}
