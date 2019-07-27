import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class newaccounts extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
				throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>New Account Creation</title>");
		out.println("<SCRIPT LANGUAGE='JavaScript'>");
		out.println("<!--");
		out.println("function validate()");
		out.println("{");
		out.println("var holdername,addr,phoneno,bankname,amount");
		//out.println("holdername=document.form1.cname.value");
		//out.println("addr=document.form1.add.value");
		//out.println("phoneno=document.form1.ph.value");
		out.println("bankname=document.form1.day.value");
		out.println("amount=document.form1.amt.value");
		
		/*out.println("if(holdername==0){");
		out.println("alert('ENTER HOLDER NAME')");
		out.println("}");
	
		out.println("else if(!isNaN(parseInt(holdername))){");
		out.println("alert('ENTER HOLDER NAME CORRECTLY')");
		out.println("}");

		out.println("if(addr==0){");
		out.println("alert('PLEASE ENTER YOU ADDRESS ')");
		out.println("}");

		
		out.println("if(phoneno==0){");
		out.println("alert('PLEASE ENTER PHONE NUMBER')");
		out.println("}");

		out.println("else if(isNaN(phoneno)){");
		out.println("alert('ENTER YOUR PHONE NO. CORRECTLY')");
		out.println("}");*/

		out.println("if(amount==0){");
		out.println("alert('PLEASE ENTER YOUR INITIAL AMOUNT')");
		out.println("}");

		out.println("else if(isNaN(amount)){");
		out.println("alert('ENTER YOUR INCOME IN NUMBERS')");
		out.println("}");
		out.println("}");
		out.println("-->");
		out.println("</SCRIPT>");
		out.println("</head>");
	
		out.println("<body bgcolor='#fbfbf1' text=red>");
		out.println("<form name='form1' action=http://localhost:8080/servlet/newaccounts1>");
		out.println("<br><br><br><br>");
		out.println("<TITTLE><CENTER><b><h2>NEW ACCOUNT CREATION</CENTER></TITTLE></font></b></h2>");
		out.println("<PRE><PRE><PRE><PRE><PRE><CENTER><br><br><br>");
		out.println("<font size=3>");
		/*out.println("         HOLDER NAME <INPUT TYPE=TEXT NAME='cname' SIZE=15 maxlength=25>");
		out.println("<BR>");
		out.println("         ADDRESS &nbsp;&nbsp;   <INPUT TYPE=TEXTAREA NAME='add' SIZE=15 maxlength=10><BR>");
		out.println("         PH-NO        <INPUT TYPE=TEXT NAME='ph' SIZE=15 maxlength=25><br>");*/
		out.println("      BANKNAME       <select name='day'>");
		out.println("<option value='SBI'>SBI</option>");
		out.println("<option value='ICICI'>ICICI</option>");
		out.println("<option value='KVB'>KVB</option>");
		out.println("<option value='Andra Bank'>Andra Bank</option>");
		out.println("<option value='Indian Bank'>Indian Bank</option>");
		out.println("</select>");
		out.println("<BR>");
		out.println("        INITIAL AMOUNT <INPUT TYPE=TEXT NAME='amt' SIZE=15 maxlength=25>");
		out.println("<BR>");
		out.println("</font>");
		out.println("<INPUT TYPE='SUBMIT' VALUE='SUBMIT' onmouseup=validate()>");
		out.println("<br><br<br>");
		out.println("</CENTER>");
		out.println("</body>");
		out.println("</form>");
		out.println("</html>");
	}
}