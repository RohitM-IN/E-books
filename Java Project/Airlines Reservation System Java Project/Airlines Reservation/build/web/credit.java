import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class credit extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
				throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>Card Selection</title>");
		/*out.println("<SCRIPT LANGUAGE='JavaScript'>");
		out.println("<!--");
		out.println("function validate()");
		out.println("{");
		//out.println("var cardname,cardtype");
		//out.println("cardname=document.form1.name");
		//out.println("cardtype=document.form1.type");
		
		out.println("if(document.form1.name.checked=='false'){");
		out.println("alert('PLEASE SELECT CARD NAME')");
		out.println("}");
		
		out.println("if(document.form1.type.checked=='false'){");
		out.println("alert('PLEASE SELECT YOUR CARD TYPE')");
		out.println("}");

		out.println("}");
		out.println("-->");
		out.println("</SCRIPT>");*/
		out.println("</head>");
		out.println("<BODY bgcolor='silver'>");
		out.println("<form name='form1'  action=http://localhost:8080/servlet/cardselection>");
		out.println("<br><br><br>");
		out.println("<div align='center'>");
		out.println("<table border='2' width='46%'>");
		out.println("<tr>"); 
		out.println("<td width='64%' height='28'>"); 
		out.println("<img src='d:/student/madhav/project/visalogo1.jpg'>");	
		out.println("<img src='d:/student/madhav/project/masterlogo.jpg'>");
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("<table border='2' width='60%'>");
		out.println("<tr>");
		out.println("<td width='74%' height='28'>"); 
		out.println("<div align='center'>");
		out.println("<p><font size='6' color='#660066'><b><marquee behavior='alternate'> Card Selection</marquee></b></font></p>");
		out.println("<p>&nbsp;</p>");
		out.println("</td>");
		out.println("<table border='2' width='60%'>");
		out.println("<tr>"); 
		out.println("<td width='54%' height='28'>"); 
		out.println("<div align='right'><b>Credit Card Name:");
		out.println("</td></B></div>");
		out.println("<td width='46%' height='28'>"); 
		out.println("<input type='radio' name='name' value='VISA' checked>VISA");
		out.println("<input type='radio' name='name' value='MASTERCARD'>MASTER CARD</td>");
		out.println("</tr>");
		out.println("<tr>"); 
		out.println("<td width='54%' height='28'>"); 
		out.println("<div align='right'><b>Credit Card Type:");
		out.println("</td></B></div>");
		out.println("<td width='46%' height='28'>"); 
		out.println("<input type='radio' name='type' value='75000' checked>SILVER");
		out.println("<input type='radio' name='type' value='95000'>GOLD");
		out.println("<input type='radio' name='type' value='100000'>PLATINUM");
		out.println("</b>");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>"); 
		out.println("<td width='54%' height='28'>"); 
		out.println("<div align='right'><b>Bank Name: </b></div>");
		out.println("</td>");
		out.println("<td width='46%' height='28'>"); 
		out.println("<select name='day'>");
		out.println("<option value='SBI'>SBI</option>");
		out.println("<option value='ICICI'>ICICI</option>");
		out.println("<option value='KVB'>KVB</option>");			
		out.println("</table><br><br>");	
		out.println("<input type=submit value='Submit'>");
		out.println("</div>");
		out.println("</form>");
		out.println("</BODY>");
		out.println("</HTML>");
	}
}
