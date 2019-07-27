import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class oldaccountcheck extends HttpServlet
{
	 PrintWriter pw;
	 Connection con;
         Statement st;
         Statement st1;
	 ResultSet r,r1;	
	 String  s3,s4;
	 int c1,s1;  
  	public void doGet(HttpServletRequest request,HttpServletResponse response)
			 throws ServletException,IOException
	{
		 try
             {
		 	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		      con=DriverManager.getConnection("jdbc:odbc:bm");
		      st=con.createStatement();
                      st1=con.createStatement();
    			response.setContentType("text/html");			
			pw=response.getWriter();   	
		 }
		 catch (Exception e)
	 	 {
		 	pw.println("DSN ERROR"+e);
             }	
		 try
             {		int temp=0,temp1=0;
		 	s3=request.getParameter("nno");
			c1=Integer.parseInt(s3);
			s4=request.getParameter("cname");
			r=st.executeQuery("select accountno,bankname from nbserver");
                        r1=st1.executeQuery("select accno,bname from oldaccount");
			//temp=0;
			while(r.next())
			{
			     s1=r.getInt(1);
	 	             String s2=r.getString(2);
                             if ((c1==s1 & s4.equalsIgnoreCase(s2)))
			  	 {
				 	temp=1;
					break;	 	
         	          	 }
				else
					temp=0;
				
			}
                       while(r1.next())
			{
			     int s11=r1.getInt(1);
                             String s22=r1.getString(2);                         
 		             if ((c1==s11 & s4.equals(s22)))
			  	 {
					temp1=1;
					break;	 	
         	          	 }
				else
					temp1=0;
				
			}
			if (temp==0 & temp1==0)
			{
				pw.println("<body bgcolor='#fbfbf1'>");			
				pw.println("<center><b>please enter the correct account no and holder Name<br><br>");
				pw.println("<a href='http://localhost:8080/servlet/oldaccountcheck1'>Previous</a></b></center><br>");
				pw.println("<br><img align=left src='d:/student/madhav/project/butterflies.gif'><br>");
				pw.println("</body>");
			}
                        else
                           response.sendRedirect("http://localhost:8080/servlet/selectoption");
		 }	
		 catch(Exception e)
		 {
		 	pw.println(e);
		 }
	}
}