import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class selectoption2 extends HttpServlet
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
		out.println("<center><br><br><br><br><br><br><br>");
		out.println("<big><font size=6>WELCOME TO CYBERCASH</font></big>"); 
		out.println("<br><br>");
		out.println("<a href='http://localhost:8080/servlet/credit'>Clikc here to select <i>CREDIT CARD</i></a>");	
		out.println("<br><br>");
		/*out.println("<a href='http://localhost:8080/servlet/subhold'>SUBHOLDER CREATION</a>");
		out.println("<br><br>");
		out.println("<a href='http://localhost:8080/servlet/mailoptions'>MAIL OPTIONS</a>");	
		out.println("<br><br>");
		out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
		out.println("<a href='http://localhost:8080/servlet/balance'>BALANCE TRANSFER</a>");
       		out.println("<br><br>");
		out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
		out.println("<a href='http://localhost:8080/servlet/mail1'>MAIL</a>");*/
		out.println("<img align=right src='d:/student/madhav/project/rose.gif'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
}
