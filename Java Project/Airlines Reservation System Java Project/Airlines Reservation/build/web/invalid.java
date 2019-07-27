import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class invalid extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
				throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<body bgcolor='#fbfbf1'>");
		out.println("<center>");
		out.println("USER NAME AND PASSWORD IS INCORRECT");
		out.println("<br>");
		out.println("<a href='http://localhost:8080/servlet/homepage'>LOGIN</a><br>");
		out.println("<br><img align=left src='d:/student/madhav/project/butterflies.gif'>");
		out.println("</body>");
		out.println("</form>");
		out.println("</html>");
	}
}
