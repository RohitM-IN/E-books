import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class Login1 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
				throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>Login Form</title>");
		out.println("<SCRIPT LANGUAGE='JavaScript'>");
		out.println("<!--");
		out.println("function validate()");
		out.println("{");
		out.println("var name,pass");
		out.println("name=document.form1.cname.value");
		out.println("pass=document.form1.pass.value");
		
		
		out.println("if(name==0){");
		out.println("alert('ENTER YOUR NAME')");
		out.println("}");
		
		out.println("else if(!isNaN(parseInt(name))){");
		out.println("alert('ENTER YOUR NAME CORRECTLY')");
		out.println("}");

		out.println("if(pass==0){");
		out.println("alert('PLEASE ENTER THE PASSWORD ')");
		out.println("}");
		out.println("}");

		out.println("-->");
		out.println("</SCRIPT>");
		out.println("</head>");
			
		out.println("<body bgcolor='silver' text=red>");
		out.println("<form name='form1' action=http://localhost:8080/servlet/Login>");
		out.println("<br><br><br><br>");
		out.println("<TITTLE><CENTER><b><h2>LOGIN FORM</CENTER></TITTLE></font></b></h2>");
		out.println("<PRE><PRE><PRE><PRE><PRE><CENTER><br><br><br>");
		out.println("<font size=5>LOGIN NAME <INPUT TYPE=TEXT NAME='cname' SIZE=15>");
		out.println("<BR>");
		out.println(" PASSWORD &nbsp; <INPUT TYPE=PASSWORD NAME='pass' SIZE=15><BR>");
		out.println("</font>");
		out.println("<INPUT TYPE='SUBMIT' VALUE='SUBMIT' onmouseup=validate()>");
		out.println("<br><br<br>");
		out.println("</CENTER>");
		out.println("</body>");
		out.println("</form>");
		out.println("</html>");
	}
}