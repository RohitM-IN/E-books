import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class mail1 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
				throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><head>");
		out.println("<form name='f1' action='http://localhost:8080/servlet/mail'>");
		out.println("<body bgcolor='#fbfbf1'>");
		out.println("<table width='100%' border='0' cellspacing='0' cellpadding='0'>");
		out.println("<tr>"); 
		out.println("<td height='100' colspan='2' align='center'><b><font face='Tahoma' size='6' color='#330000'>CREDIT CARD BANKING</font></b></td>");
		out.println("<td height='100' width='28%' align='center'>");
		out.println("<img src='d:/student/madhav/project/email4.gif' width='130' height='110'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td height='18' colspan='3' align='center'> ");
		out.println("<img align=left src='d:/student/madhav/project/colorful.gif'>");
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("<br><br>");
		out.println("<table width='100%' border='0' cellspacing='0' cellpadding='0'>");
		out.println("<tr>");
		out.println("<td height='277' width='27%' align='center' valign='top'>"); 
		out.println("</td>");
		out.println("<td height='277' width='73%' valign='top' align='center'>"); 
		out.println("<table width='90%' border='0' cellspacing='0' cellpadding='0'>");
		out.println("<tr align='left'>");
		out.println("<td height='103' colspan='3'> ");
		out.println("<p>&nbsp;</p>");
         		out.println("<font size='5'>FEEDBACK FORM</font>");
		out.println("<br><br>Dear</b></p>");
		out.println("<p><b>&nbsp;&nbsp;&nbsp;&nbsp;");
		out.println("<font color='#0000CC'>To send your message to any card missing or statement is not&nbsp; <br>received, please send your mail to </font>");
		out.println("<font color='#FF0000'>WWW.CREDITCARD.COM</font></b></p>");
		out.println("<p><b>");
		out.println("<br>");
		out.println("</font></b></p>");
		out.println("</td>");
		out.println("</tr><tr>"); 
		out.println("<td width='42%' height='26' align='right' valign='top'><b>Your message here </b></td>");
		out.println("<td width='5%' height='26'>&nbsp;</td>");
		out.println("<td width='53%' height='26'> ");
		out.println("<textarea name='msg' rows='4' cols='45'></textarea>");
		out.println("</td></tr>");
		out.println("<td><input type='submit' value='Submit' >");
		out.println("</table>");
		out.println("</td></tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
}