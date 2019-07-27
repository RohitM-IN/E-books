import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class subholdsignup extends HttpServlet
{
	 PrintWriter pw;
	 Connection con;
       Statement st;
	 String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s21;
	 int code,ph1,ph2,cn,sn,check;
	 public void doGet(HttpServletRequest request,HttpServletResponse response)
			 throws ServletException,IOException
	 {
		 try
             {
              	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                      con=DriverManager.getConnection("jdbc:odbc:bm");
                      st=con.createStatement();
             }
		 catch(Exception e)
		 {
			pw.println("DSN ERROR"+e);
		 }	
		try
		{

			response.setContentType("text/html");			
			PrintWriter out=response.getWriter();
			s2=request.getParameter("cname");
			ResultSet r=st.executeQuery("select subname from subhold");
			while(r.next())
                  {
    	       		String na=r.getString("subname");
	            	if(na.equals(s2))
                           {
					 out.println("<html><head><title>Subholder Validation</title></head>");
					 out.println("<body bgcolor='#fbfbf1'>");	
					 out.println("<center><b>The Subholder Already Exists ,Please type another Subholder name</b><br><br>");
					 out.println("<br><br><a href='http://localhost:8080/servlet/subhold'>Previous<a></center><br><br>");
					 out.println("<br><img align=center src='d:/student/madhav/project/butterflies.gif'><br>"); 					
					 out.println("</body></html>");	
 		                	 check=1;
                               		 break; 
                           }
                        else 
					 check=0;
			}
			if(check==0)
			{
				s1=request.getParameter("rel");
				//s2=request.getParameter("cname");
				s3=request.getParameter("pass");
				s4=request.getParameter("cma");
				s5=request.getParameter("email");
				s6=request.getParameter("age");
				ph1=Integer.parseInt(s6);
				st.executeUpdate("insert into subhold values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+ph1+"')");
				out.println("<body bgcolor='#fbfbf1'>");	
				out.println("<center>");
				out.println("<br><br>");	
				out.println("<font color='red' size='5'>SUBHOLDER DETAILS ARE STORED</font><br>");
				out.println("<br><br>");
				//out.println("CLICK LOGIN FOR FUTHER PROCESS");
				out.println("<br><br>");
				out.println("<a href='http://localhost:8080/servlet/selectoption'>BACK</a><br><br>");
				out.println("<br><img align=center src='d:/student/madhav/project/butterflies.gif'><br>"); 								
				out.println("</center>");
				out.println("</body>");	
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}			

			
