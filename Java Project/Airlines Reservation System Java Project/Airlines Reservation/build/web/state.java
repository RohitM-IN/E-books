import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class state extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
				throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>Stetement</title>");
		out.println("<SCRIPT LANGUAGE='JavaScript'>");
		out.println("<!--");
		out.println("function validate()");
		out.println("{");
		out.println("var cardno");
		out.println("cardno=document.form1.cno.value");
				
		out.println("if(cardno==0){");
		out.println("alert('ENTER YOUR CARD NUMBER')");
		out.println("}");
		
		out.println("else if(isNaN(parseInt(cardno))){");
		out.println("alert('ENTER YOUR CARD NUMBER CORRECTLY')");
		out.println("}");
		out.println("}");

		out.println("-->");
		out.println("</SCRIPT>");
		out.println("</head>");

		out.println("<body bgcolor='#fbfbf1' text=red>");
		out.println("<form name='form1' action=http://localhost:8080/servlet/statement>");
		out.println("<br>");
		out.println("<p><font size='6' color='black'><marquee behavior='alternate'><b>STATEMENT</b></marquee></font></p>");
		out.println("<img align=left src='d:/student/madhav/project/redline.gif'>");
		out.println("<PRE><CENTER><br><br><br><br>");
		out.println("<font size=5>card no<INPUT TYPE=TEXT NAME='cno' SIZE=15 maxlength=25>");
		out.println("</font>");
		out.println("<INPUT TYPE='SUBMIT' VALUE='SUBMIT' onmouseup=validate()>");
		out.println("<br><br<br>");
		out.println("</CENTER>");
		out.println("</body>");
		out.println("</form>");
		out.println("</html>");
	}
}





