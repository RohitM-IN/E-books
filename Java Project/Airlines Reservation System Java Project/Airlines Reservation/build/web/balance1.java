import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class balance1 extends HttpServlet
{
	 PrintWriter pw;
	 Connection con;
         Statement st,st1,st2;
	 ResultSet r,r1;	
	 String s3,s4,s33;
	 int c1,c2,s1,s2,s5,s55,s11,c11,s22,temp=0;	
	 public void doGet(HttpServletRequest request,HttpServletResponse response)
			 throws ServletException,IOException
	{
		 try
                 {
		 	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		        con=DriverManager.getConnection("jdbc:odbc:bm");
		        st=con.createStatement();
                        st1=con.createStatement();
                        st2=con.createStatement();
                        response.setContentType("text/html");			
			pw=response.getWriter();	
   	        }
		catch (Exception e)
	 	{
			pw.println("DSN ERROR"+e);
            	}	
		try
                {		
			s33=request.getParameter("crno");
			c11=Integer.parseInt(s33);
			s3=request.getParameter("nno");
			c1=Integer.parseInt(s3);
			s4=request.getParameter("amt");
			c2=Integer.parseInt(s4);	
			r=st.executeQuery("select cardno,cardtype from card");
			while(r.next())
			{
				 s1=r.getInt(1);
                                 s2=r.getInt(2);
				 if ( c11==(s1-3) & s2>c2 & s2>500)
				 {
					r1=st.executeQuery("select accountno,amount from account");
					while(r1.next())
					{
						s11=r1.getInt(1);
						s22=r1.getInt(2);
						if(c1==s11 & s2>c2)
						{
							s5=c2+s22;
							pw.println("<body bgcolor='#fbfbf1'>");
							pw.println("<center><b>Amount is added to Shop account");
							pw.println("<br>");
							pw.println("The Total Amount in Shop account:</b>"+s5);
							pw.println("<br><br><br>");
							st1.executeUpdate("update account set amount="+s5+" where accountno="+s11);
							break;
						}
					}
	                                s55=s2-c2;		
					pw.println("<center><b>Amount is Decreased to Your Card");
					pw.println("<br>");
					pw.println(" Now, The Total Amount in Your Card:</b>"+s55);
					pw.println("<br><br><br>");
					pw.println("<a href='http://localhost:8080/servlet/selectoption'>SELECTION</a></center>");		
	                                st2.executeUpdate("update card set cardtype="+s55+" where cardno="+s1);
					temp=temp+1;
					break;
                        	}
				else
			 	 	temp=0;
								
			}
			if (temp==0)
			{
				pw.println("<html><head><title>Card Number,Amount Validation</title></head>");
				pw.println("<body bgcolor='#fbfbf1'>");			
				pw.println("<center><b>Please check your CARD number and Amount<br><br>");
				pw.println("<a href='http://localhost:8080/servlet/balance'>Previous</a></b></center>");
				pw.println("</body></html>");
			}
					
		}	
		catch(Exception e)
		{
			pw.println("hai"+e);
		}
	}
}