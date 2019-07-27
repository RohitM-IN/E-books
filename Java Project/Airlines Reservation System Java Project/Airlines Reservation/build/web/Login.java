import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class Login extends HttpServlet
{
	 PrintWriter pw;
	 Connection con;
                   Statement st;
	 ResultSet r;	
	 HttpSession hs;	
	 String s1,s2,s3,s4,s33,s44;
	 String send1="http://localhost:8080/servlet/oldaccountcheck1";
	 String send2="http://localhost:8080/servlet/invalid11";   
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
			HttpSession hs=request.getSession(true);
			s3=request.getParameter("cname");
 			hs.putValue("name",s3);
			s4=request.getParameter("pass");
			ResultSet r=st.executeQuery("select name,password from signup");
			while(r.next())
			{
				  String s1=r.getString(1);
		             		  String s2=r.getString(2);
				if (s3.equals (s1) && s4.equals (s2))
				{
					response.sendRedirect(send1);
                	  			}
		                }
		      ResultSet p=st.executeQuery("select subname,password from subhold");
			s33=request.getParameter("cname");
			hs.putValue("name",s33);
			s44=request.getParameter("pass");
			while(p.next())
			{
				  String s11=p.getString(1);
		             		  String s22=p.getString(2);
				if (s33.equals (s11) && s44.equals (s22))
				{
					response.sendRedirect(send1);
                	  			}
		                }
		                response.sendRedirect(send2);
	
		}			
		catch(Exception e)
		{
			pw.println(e);
		}
	}
}
