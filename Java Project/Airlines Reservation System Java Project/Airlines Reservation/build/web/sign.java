import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class sign extends HttpServlet
{
	public void init(ServletConfig c) throws ServletException
	{
		super.init(c);
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response)
				throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><title>NEW USER FORM</title>");
		out.println("<SCRIPT LANGUAGE='JavaScript'>");
		out.println("<!--");
		out.println("function validate()");
		out.println("{");
		out.println("var name,pass,i,addr,email,resphone,offphone,pinno,city,income,land,proff,at=0,dot=0");
		out.println("name=document.newform.cname.value");
		out.println("pass=document.newform.pass.value");
		out.println("addr=document.newform.add.value");
		out.println("pinno=document.newform.pin1.value");
		out.println("city=document.newform.city.value");
		out.println("land=document.newform.land.value");
		out.println("email=document.newform.email.value");
		out.println("resphone=document.newform.res.value");
		out.println("offphone=document.newform.off.value");
		out.println("proff=document.newform.proff.value");
		out.println("income=document.newform.cnum.value");
		out.println("document.newform.cname.focus();");
		out.println("if(name==0){");
		out.println("alert('ENTER YOUR NAME')");
		out.println("}");
		out.println("else if(!isNaN(parseInt(name))){");
		out.println("alert('ENTER YOUR NAME CORRECTLY')");
		out.println("}");

		out.println("if(pass==0){");
		out.println("alert('PLEASE ENTER THE PASSWORD ')");
		out.println("}");

		out.println("if(addr==0){");
		out.println("alert('PLEASE ENTER YOUR ADDRESS')");
		out.println("}");

		out.println("if(pinno==0){");
		out.println("alert('PLEASE ENTER THE PIN ')");
		out.println("}");
		
		out.println("if(pinno.length>6){");
		out.println("alert('PLEASE ENTER PIN NUMBER LESS THAN 6 DIGITS')");
		out.println("}");	

		out.println("if(city==0){");
		out.println("alert('PLEASE SELECT YOUR CITY')");
		out.println("}");

		out.println("if(land==0){");
		out.println("alert('PLEASE ENTER YOUR LANDMARK ')");
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

		out.println("if((resphone==0) & (offphone==0)){");
		out.println("alert('PLEASE ENTER ATLEAST ONE PHONE NUMBER')");
		out.println("}");

		out.println("else{");
		out.println("if(isNaN(resphone)){");
		out.println("alert('ENTER YOUR PHONE NO. CORRECTLY')");
		out.println("}");

		out.println("if(isNaN(offphone)){");
		out.println("alert('ENTER YOUR PHONE NO. CORRECTLY')");
		out.println("}}");
		
		out.println("if(resphone.length>11){");
		out.println("alert('ENTER YOUR RES PHONE LESS THAN 11 DIGITS')");
		out.println("}");

		out.println("if(offphone.length>11){");
		out.println("alert('ENTER YOUR OFF PHONE LESS THAN 11 DIGITS')");
		out.println("}");

		out.println("if(income==0){");
		out.println("alert('PLEASE ENTER YOUR INCOME')");
		out.println("}");

		out.println("else if(isNaN(income)){");
		out.println("alert('ENTER YOUR INCOME IN NUMBERS')");
		out.println("}");
		out.println("}");
		out.println("-->");
		out.println("</SCRIPT>");
		out.println("</head>");
		
		out.println("<body bgcolor=#fbfbf1>");
		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=fmgkfg border=0><TBODY>");
		out.println("<TR bgColor=hdhsfg>");
		out.println("<TD bgColor=gold><font size=6 color=black><center><marquee behavior=alternate>SIGN UP PAGE</center></font> </maquee>");
		out.println("</TD></TR></TBODY></TABLE>");
		out.println("<HR SIZE='3' COLOR='red'>");
		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=#nfdj454 border=0><TBODY>");
		out.println("<TR bgColor=846584>");
		out.println("<TD bgColor=black><FONT face=Arial color=red size=4><B><marquee>Applicant's Personal Details</B></FONT></marquee>");
		out.println("<br>");
		out.println("</TD></TR></TBODY></TABLE>");
		out.println("</FONT></TD></TR></center></TBODY></TABLE>");
		out.println("<HR SIZE='3' COLOR='red'>");
		out.println("<form name='newform' action='http://localhost:8080/servlet/postsignup'>");
		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=red border=0><TBODY>");
		out.println("<TR bgColor=red>");
		out.println("<TD bgColor=#fbfbf1><FONT face=Arial color=blue size=4><B>Applicant's Personal Details :</B></FONT>");
		out.println("</TD></TR></font></TBODY></TABLE>");
		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=#fbfbf1 border=0><TBODY>");
		out.println("<TR>");
		out.println("<TD width='25%' rowSpan=2><FONT face=Arial size=2>Customer Name</FONT></TD>");
		out.println("<TD Align=left colspan=3><FONT face=Arial size=2><INPUT type=textbox name='cname' size='25'></FONT></TD><br>");
		out.println("</TR></TBODY></TABLE>");
		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=#fbfbf1 border=0><TBODY>");
		out.println("<TR><TD width='25%' rowSpan=2><FONT face=Arial size=2>Password</FONT></TD>");
		out.println("<TD Align=left colspan=3><FONT face=Arial size=2><INPUT type=password name='pass' size='20'>");
		out.println("</TD></TBODY></table>");
		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=#fbfbf1 border=0><TBODY>");
		out.println("<TR>");
		out.println("<TD width='25%' rowSpan=2><FONT face=Arial size=2>Sex ");
		out.println("<TD Align=top rowSpan=2><FONT face=Arial size=2>");
		out.println("<input type='radio' maxLength=25  name='cma' value='m' checked>MALE<INPUT TYPE='RADIO' MAXLENGTH=25 NAME='cma' VALUE='f'>FEMALE<BR></FONT>");
		out.println("</TD></TBODY></table>");
		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=#fbfbf1 border=0><TBODY>");
		out.println("<TR bgColor=#fbfbf1><TD bgColor=#fbfbf1><FONT face=Arial color=blue size=2><B>Applicant's Mailing Address :</B></FONT>"); 
		out.println("<TR bgColor=#fbfbf1>");
		out.println("<TD width='25%'><FONT face=Arial size=2>Contact Address </FONT></TD>");
		out.println("<TD width='25%'><FONT face=Arial size=2>Pincode </FONT></TD>");
		out.println("<TD width='25%' height=2><FONT face=Arial size=2>City</FONT> </TD>");
		out.println("<TD width='25%' height=2><FONT face=Arial size=2>Landmarks</FONT>"); 
		out.println("</TD></TR>");
		out.println("<TR bgColor=#fbfbf1><TD width='25%' height=2><FONT face=Arial size=2><input type=textbox name='add' size='20'></FONT> </TD>");
		out.println("<TD width='25%' height=2><FONT face=Arial size=2><INPUT type=textbox name='pin1' size='6'></FONT> </TD>");
		out.println("<TD width='25%' height=2><SELECT size=1 name='city'>");
		out.println("<OPTION value=Select Option selected>--Select City--</OPTION> ");
		out.println("<OPTION value=Ahmedabad>Ahmedabad</OPTION>");
                out.println("<OPTION value=Aurangabad>Aurangabad</OPTION>");
		out.println("<OPTION value=Bangalore>Bangalore</OPTION>");
                out.println("<OPTION value=Baroda>Baroda</OPTION>");
		out.println("<OPTION value=Calcutta>Calcutta</OPTION> ");
		out.println("<OPTION value=Chandigadh>Chandigadh</OPTION>");
		out.println("<OPTION value=Chennai>Chennai</OPTION>");
		out.println("<OPTION value=Delhi>Delhi</OPTION>"); 
		out.println("<OPTION value=Goa>Goa</OPTION>");
		out.println(" <OPTION value=Hyderabad>Hyderabad</OPTION> ");
		out.println("<OPTION value=Jaipur>Jaipur</OPTION> ");
		out.println("<OPTION value=Ludhiyana>Ludhiyana</OPTION>");
		out.println("<OPTION value=Mangalore>Mangalore</OPTION>"); 
		out.println("<OPTION value=Mumbai>Mumbai</OPTION> ");
		out.println("<OPTION value=Nagpur>Nagpur</OPTION>"); 
		out.println("<OPTION value=Nasik>Nasik</OPTION>"); 
		out.println("<OPTION value=Others>others</OPTION>");
		out.println("</SELECT> </TD>");      
		out.println("<TD width='25%' height=2><FONT face=Arial size=2><INPUT type=textbox name='land' size='20'></FONT>");
		out.println("</TD></TR></TBODY></TABLE>");
		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=#fbfbf1 border=0>");
		out.println("<TBODY>");
		out.println("<TR bgColor=#fbfbf1><TD width='25%' height=4><FONT face=Arial size=2>E-Mail Address</FONT></TD>");          
		out.println("<TD height=4><FONT face=Arial size=1>&nbsp;</FONT><FONT face=Arial size=1></FONT> </TD></TR>");
		out.println("<TR bgColor=#fbfbf1><TD width='25%' height=2><FONT face=Arial size=2><INPUT type=textbox name='email' size='20'></FONT> </TD>");
		out.println("<TD vAlign=top height=2><FONT face=Arial size=2>&nbsp;</FONT>"); 
		out.println("</TD></TR></TBODY></TABLE>");
		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=#fbfbf1 border=0><TBODY>");
		out.println("<TR bgColor=#fbfbf1>");
		out.println("<TD bgColor=#fbfbf1><FONT face=Arial color=blue size=2><B>Applicant's Telephone :</B></FONT>");
		out.println("</TD></TR></TBODY></TABLE>");
		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=#fbfbf1 border=0><TBODY>");
		out.println("<TR bgColor=#fbfbf1>");
                out.println("<TD width='25%' height=4><FONT face=Arial size=2>Residence</FONT></TD>");
                out.println("<TD width='26%' height=4><FONT face=Arial size=2>Office</FONT></TD>");
                out.println("<TD height=4><FONT face=Arial size=1>&nbsp;</FONT><FONT face=Arial size=1></FONT> </TD></TR>");
                out.println("<TR bgColor=#fbfbf1>");
                out.println("<TD width='25%' height=2><FONT face=Arial size=2><INPUT type=textbox name='res' size='8'></FONT> </TD>");
                out.println("<TD width='26%' height=2><FONT face=Arial size=2><INPUT type=textbox name='off' size='8'></FONT> </TD>");
                out.println("<TD vAlign=top height=2><FONT face=Arial size=2>&nbsp;</FONT>"); 
                out.println("</TD></TR></TBODY></TABLE>");
		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=#fbfbf1 border=0><TBODY>");
		out.println("<TR><TD width='25%' rowSpan=2><FONT face=Arialsize=2>Profession</FONT></TD>");
		out.println("<TD Align=left colspan=3><SELECT size=1 name='proff'>"); 
		out.println("<OPTION value='Select Option' selected>Select Option</OPTION>"); 
		out.println("<OPTION value=CA>CA</OPTION>");
                out.println("<OPTION value=Consultant>Consultant</OPTION>");
                out.println("<OPTION value=Teacher>Teacher</OPTION>");
                out.println("<OPTION value=Doctor>Doctor</OPTION>");
                out.println("<OPTION value=Engineer>Engineer</OPTION>");
                out.println("<OPTION value=Banker>Banker</OPTION>"); 
		out.println("<OPTION value=Journalist>Journalist</OPTION>"); 
		out.println("<OPTION value=Lawyer>Lawyer</OPTION>"); 
                out.println("<OPTION value=Trader>Trader</OPTION>"); 
                out.println("<OPTION value=Student>Student</OPTION>");
                out.println("<OPTION value=Others>Others</OPTION>");
                out.println("</SELECT> </TD>");
  		out.println("</TR></TBODY></TABLE>");
  		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=#fbfbf1 border=0><TBODY>");
		out.println("<TR bgColor=#fbfbf1>");
		out.println("<TD bgColor=#fbfbf1><FONT face=Arial color=blue size=2><B>Applicant's income Details :</B></FONT> ");
		out.println("</TD></TR></TBODY></TABLE>");
		out.println("<TABLE cellSpacing=0 cellPadding=0 width='100%' bgColor=#fbfbf1 border=0><TBODY>");
		out.println("<TR bgColor=#fbfbf1>");
		out.println("<TD width='25%' height=4><FONT face=Arial size=2>Income</FONT></TD>");
		out.println("<TR bgColor=#fbfbf1>");
	   	out.println("<TD width='26%' height=2><FONT face=Arial size=2><INPUT type=textbox name='cnum' size='20'></FONT></TD>");
		out.println("<TD vAlign=top height=2><FONT face=Arial size=2>&nbsp;</FONT> ");
		out.println("</TD></TR></TBODY></TABLE>");
		out.println("<center><br>");
		out.println("<input type=submit value='Submit' onmouseup=validate()>");
		out.println("<input type=reset value='Reset'>");
		out.println("</center><br>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
	public void destroy()
	  {
  	  }
}