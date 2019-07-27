import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class postsignup extends HttpServlet
{
	 PrintWriter pw;
	 Connection con;
	 HttpSession hs;		
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
		 	hs=request.getSession(true);
                        response.setContentType("text/html");			
			PrintWriter out=response.getWriter();
			s1=request.getParameter("cname");
                        hs.putValue("uname",s1); 
			ResultSet r=st.executeQuery("select name from signup");
			while(r.next())
                        {
    	       			String na=r.getString("name");
	            		if(na.equals(s1))
                           	{
					 out.println("<html><head><title>User Validation</title></head>");
					 out.println("<body bgcolor='#fbfbf1'>");
					 out.println("<form name='form1'>");
					 out.println("<br><br><br><br><br><center><img align=left src='d:/student/madhav/project/rose1.gif'>");		
					 out.println("<b>The User Already Exists ,Please type another Customer name</b>");
					 out.println("<img align=right src='d:/student/madhav/project/rose1.gif'><br><br>");
					 out.println("<a href='http://localhost:8080/servlet/sign'>Previous<a></center>");					
					 out.println("</form></body></html>");	
 		                	 check=1;
                               		 break; 
                           	}
                        	else 
					 check=0;
			}
			if(check==0)
			{

				//s1=request.getParameter("cname");
				s2=request.getParameter("pass");
				s21=request.getParameter("cma");
				s3=request.getParameter("add");
                                hs.putValue("uaddress",s3);
				s4=request.getParameter("pin1");
				code=Integer.parseInt(s4);
				s5=request.getParameter("city");
				s6=request.getParameter("land");
				s7=request.getParameter("email");
				s8=request.getParameter("res");
                                hs.putValue("uphone",s8);
				ph1=Integer.parseInt(s8);
				s9=request.getParameter("off");
				ph2=Integer.parseInt(s9);
				s10=request.getParameter("proff");
				s12=request.getParameter("cnum");
				cn=Integer.parseInt(s12);
				st.executeUpdate("insert into signup values('"+s1+"','"+s2+"','"+s21+"','"+s3+"','"+code+"','"+s5+"','"+s6+"','"+s7+"','"+ph1+"','"+ph2+"','"+s10+"','"+cn+"')");
				out.println("<body bgcolor='#fbfbf1'>");	
				out.println("<form name='form1' method='Post'>");
				out.println("<br><br>");
				out.println("<center><br><br>");
				out.println("<img align=left src='d:/student/madhav/project/rose1.gif'>");		
				out.println("<br><br><font color='maroon' size='6'><b>YOUR DETAILS ARE STORED<b></font><br>");
				out.println("<img align=right src='d:/student/madhav/project/rose1.gif'>");
				out.println("<br><br>");
				/*out.println("To use your card to family members click SUBHOLD");
				out.println("<br><br>");
				out.println("TO Enter Your Account Details click ACCOUNTS");	
				out.println("<br><br>");
				out.println("<a href='http://localhost:8080/servlet/subhold'>SUBHOLD</a><br><br>");*/	
				out.println("&nbsp;&nbsp;&nbsp;&nbsp;<a href='http://localhost:8080/servlet/accounts'>Proceed Further</a>");
				out.println("<br><br>");
				out.println("</center>");
				out.println("</form></body>");	
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			
	}
}