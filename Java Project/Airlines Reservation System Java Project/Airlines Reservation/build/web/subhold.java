import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class subhold extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
				throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><head><title>Subholder</title>");
		out.println("<SCRIPT LANGUAGE='JavaScript'>");
		out.println("<!--");
		out.println("function validate()");
		out.println("{");
		out.println("var relation,subname,password,email,age,at=0,dot=0");
		out.println("relation=document.form1.rel.value");
		out.println("subname=document.form1.cname.value");
		out.println("password=document.form1.pass.value");
                out.println("email=document.form1.email.value");
		out.println("age=document.form1.age.value");

		out.println("if(subname==0){");
		out.println("alert('ENTER SUBHOLDER NAME')");
		out.println("}");

		out.println("else if(!isNaN(parseInt(subname))){");
		out.println("alert('ENTER YOUR NAME CORRECTLY')");
		out.println("}");

		out.println("if(password==0){");
		out.println("alert('PLEASE ENTER THE PASSWORD ')");
		out.println("}");

		out.println("if(email==0)");
		out.println("{");
		out.println("alert('PLEASE ENTER YOUR EMAILID')");
		out.println("}");
		out.println("else {");
		out.println("for(i=0;i<=email.length;i++){");
		out.println("if(email.charAt(i)=='@'){");
		out.println("at++");
		out.println("}");
		out.println("if(email.charAt(i)=='.'){");
		out.println("dot++");
		out.println("}");
		out.println("}");
		out.println("if(at!=1){");
		out.println("alert('ENTER A VALID EMAILID')");
		out.println("}");
		out.println("else if(dot<1 || dot>2){");
		out.println("alert('ENTER A VALID EMAILID')");
		out.println("}}");
		
		out.println("if(age==0){");
		out.println("alert('PLEASE ENTER YOUR AGE')");
		out.println("}");

		out.println("else if(isNaN(age)){");
		out.println("alert('ENTER YOUR AGE IN NUMBERS')");
		out.println("}");
		out.println("}");
		out.println("-->");
		out.println("</SCRIPT>");
		out.println("</head>");
	
		out.println("<body bgcolor=#fbfbf1>");
		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=fmgkfg border=0><TBODY>");
		out.println("<TR bgColor=hdhsfg>");
		out.println("<TD bgColor=#hht55y><font size=6 color=yellow><center><marquee behavior=alternate>SUBHOLDER</center></font> </maquee>");
		out.println("</TD></TR></TBODY></TABLE>");
		out.println("<HR SIZE='3' COLOR='red'>");
		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=#nfdj454 border=0><TBODY>");
		out.println("<TR bgColor=846584>");
		out.println("<TD bgColor=black><FONT face=Arial color=red size=4><B><marquee>Subholder's Personal Details</B></FONT></marquee>");
		out.println("<br>");
		out.println("</TD></TR></TBODY></TABLE>");
		out.println("</FONT></TD></TR></center></TBODY></TABLE>");
		out.println("<HR SIZE='3' COLOR='red'>");
		out.println("<form name='form1'  action=http://localhost:8080/servlet/subholdsignup>");
		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=#fbfbf1 border=0><TBODY>");
		out.println("<TR>");		
		out.println("<TD width='25%' height=2><FONT face=Arial size=2>Supplimentry For My</FONT>"); 
		out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<SELECT size=1 name='rel'>");
		out.println("<OPTION value='Select Option' selected>--Select--</OPTION> ");
		out.println("<OPTION value=father>Father</OPTION>");
                out.println("<OPTION value=mother>Mother</OPTION>");
	        out.println("<OPTION value=wife>Wife</OPTION>");
		out.println("<OPTION value=son>Son</OPTION>");
		out.println("</SELECT>");
		out.println("</TD></TR></TBODY></TABLE>");
		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=#fbfbf1 border=0><TBODY>");
		out.println("<TR>");
		out.println("<TD width='25%' rowSpan=2><FONT face=Arial size=2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Subholder Name</FONT></TD>");
		out.println("<TD Align=left colspan=3><FONT face=Arial size=2><INPUT type=textbox name='cname' size='25'></FONT></TD><br>");
		out.println("</TR></TBODY></TABLE>");
		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=#fbfbf1 border=0><TBODY>");
		out.println("<TR><TD width='25%' rowSpan=2><FONT face=Arial size=2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Password</FONT></TD>");
		out.println("<TD Align=left colspan=3><FONT face=Arial size=2><INPUT type=password name='pass' size='20'>");
		out.println("</TD></TBODY></table>");
		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=#fbfbf1 border=0><TBODY>");
		out.println("<TR>");
		out.println("<TD width='25%' rowSpan=2><FONT face=Arial size=2>&nbsp;&nbsp;&nbsp;&nbsp;Sex ");
		out.println("<TD Align=top rowSpan=2><FONT face=Arial size=2>");
		out.println("<input type='radio' maxLength=25  name='cma' value='m' checked>MALE<INPUT TYPE='RADIO' MAXLENGTH=25 NAME='cma' VALUE='f'>FEMALE<BR></FONT>");
		out.println("</TD></TBODY></table>");
 		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=#fbfbf1 border=0><TBODY>");
		out.println("<TR>");
		out.println("<TD width='25%' rowSpan=2><FONT face=Arial size=2>&nbsp;&nbsp;&nbsp;&nbsp;E-Mail</FONT></TD>");
		out.println("<TD Align=left colspan=3><FONT face=Arial size=2><INPUT type=textbox name='email' size='20'></FONT></TD><br>");
		out.println("</TR></TBODY></TABLE>");
		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=#fbfbf1 border=0><TBODY>");
		out.println("<TR><TD width='25%' rowSpan=2><FONT face=Arial size=2>&nbsp;&nbsp;&nbsp;&nbsp;Age</FONT></TD>");
		out.println("<TD Align=left colspan=3><FONT face=Arial size=2><INPUT type=text name='age' size='3'>");
		out.println("</TD></TBODY></table>");
 		out.println("<center><br>");
		out.println("<input type=submit value='Submit' onmouseup=validate()>");
		out.println("<input type=reset value='Reset'>");
		out.println("</center><br>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
}      
