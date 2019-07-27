import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class cardmiss1 extends HttpServlet
{
	 PrintWriter pw;
	 Connection con;
	 Statement st;
 	 ResultSet r;	
	 String s1,s2,s3,s4;
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
			s3=request.getParameter("cno");
                        int s31=Integer.parseInt(s3);
			s4=request.getParameter("sno"); 
                        int s41=Integer.parseInt(s4);
                        s31=s31+3;
                        s41=s41+3;
                        st.executeUpdate("insert into mcard values("+s31+","+s41+")");
                        pw.println("<body bgcolor='#fbfbf1'>");
                        pw.println("<center>");
                        pw.println("<br><br><br><br><b>Missed card details are stored</b>");
                        pw.println("<br><br><br><br><a href='http://localhost:8080/servlet/selectoption'>BACK</a>");
                        pw.println("</center>");
                        //pw.println("<center>");
                        
                       
		}	
                catch(Exception e)
		{
			pw.println(e);
                }
	}
}