import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class oldaccountcheck1 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
				throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>Old AccountDetails</title>");
		out.println("<SCRIPT LANGUAGE='JavaScript'>");
		out.println("<!--");
		out.println("function validate()");
		out.println("{");
		out.println("var accno,name");
		out.println("accno=document.form1.nno.value");
		out.println("name=document.form1.cname.value");
		out.println("if(accno==0){");
		out.println("alert('ENTER YOUR ACCOUNT NUMBER')");
		out.println("}");

		out.println("else if(isNaN(parseInt(accno))){");
		out.println("alert('ENTER BANK NAME CORRECTLY')");
		out.println("}");

		out.println("if(name==0){");
		out.println("alert('PLEASE ENTER BANK NMAE')");
		out.println("}");

		out.println("else if(!isNaN(name)){");
		out.println("alert('ENTER BANK NAME CORRECTLY')");
		out.println("}");
		out.println("}");
		out.println("-->");
		out.println("</SCRIPT>");
		out.println("</head>");

		out.println("<body bgcolor='#fbfbf1' text=red>");
		out.println("<form name='form1' action=http://localhost:8080/servlet/oldaccountcheck>");
		out.println("<br><br><br><br>");
		out.println("<TITTLE><CENTER><b><h2>OLD ACCOUNT DETAILS</CENTER></TITTLE></font></b></h2>");
		out.println("<PRE><PRE><PRE><PRE><PRE><CENTER><br><br><br>");
		out.println("<font size=3>");
		out.println("ACCOUNT NO &nbsp;&nbsp; <INPUT TYPE=TEXT NAME='nno' SIZE=15 maxlength=25>");
		out.println("<BR>");
		out.println("&nbsp;&nbsp;BANK NAME NAME &nbsp;   <INPUT TYPE=TEXT NAME='cname' ><BR>");
		out.println("</font>");
		out.println("<INPUT TYPE='SUBMIT' VALUE='SUBMIT' onmouseup=validate()>");
		out.println("<br><br<br>");
		out.println("</CENTER>");
		out.println("</body>");
		out.println("</form>");
		out.println("</html>");
	}
}