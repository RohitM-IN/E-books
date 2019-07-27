import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Date;
import java.util.Date;
public class statement extends HttpServlet
{
	 PrintWriter out;
	 Connection con;
         Statement st,st1;
	 String s1,s3,s5,nname;
	 int c1,s2,s4;
	 HttpSession hs;
	 ResultSet rs,rs1;
	public  void doGet(HttpServletRequest request,HttpServletResponse response)
			 throws ServletException,IOException
	{	
		 try
	                 {
                 			 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		                     con=DriverManager.getConnection("jdbc:odbc:bm");
		                     st=con.createStatement();
                                     st1=con.createStatement();
                 		}
		catch(Exception e)
		 {
			out.println("DSN ERROR"+e);
		 }	
		try
		{
			response.setContentType("text/html");			
			PrintWriter out=response.getWriter();
			hs=request.getSession(true);
			String nname=(String)hs.getValue("name");
			s1=request.getParameter("cno");
			c1=Integer.parseInt(s1);
			rs=st.executeQuery("select cardno,cardname,cardtype,bankname from card");
                        rs1=st1.executeQuery("select cardno from mcard");
			Date date=new Date();
			int temp=0,temp1=0;
                        while(rs1.next())
                         {
                          int s11=rs1.getInt(1);
                          if(c1==(s11-3)) 
                           {
                            out.println("<html>");
			    out.println("<center><body bgcolor='#fbfbf1'><center><br><br><br>");
		            out.println("<h3>This Credit Card Was blocked</h3></body></center>");
		            out.println("<br><br>For further information contact us in the following address<br>");
   		            out.println("<br>Hindustan Software Limited<br>");
                            out.println("No.120 Wallajah Road,<br>");
                            out.println("Triplicane, Chennai-2");
                            out.println("<br><br><a href='http://localhost:8080/servlet/selectoption'><h4>BACK</h4></a></center>");
                            temp1=1; 
                           }
                        }  
                      if(temp1!=1)
                       {          
			while(rs.next())
			{
				  s2=rs.getInt("cardno");
		                  s3=rs.getString("cardname");
  				  s4=rs.getInt("cardtype");	
				  s5=rs.getString("bankname");
                                 			 
				 if (c1==(s2-3))
				  {
					   out.println("<body bgcolor='#fbfbf1'>");
					   out.println("<center>");
					   out.println("<TABLE WIDTH='440' HEIGHT='250' BGCOLOR='yellow	'>");
				           out.println("<TR>");
				           out.println("<TD WIDTH='440' HEIGHT='250' BGCOLOR='iceblue'>");
				           out.println("<font color='red'><Big><marquee>SATEMENT DETAILS</Big></marquee></font><hr>");
					   out.println("<br>");		
					   out.println("The Statement Date:  "+date+""); 
					   out.println("<br>");		
					   out.println("The Card Holder Name:"+nname+"");	
                  			   out.println("<br>");			
		   			   out.println("The Card NO:         "+c1+"");
		   			   out.println("<br>");			
					   out.println("The cardname:        "+s3+"");
					   out.println("<br>");			
	          			   out.println("The cardLimit:       "+s4+"");	
					   out.println("<br>");			
					   out.println("The bankname:        "+s5+"");	
   					   out.println("</TD>");
			        	   out.println("</TR>");
			                   out.println("</TABLE><br><br>");
					   out.println("<a href='http://localhost:8080/servlet/selectoption'>SELECTION</a>");	
			                   temp=temp+1; 	
		     	  	}
						
	                		}
			if (temp==0)
			{
				       out.println("<body bgcolor=#fbfbf1>");		
			               out.println("<center><b>The Card no is incorrect");
				       out.println("<a href='http://localhost:8080/servlet/state'>Previous</a></b></center>");
				       out.println("</body>");	  	 
			}
                    }	
		}			
		catch(Exception e)
		{
			out.println(e);
		}
	}
}