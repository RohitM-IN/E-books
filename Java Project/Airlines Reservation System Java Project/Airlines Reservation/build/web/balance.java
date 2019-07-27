import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class balance extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
				throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>Balance Transfer</title>");
		out.println("<SCRIPT LANGUAGE='JavaScript'>");
		out.println("<!--");

		out.println("function validate()");
		out.println("{");
		out.println("var accno,shopaccno,puramt");
		out.println("accno=document.form1.crno.value");
		out.println("shopaccno=document.form1.nno.value");
		out.println("puramt=document.form1.amt.value");
		
		out.println("if(accno==0){");
		out.println("alert('ENTER YOUR ACCOUNT NUMBER')");
		out.println("}");
		
		out.println("else if(isNaN(parseInt(accno))){");
		out.println("alert('ENTER YOUR ACOUNT NUMBER CORRECTLY')");
		out.println("}");

		out.println("if(shopaccno==0){");
		out.println("alert('PLEASE ENTER THE SHOP ACCOUNT NUMBER')");
		out.println("}");
		
		out.println("else if(isNaN(parseInt(shopaccno))){");
		out.println("alert('ENTER SHOP ACOUNT NUMBER CORRECTLY')");
		out.println("}");

		out.println("if(puramt==0){");
		out.println("alert('PLEASE ENTER PURCHASING AMOUNT')");
		out.println("}");
		
		out.println("else if(isNaN(parseInt(puramt))){");
		out.println("alert('ENTER PURCHASING AMOUNT CORRECTLY')");
		out.println("}");
		out.println("}");

		out.println("-->");
		out.println("</SCRIPT>");
		out.println("</head>");

		out.println("<BODY bgcolor='#fbfbf1'>");
		out.println("<form name='form1'  action=http://localhost:8080/servlet/balance1>");
		out.println("<br>");
		out.println("<div align='center'>");
		out.println("<p><font size='6' color='black'><marquee behavior='alternate'><b>BALANCE TRANSFER DETAILS</b></marquee></font></p>");
		out.println("<img align=left src='d:/student/madhav/project/redline.gif'>");
		out.println("<p>&nbsp;</p>");
		out.println("<table border='2' width='60%' height='30%'>");
		out.println("<br><br>");
		out.println("<tr>"); 
		out.println("<td width='44%' height='28'>"); 
		out.println("<div align='right'><b>Customer Card Number: </b></div>");
		out.println("</td>");
		out.println("<td width='46%' height='28'>");
		out.println("<input type='text' name='crno' size=20>");
		out.println("</td>");
		out.println("<tr>");
		out.println("<td width='54%' height='28'> ");
		out.println("<div align='right'><b>Shop Account No: </b></div>");
		out.println("</td>");
		out.println("<td width='46%' height='28'> ");
		out.println("<input type='text' name='nno' size=20>");
		out.println("</td>");
		out.println("<tr>"); 
		out.println("<td width='54%' height='28'>");
		out.println("<div align='right'><b>Amount Transfer: </b></div>");
		out.println("<td width='46%' height='28'> ");
		out.println("<input type='text' name='amt' size=20>");
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("<p>");
		out.println("<input type=submit name=b1 value='Submit' onmouseup=validate()>");
		out.println("</p>");
		out.println("</div>");
		out.println("</form>");
		out.println("<p>&nbsp;</p></BODY>");
		out.println("</HTML>");
	}
}