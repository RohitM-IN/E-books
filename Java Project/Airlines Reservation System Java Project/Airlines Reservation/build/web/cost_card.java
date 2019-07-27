import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class cost_card extends HttpServlet
{
	 public void doGet(HttpServletRequest re,HttpServletResponse rs)
			 throws ServletException,IOException
	 {
	 	rs.setContentType("text/html");
		PrintWriter out=rs.getWriter();
		out.println("<html>");
		out.println("<head><title>Cyber Credit Card System</title></head>");
		out.println("<body bgcolor=silver>");
		out.println("<marquee align=center bgcolor=#ded7bd direction=left behavior=slide>");
		out.println("<font face='Times new roman' size=5 color=#990000> <B>");
		out.println("CYBER CREDIT CARD SYSTEM</font>");
		out.println("</marquee><br><b>");
		out.println("<a name=#top>");
		out.println("<h3 align=center><font face=Times new roman size=4 color=maroon>Cost Of The Cards</font></h3>");
		out.println("<font face=Times new roman size=4 color=navy>Putting The Genie Back In The Bottle:</font>");
		out.println("<p> For those who habitually treat their plastic card as the ever-obedient Genie to every command, ");
		out.println("taking in the details of the monthly bill is like seeing Cutsie transform into a Frankenstien's monster");
		out.println("instead.</p>");
		out.println("<font face=Times new roman size=4 color=navy>Renewal:</font>");
		out.println("<p>Check the time of the renewal of the card. Are you used to ignoring the credit card issuer's ");
		out.println("flood of literature or the details of billing. Often, the card issuer or bank will slip in renewal fees");
		out.println("and even an unsolicited upgrade of class of card (say, classic to premium that means higher annual ");
		out.println("fees) with a mild notice: If you don't say `No', its taken as a 'Yes'.</p>");

		out.println("<font face=Times new roman size=4 color=navy>Interest-Free Period On Every Bill:</font>");
		out.println("<p>Not if you have roll over credit. You did take a card not just for convenience. The facility");
		out.println(" of being able to pay back in bits is very appealing, especially since the interest rates is, say, 2.5 ");
		out.println("to 3% a month. Did you ever sit down and do some sums to see why the outstanding amount is");
		out.println(" mounting like crazy? First, the 2.5% averages 30% a year. Next, the outstanding you acquire in the");
		out.println(" first month has to be cleared in subsequent bills before your fresh purchases can be paid for. Here");
		out.println(" is how it works. Assuming you have a bill of Rs100 in the first month and you settle Rs25. If you ");
		out.println("give Rs50 as part payment, the money goes toward clearing the previous outstanding and the current");
		out.println(" billing is taken as further outstanding.</p>");

		out.println("<font face=Times new roman size=4 color=navy>Purchases On Credit:</font>");
		out.println("<p> In some shops or retail outlets, card payments means an extra payment added to the bill by ");
		out.println("an establishment that does not want to encourage plastic money.</p>");

		out.println("<font face=Times new roman size=4 color=navy>Fuel On Credit:</font>");
		out.println("<p> Now that you would say is a real boon. Is it? Every time you fill the tank, the service");
		out.println("charge that accompanies each transaction could be 2.5 percent. Small change that adds up ");
		out.println("to a fat sum in the total.</p>");

		out.println("<font face=Times new roman size=4 color=navy>Billing Period:</font>");
		out.println("<p> Every cardholder gets the bill in regular monthly cycles. The billing period can be a ");
		out.println("double-edged sword. If you make a purchase close to the billing date you get shorter payback ");
		out.println("time and if you buy just after you get a monthly statement, the credit period can be extended ");
		out.println("to as much as 45 days. This is how. Suppose the first billing date is April 25, after which there ");
		out.println("is a pay-by-due-date of a fortnight later, around the May 9. A purchase on May 26 will be payable");
		out.println(" approximately around June 9 but a purchase on April 23 will be payable by May 9, that is a much");
		out.println(" shorter credit time.</p>");

		out.println("<font face=Times new roman size=4 color=navy>Cash Advance:</font>");
		out.println("<p> The clock starts ticking straightaway on this facility. Usually, there are two sets of interest");
		out.println(" that are applied the moment the cash leaves the teller machine. First, there is a flat transaction fee. ");
		out.println("Second there is a rate of interest that is applied on a daily basis. Thus in the bill you end up with a");
		out.println(" dual interest. The cash advance payment is not included, usually, in the general bill. So either be");
		out.println(" circumspect or if you have to flirt with temptation than rein in the hook as fast as you can. Clubbing");
		out.println("this outgo to a roll-over credit habit can be especially fatal.</p>");

		out.println("And, the genie could end up owning you.<br>");
		out.println("<a href=#top>TOP</a>");
		out.println("<a href='http://localhost:8080/servlet/homepage'><img align=right src='d:/student/madhav/project/home3.gif'></a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
  	 }
}