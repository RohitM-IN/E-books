import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class cardvalid extends HttpServlet
{
	 PrintWriter pw;
	 Connection con;
	 Statement st,st1;
         int s31,s41;
	 ResultSet r,r1;	
	 String s1,s2,s3,s4;
	 String send1="http://localhost:8080/servlet/limit";
	 String send2="http://localhost:8080/servlet/invalid1";
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
                {	int temp=0;	
			s3=request.getParameter("cno");
                        s31=Integer.parseInt(s3);
			s4=request.getParameter("sno");
                        s41=Integer.parseInt(s4);
                        ResultSet r1=st1.executeQuery("select cardno,secno from mcard");
                        while(r1.next())
                        {
                          int s11=r1.getInt(1);
                          int s22=r1.getInt(2);
                          if(s31==(s11-3) && s41==(s22-3))
                           {
                            pw.println("<html>");
			    pw.println("<center><body bgcolor='#fbfbf1'><center><br><br><br>");
		            pw.println("<h3>This Credit Card Was blocked</h3></body></center>");
		            pw.println("<br><br>For further information contact us in the following address<br>");
   		            pw.println("<br>Hindustan Software Limited<br>");
                            pw.println("No.120 Wallajah Road,<br>");
                            pw.println("Triplicane, Chennai-2");
                            pw.println("<br><br><a href='http://localhost:8080/servlet/selectoption'><h4>BACK</h4></a></center>");
                            temp=1; 
                           }
                        }                                                  
                      if(temp!=1)
                       {
			ResultSet r=st.executeQuery("select cardno,sno from card");			
			while(r.next())
			{
				int s1=r.getInt(1);
		             	int s2=r.getInt(2);
				if ((s31+3)==s1 && (s41+3)==s2)
				{			
					response.sendRedirect(send1);
                		}	
	                }
			response.sendRedirect(send2);	
                       }
		}
                catch(Exception e)
		{
			pw.println(e);
                }
	}
}