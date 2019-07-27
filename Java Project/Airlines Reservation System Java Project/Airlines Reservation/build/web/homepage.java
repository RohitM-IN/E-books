import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class homepage extends HttpServlet
{
	 public void doGet(HttpServletRequest re,HttpServletResponse rs)
			 throws ServletException,IOException
	 {
	 	rs.setContentType("text/html");
		PrintWriter out=rs.getWriter();
		out.println("<html>");
		out.println("<head><title>cyber credit card system</title>");
		out.println("</head>");
		out.println("<style>");
		out.println("input{font-size:13pt;font-family:Times new roman;color:#990000;font-style:bold;}");
		out.println("table{font-size:12pt;color:#eeeeee;font-style:bold}");
		out.println("</style>");
		out.println("<body alink=navy vlink=#0099cc bgcolor=#fbfbf1>");
		out.println("<hr size=5 color=#336699>");
		out.println("<!--marquee bgcolor=#fbfbf1 #ded7bd #a41c2b #efefe0 #901010 #eb922c #d6cfb1#ffffff #0099cc #336699 #efefdf #dbcfe5 #dbefc1direction =right behavior=alternate-->");
		out.println("<marquee bgcolor=#ded7bd direction =right behavior=alternate>");
		out.println("<font face='Times new roman' size=5 color=#990000> <B>");
		out.println("CYBER CREDIT CARD SYSTEM</font>");
		out.println("</marquee>");
		out.println("<hr size=5 color=#336699>");
		out.println("<form name='form1' target='_top' method=get action='http://localhost:8080/servlet/Login'>");
		out.println("<table>");
		out.println("<tr><td><img src='d:/student/madhav/project/adv.gif'></td></tr></table>");
		out.println("<table align=right width=40% height=44% cellspacing=10 bgcolor=#336699>");
		out.println("<tr><td colspan=2 bgcolor=#fbfbf1 align='middle'><font color=#336699><b>Existing CCS Users !!</font></td></tr>");
		out.println("   <tr><td><b>Login Id</td>");
		out.println("   <td><input type=textbox name='cname' size =15></td></tr>");
		out.println("   <tr><td><b>Password</td>");
		out.println("   <td><input type=password name='pass' size=15></td></tr>");
		out.println("<tr><td colspan=2><center><b>");
		out.println("<input type='submit' value='Sign-In'></td></tr>");
		out.println("</table></form>");
		out.println("<br><br><br><br><br><br><br>");
		out.println("<img src='d:/student/madhav/project/card1[1].jpg' alt='Internet world' align=right><br>");
		out.println("<img src='d:/student/madhav/project/card1[1].jpg' alt='Internet world' align=right><br>");
		out.println("<img src='d:/student/madhav/project/card1[1].jpg' alt='Internet world' align=right><br><br><br>");
		out.println("<table align=center width=35% height=20%><tr><td>");
		out.println("<font color=maroon size=4>New User</font></td><td align=middle>");
		out.println("<a href='http://localhost:8080/servlet/pick_card' target='_top'><b>Sign-Up</a></td><td><img src='d:/student/madhav/project/hand_left.gif'></td></table>");
		out.println("</body>");
		out.println("</html>");
		out.close();
  	 }
}