import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.Date;
public class cardselection extends HttpServlet
{
	 PrintWriter pw;
	 Connection con;
	 Statement st,st1;
	 String s1,s2,s3,s4,s5,s6,s11;
	 int sn,sn1,cn,cn1;
	 HttpSession hs;
	 ResultSet rs;	
	 public  void doGet(HttpServletRequest request,HttpServletResponse response)
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
			hs=request.getSession(true);
			String nname=(String)hs.getValue("uname");
			rs=st.executeQuery("select max(cardno),max(sno) from card");
			while(rs.next())
			{
				s1=rs.getString(1);
				s2=rs.getString(2);
			}
			cn=Integer.parseInt(s1);
			cn1=cn+1;
			sn=Integer.parseInt(s2);
			sn1=sn+1;				
			Date date=new Date();
			s3=request.getParameter("name");
			s4=request.getParameter("type");
			s5=request.getParameter("day");
			st.executeUpdate("insert into card values("+cn1+","+sn1+",'"+s3+"','"+s4+"','"+s5+"')");
			out.println("<BODY bgcolor='#fbfbf1'>");
			out.println("<br><br>");
			out.println("<div align='center'>");
			out.println("<hr>");
			out.println("<font size='6' color='red'><marquee behavior='alternate'>SELECTION DETAILS</marquee>");
			out.println("<hr>");
			out.println("<table border=2 color='blue'><tr><th>HOLDER NAME</th><th>CARD NUMBER</th><th>SECURITY NUMBER</th><th>CARD TYPE AMOUNT</th>");				
			out.println("<tr>");
                        int cn2=cn1-3;
                        int sn2=sn1-3;  
			out.println("<td>"+nname+"</td>");
			out.println("<td>"+cn2+"</td>");
			out.println("<td>"+sn2+"</td>");
			out.println("<td>"+s4+"</td>");
			out.println("</tr>");
			out.println("</font>");
			out.println("</div>");	
			out.println("</body>");
			out.println("</table>");
			out.println("<br><br>");
			out.println("YOUR CARD PICKUP DATE:");
			out.println(date);
			out.println("<br><br>");
			out.println("<a href='http://localhost:8080/servlet/homepage'>Login</a>");
			out.println("<br><br>");
			/*out.println("<a href='http://localhost:8080/servlet/limit'>PURCHASE LIMIT</a>");	
			out.println("<br><br>");
			out.println("<a href='http://localhost:8080/servlet/state'>STATEMENT</a>");*/	
			out.close();	
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
	 }
}
