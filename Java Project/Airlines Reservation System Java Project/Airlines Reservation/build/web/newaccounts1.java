import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class newaccounts1 extends HttpServlet
{
	 PrintWriter pw;
	 Connection con;
         Statement st;
	 String s1,s2,s3,s4,s5,s6,s7,uname,uaddress,uphone1;
	 int amount,pp,cn,cn1,uphone;
	 HttpSession hs;
         int temp=0;
	 ResultSet rs,p;
	public  void doGet(HttpServletRequest request,HttpServletResponse response)
		 throws ServletException,IOException
         
	{
                     PrintWriter out=response.getWriter();
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
                        //hs=re.getSession(true);
			response.setContentType("text/html");			
			
			hs=request.getSession(true);
			uname=(String)hs.getValue("uname");
                        //out.println(uname);
                        uaddress=(String)hs.getValue("uaddress");
                        //out.println(uaddress);
                        uphone1=(String)hs.getValue("uphone");   
                        //out.println(uphone1);
                        uphone=Integer.parseInt(uphone1);
			/*s3=request.getParameter("cname");
			
                 p=st.executeQuery("select holdername from nbserver");
             
                        while(p.next())
			{
				String name=p.getString("holdername");
				if(name.equals(s3))
				{
					out.println("<html><head><title>Subholder Vlidation</title></head>");
					out.println("<body bgcolor='#fbfbf1'>");
					out.println("<center><b>The Holder Nmae Already Exists,Please type another Name</b><br><br>");
					out.println("<a href='http://localhost:8080/servlet/newaccounts'>Previous</a></center><br>");
					out.println("<br><img align=left src='d:/student/madhav/project/butterflies.gif'><br>");	
					out.println("</body></html>");
					temp=temp+1;
					break;
				}
				
				
			}*/
         //out.println("check1");
			if(temp==0)
			{			
				rs=st.executeQuery("select max(accountno) from nbserver");
				while(rs.next())
				{
					s1=rs.getString(1);
				}
				cn=Integer.parseInt(s1);
                                cn1=cn+1;	
				//s3=request.getParameter("cname");
				//s4=request.getParameter("add");
				//s5=request.getParameter("ph");
				//pp=Integer.parseInt(s5);
				s6=request.getParameter("day");
				s7=request.getParameter("amt");
				amount=Integer.parseInt(s7);	
                                //out.println("check2");		
				st.executeUpdate("insert into nbserver values('"+cn1+"','"+uname+"','"+uaddress+"','"+uphone+"','"+s6+"','"+amount+"')");
                         
				out.println("<BODY bgcolor='#fbfbf1'>");
				out.println("<br><br>");
				out.println("<div align='center'>");
				out.println("<hr>");
				out.println("<font size='6' color='red'><marquee behavior='alternate'>ACCOUNTS DETAILS</marquee>");
				out.println("<hr>");
				out.println("<br><br>");
				out.println("<table border=2 color='blue'><tr><th>HOLDER NAME</th><th>ACCOUNT NO</th><th>AMOUNT</th><th>BANKNAME</th>");				
				out.println("<tr>");
				out.println("<td>"+uname+"</td>");
				out.println("<td>"+cn1+"</td>");
				out.println("<td>"+amount+"</td>");
				out.println("<td>"+s6+"</td>");
                               //out.println("check3"); 
				out.println("</tr>");
				out.println("</font>");
				out.println("</table>");
				out.println("</body>");
				out.println("<br><br>");
				out.println("<a href='http://localhost:8080/servlet/selectoption2'>Clic here to Select Credit Card>></a>");				
				out.println("</div>");
				con.close();	
			}
                           else
                             temp=0;
                       
                       	
		}			
		catch(Exception e)
		{
			out.println(e);	
		}
	}
 }