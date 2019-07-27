import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class best_card extends HttpServlet
{
	 public void doGet(HttpServletRequest re,HttpServletResponse rs)
			 throws ServletException,IOException
	 {
	 	rs.setContentType("text/html");
		PrintWriter out=rs.getWriter();
		out.println("<html>");
		out.println("<head><title>Cyber Credit Card System</title></head>");
		out.println("<body bgcolor=#efefe0>");
		out.println("<marquee align=center bgcolor=#ded7bd direction=left behavior=slide>");
		out.println("<font face='Times new roman' size=5 color=#990000> <B>");
		out.println("CYBER CREDIT CARD SYSTEM</font>");
		out.println("</marquee><br>");
		out.println("<a name=#top>");
		out.println("<h3 align=center><font face=Times new roman color=navy>Chosse The Best Card</font></h3>");
		out.println("<b>");
		out.println("<font face=Times new roman size=4 color=#336699>Acceptability</font><br>");
		out.println("<p>This determines how widely is the card accepted. It depends on the network and the affiliation. For instance, Visa and Master Cards are more widely accepted than Diners or American Express. Also, a global card scores higher on acceptability than a domestic one.</p>");

		out.println("<font face=Times new roman size=4 color=#336699>Eligibility</font><br>");
		out.println("<p>All cards have basic minimum income criterion for issuing cards. This ranges from Rs 60,000 p.a. for Cancard and Stanchart-Classic to Rs 200,000 p.a. for Amex-Gold and BoI Gold cards.</p>");

		out.println("<font face=Times new roman size=4 color=#336699>Fees</font><br>");
		out.println("<p>One of the most important factors, the fees include joining fees, annual subscription and fees for add on cards. All these fees are billed in the first bill and are not charged upfront.</p>");

		out.println("<font face=Times new roman size=4 color=#336699>Other Charges</font><br>");
		out.println("<p>Its always better to pay on time. Otherwise you pay charges for late payment. These are ");
		out.println("only in case you do not pay the minimum required amount. Late payment charges range ");
		out.println("from 2.5% of outstanding to 15% of minimum payment.</p>");

		out.println("<font face=Times new roman size=4 color=#336699>Credit period</font><br>");
		out.println("<p>That's what its all about! Buy now pay later. Most cards have different credit periods ranging from 30 days to 50 days. That is the length of the billing cycle. This implies that the bill comes to you every nth day where n is the credit period. Also, credit covers finance charges. Most cards carry heavy credit charges ranging from 2.5% per month to 3% p.m.- works out to 34% and 42% p.a. respectively. There is a minimum payment required by most cards - from 5% of total value of the bill to 20%.</p>");

		out.println("<font face=Times new roman size=4 color=#336699>Cash Advance</font><br>");
		out.println("<p>You can also borrow money from the card, but obviously pay interest charges on that. You also have to pay cash withdrawal charges - generally 2.5% of the amount withdrawn. Interest is also charged on the amount withdrawn - again around 2.5% p.m. Every card has a limit for the amount withdrawn - some cards have an absolute limit like Rs10,000 p.m. while most cards have a cash withdrawal limit as a %age of total credit limit.</p>");

		out.println("<font face=Times new roman size=4 color=#336699>Insurance Cover</font><br>");
		out.println("<p>Insurance cover on cards is available only in the case of an accident. The limits are higher for air accidents than for other types.</p>");
		out.println("<a href=#top>TOP</a>");
		out.println("<a href='http://localhost:8080/servlet/homepage'><img align=right src='d:/student/madhav/project/home3.gif'></a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
  	 }
}