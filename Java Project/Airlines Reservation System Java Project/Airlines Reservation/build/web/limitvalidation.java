import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class limitvalidation extends HttpServlet
{
	 PrintWriter pw;
	 Connection con;
         Statement st;
	 ResultSet r;	
	 int c1,c2,c3,c4,check;
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
			int c3=Integer.parseInt(s3);
			s4=request.getParameter("amt");
			int c4=Integer.parseInt(s4);
			ResultSet r=st.executeQuery("select cardno,cardtype from card");
			while(r.next())
			{
				  int s1=r.getInt("cardno");
		                  int s2=r.getInt("cardtype");
    				  if(c3==(s1-3) && s2<c4)  
				  {
				  	pw.println("<html><head><title>Limit Validation</title></head><body bgcolor='#fbfbf1'>");						
					pw.println("<br><br><br><br><center>YOUR CREDIT LIMIT EXCEED YOU CAN'T PROCEED<br><br>");
					pw.println("<a href='http://localhost:8080/servlet/selectoption'>Previous</a></center>");
					pw.println("</body></html>");
					check=1;
					break;							
			  	  }
				  else
				  	check=0;	
			}
			if(check==0)
			{
               			pw.println("<html><head><title>Limit Validation</title></head>");
				pw.println("<body bgcolor='#fbfbf1'>");
				
					  pw.println("<center><br><br><br><br><br>");
	         			  pw.println("CARD LIMIT IS WITH IN PURCHAING LIMIT");
					  pw.println("<br>");
					  pw.println("YOU TO PICK ALL THE PURCHASING PRODUCTS");
					  pw.println("<br><br><br><br><br>");
					  pw.println("<a href='http://localhost:8080/servlet/balance'>Balance Transfer</a>");
					  pw.println("</center>");
					  pw.println("</body>");
					  pw.println("</html>");		
				}
		  }
		  catch(Exception e)
		  {
				pw.println(e);
		  }
	}
}