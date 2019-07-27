import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class limit extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
				throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>Amount Validation</title>");
		out.println("<SCRIPT LANGUAGE='JavaScript'>");
		out.println("<!--");

		out.println("function validate()");
		out.println("{");
		out.println("var cardno,puramt");
		out.println("cardno=document.form1.cno.value");
		out.println("puramt=document.form1.amt.value");
		
		
		out.println("if(cardno==0){");
		out.println("alert('ENTER YOUR CARD NUMBER')");
		out.println("}");
		
		out.println("else if(isNaN(parseInt(cardno))){");
		out.println("alert('ENTER YOUR CARD NUMBER CORRECTLY')");
		out.println("}");

		out.println("if(puramt==0){");
		out.println("alert('PLEASE ENTER THE PURCHASING AMOUNT ')");
		out.println("}");
		out.println("}");

		out.println("-->");
		out.println("</SCRIPT>");
		out.println("</head>");

		out.println("<BODY bgcolor='#fbfbf1'>");
		out.println("<form name='form1' action='http://localhost:8080/servlet/limitvalidation'>");
		out.println("<p><font size='6' color='98677'><b><marquee behavior='alternate'> Amount Validation</marquee>");
		out.println("</font>");
		out.println("<img align=left src='d:/student/madhav/project/redline.gif'>");
		out.println("<br><br>");
		out.println("<div align='center'>");
		out.println("<tr>"); 
		out.println("<td width='54%' height='28'>"); 
		out.println("<td width='46%' height='28'>"); 
		out.println("Card No: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <input type=text name='cno'>");
		out.println("</table><br><br>");
		out.println("</td>");
		out.println("<tr>"); 
		out.println("<td width='54%' height='28'>"); 
		out.println("<td width='46%' height='28'>"); 
		out.println("Purchase Amount: <input type=text name='amt'>");
		out.println("</table><br><br>");
		out.println("<input type=submit value='Submit'onmouseup=validate()>");
	}
}