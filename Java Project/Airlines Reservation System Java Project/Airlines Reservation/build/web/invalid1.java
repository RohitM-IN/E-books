import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class invalid1 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
				throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<body bgcolor='#fbfbf1'>");
		out.println("<center>");
		out.println("<b>Your type the Invalid cardno and security number,Please verify");
		out.println("<br><br><br>");
		out.println("<a href='http://localhost:8080/servlet/valid'>Previous</a></b></center><br><br>");
		out.println("<br><img align=left src='d:/student/madhav/project/butterflies.gif'>");
		out.println("</body>");
		out.println("</html>");
	}
}