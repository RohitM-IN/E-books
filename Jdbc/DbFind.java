import java.io.DataInputStream;
import java.sql.*;


public class Dbfind {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student1_db","root","root");

			Statement smt=cn.createStatement();

			DataInputStream KB=new DataInputStream(System.in);
		
			System.out.print("Enter Student ID:");
			String stid=KB.readLine();
			
			String q="Select * from stud1 where stid="+stid;
			
			ResultSet rs=smt.executeQuery(q);

			if(rs.next())
			{
				System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
			}
			else
			{
				System.out.println("Record Not Found...");
			}
			cn.close();
		}
		
		catch(Exception e){
			System.out.println(e);
		}
	}
}