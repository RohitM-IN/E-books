import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class oldaccount1 extends HttpServlet
{
	 PrintWriter pw;
	 Connection con;
         Statement st;
	 ResultSet r;	
	 String  s3,s4;
	 int c1,s1,temp;   
  	public void doGet(HttpServletRequest request,HttpServletResponse response)
			 throws ServletException,IOException
	{
		 try
             {
		 	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		      con=DriverManager.getConnection("jdbc:odbc:bm");
		      st=con.createStatement();
    			response.setContentType("text/html");			
			pw=response.getWriter();   	
		 }
		 catch (Exception e)
	 	 {
		 	pw.println("DSN ERROR"+e);
             }	
		 try
             {		
		 	s3=request.getParameter("nno");
			c1=Integer.parseInt(s3);
			s4=request.getParameter("cname");
			r=st.executeQuery("select accno,bname from oldaccount");
			//temp=0;
			while(r.next())
			{
				 s1=r.getInt(1);
		             String s2=r.getString(2);
		             if (c1==s1 & s4.equalsIgnoreCase(s2))
			  	 {
				 	/*pw.println("<body bgcolor='#fbfbf1'>");
					pw.println("<center><b>Your accountno & Bank Name are valid");
					pw.println("<br><br><br>");*/
					temp=temp+1;
                                        response.sendRedirect("http://localhost:8080/servlet/selectoption2"); 
					break;	 	
         	          	 }
				else
					temp=0;
				
			}
			if (temp==0)
			{
				pw.println("<body bgcolor='#fbfbf1'>");			
				pw.println("<center><b>please enter the correct account no and holder Name<br><br>");
				pw.println("<a href='http://localhost:8080/servlet/oldaccount'>Previous</a></b></center><br>");
				pw.println("<br><img align=left src='d:/student/madhav/project/butterflies.gif'><br>");
				pw.println("</body>");
			}
		 }	
		 catch(Exception e)
		 {
		 	pw.println(e);
		 }
	}
}