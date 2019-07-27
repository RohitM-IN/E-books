import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class selectoption extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
				throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html<head><title>Select Option</title></head>");	
		out.println("<body bgcolor='#fbfbf1'>");
		out.println("<form name='form1' method='Get'>");
		out.println("<img align=left src='d:/student/madhav/project/rose.gif'>");	
		out.println("<center>");
		out.println("<br><br><br><br><br><br><br><br><big>WELCOME TO CYBERCASH</big>"); 
		out.println("<br><br>");
		/*out.println("<a href='http://localhost:8080/servlet/credit'>CARD SELECTION</a>");	
		out.println("<br><br>");*/
		out.println("<a href='http://localhost:8080/servlet/valid'>CARD VALIDATION</a>");
		out.println("<br><br>");
		out.println("<a href='http://localhost:8080/servlet/state'>STATEMENT</a>");	
		out.println("<br><br>");
		//out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
		out.println("<a href='http://localhost:8080/servlet/subhold'>SUBHOLDER CREATION</a>");
       		out.println("<br><br>");
		//out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
		out.println("<a href='http://localhost:8080/servlet/mailoptions'>MAIL OPTIONS</a>");
		out.println("<img align=right src='d:/student/madhav/project/rose.gif'></center>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
}
