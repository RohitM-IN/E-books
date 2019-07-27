import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class gloss_of_terms extends HttpServlet
{
	 public void doGet(HttpServletRequest re,HttpServletResponse rs)
			 throws ServletException,IOException
	 {
	 	rs.setContentType("text/html");
		PrintWriter out=rs.getWriter();
		out.println("<html>");
		out.println("<head><title>Cyber Credit Card System</title>");
		out.println("<body bgcolor=#fbfbf1>");
		out.println("<marquee align=center bgcolor=#ded7bd direction=left behavior=slide>");
		out.println("<font face='Times new roman' size=5 color=#990000> <B>");
		out.println("CYBER CREDIT CARD SYSTEM</font>");
		out.println("</marquee><br>");
		out.println("<a name=#top>");
		out.println("<h3 align=center><font face=Times new roman color=navy>Glossary Of Terms</font></h3>");
		out.println("<b><p><font face=Times new roman size=4 color=#990000>Credit Card</font>");
		out.println(" -A credit card is a financial instrument, which can be used more than once");
		out.println(" to borrow money or buy products and services on credit. Banks, retail stores and other");
		out.println(" businesses generally issue these.");
		out.println("<p><font face=Times new roman size=4 color=#990000>Credit limit</font>");
		out.println(" -The maximum amount of charges a cardholder may apply to the account.</p>");
		out.println("<p><font face=Times new roman size=4 color=#990000>Annual fee - </font>");
		out.println("A bank charge for use of a credit card levied each year, which ranges depending upon the");
		out.println(" type of card one possesses. Banks usually take an initial fixed amount in the first year and ");
		out.println("then a lower amount as yearly renewal fees.</p>");
		out.println("<p><font face=Times new roman size=4 color=#990000>Revolving Line Of Credit -</font>");
		out.println(" An agreement to lend a specific amount to a borrower and to allow that amount to be borrowed");
		out.println(" again once it has been repaid. Most credit cards offer revolving credit.</p>");

		out.println("<p><font face=Times new roman size=4 color=#990000>Personal Identification Number (PIN) -</font>");
		out.println("As a security measure, some cards require a number to be punched into a keypad before ");
		out.println("transaction can be completed. The number can usually be changed by the cardholder.</p>");

		out.println("<p><font face=Times new roman size=4 color=#990000>Teaser Rate -</font>");
		out.println("Often called the introductory rate, it is the below-market interest rate offered to entice customers");
		out.println("to switch credit cards.</p>");

		out.println("<p><font face=Times new roman size=4 color=#990000>Joint Credit -</font>");
		out.println(" Issued to a couple based on both of their assets, incomes and credit reports. It generally ");
		out.println("results in a higher credit limit, but makes both parties responsible for repaying the debt.</p>");

		out.println("<font face=Times new roman size=4 color=#990000>Types Of Cards</font>");
		out.println("<p><font face=Times new roman size=4 color=#990000>MasterCard - </font>");
		out.println("MasterCard is a product of MasterCard International and along with VISA are distributed");
		out.println("by financial institutions around the world. Cardholders borrow money against a line of credit ");
		out.println("and pay it back with interest if the balance is carried over from month to month.</p> ");

		out.println("<p><font face=Times new roman size=4 color=#990000>VISA Card - </font>");
		out.println("VISA cards is a product of VISA USA and along with MasterCard is distributed by financial ");
		out.println("institutions around the world. A VISA cardholder borrows money against a credit line and");
		out.println("repays the money with interest if the balance is carried over from month to month in a ");
		out.println("revolving line of credit.</p>");

		out.println("<p><font face=Times new roman size=4 color=#990000>Classic Card - </font>");
		out.println("Brand name for the standard card issued by VISA.");

		out.println("<p><font face=Times new roman size=4 color=#990000>Gold Card/Executive Card -</font>");
		out.println(" A credit card that offers a higher line of credit than a standard card");
		out.println("Income eligibility is also higher. In addition, issuers provide extra perks or incentives to cardholders.</p>");

		out.println("<p><font face=Times new roman size=4 color=#990000>Secured Card -</font>");
		out.println(" A credit card that a cardholder secures with a savings deposit to ensure payment ");
		out.println("of the outstanding balance if the cardholder defaults on payments. It is used by people");
		out.println("new to credit, or people trying to rebuild their poor credit ratings.</p>");

		out.println("<p><font face=Times new roman size=4 color=#990000>Smart Card - </font>");
		out.println("Smart cards, sometimes called chip cards, contain a computer chip embedded in");
		out.println("the plastic. Where a typical credit card's magnetic stripe can hold only a few dozen characters,");
		out.println("smart cards are now available with 16K of memory. When read by a special terminals, the cards");
		out.println("can perform a number of functions or access data stored in the chip. These cards can be used as");
		out.println("cash cards or as credit cards with a preset credit limit, or used as ID cards with stored-in passwords.");
		out.println("</p>");
		out.println("<p><font face=Times new roman size=4 color=#990000>Rebate Card - </font>");
		out.println("This is a card that allows the customer to accumulate cash, merchandise or services");
		out.println("based on card usage.</p>");

		out.println("<p><font face=Times new roman size=4 color=#990000>Co-Branded Card - </font>");
		out.println("This is a marriage of convenience between two service providers who want");
		out.println("a trade-off with the other's strengths. Specific facilities are made to members through these tie-ups.</p>");

		out.println("<font face=Times new roman size=4 color=#990000>Travel Card - </font>");
		out.println("These work mostly as debit cards for the limited purpose of travel. ");

		out.println("<p><font face=Times new roman size=4 color=#990000>Debit Card -</font>");
		out.println(" It is the accountholder's mobile ATM. Open an account with a bank that offers a");
		out.println(" debit card, and payments for purchases are deducted from your bank account. The retailer swipes");
		out.println(" the card over an electronic terminal at his outlet, you enter the PIN on a PIN pad and the money is");
		out.println(" immediately debited at the bank. Citibank and a few domestic banks like Times Bank offer this.");
		out.println("</p>");
		out.println("<b><font face=Times new roman size=4 color=#990000>The Positives:</font>");
		out.println("<p align=left>");
		out.println("Want to go take your girlfriend out for dinner? Be smart enough to carry a credit card along with you. ");
		out.println("Or otherwise, like the young man in the Standard Chartered ad, the cash you have could prove to be ");
		out.println("'a pain the neck'. There are other tangible benefits also. With a credit card one can spare frequent visits");
		out.println(" to the bank for withdrawing cash. The purchases you make can be paid for after a month or so before");
		out.println(" it starts attracting interest.");
		out.println("Nowadays, a credit card has many freebies attached to it. For starters, you can log on free air miles");
		out.println(" and hotel nights every time you use a Citibank credit card. One can also get a certain amount of extra");
		out.println(" protection on one's purchases with a credit card. For example, a HSBC card insures you for lost");
		out.println(" baggage and damages by theft or fire.</p>");
		out.println("<font face=Times new roman size=4 color=#990000>The Negatives:</font>");
		out.println("<p align=left>");
		out.println("If you are prone to go on shopping binges, beware, the plastic money in your possession makes ");
		out.println("it a little too easy. And one may not know of it till the monthly bill stares right on your face. ");
		out.println("Secondly, one may end up paying too much if the balance is allowed to carry over for a long");
		out.println(" period of time. For this it is important to read the fine print before one applies for a card.</p>");
		out.println("<a href=#top>TOP</a>");
		out.println("<a href='http://localhost:8080/servlet/homepage'><img align=right src='d:/student/madhav/project/home3.gif'></a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
  	 }
}