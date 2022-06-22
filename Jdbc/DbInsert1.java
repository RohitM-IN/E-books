import java.sql.*;
import java.util.Scanner;

class DbInsert1{
	public static void main(String ar[]){
		try{
		    int stid,n,rollno;
			String stname;
			String depname;
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student1_db","root","save");
			Scanner sc=new Scanner(System.in);
			
			String query="insert into stud1(stid,stname,depname,rollno) values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			
		
      			System.out.println("Enter studend id");
			    stid=sc.nextInt();
				
				System.out.println("Enter studend Name");
			    stname=sc.nextLine();
				
				System.out.println("Enter studend deptname");
			    depname=sc.nextLine();
				
				System.out.println("Enter studend roll no");
			    rollno=sc.nextInt();
			
			ps.setInt(1,stid);
			ps.setString(2,stname);
			ps.setString(3,depname);
			ps.setInt(4,rollno);
			
			int affected_rows=ps.executeUpdate();
			
			if(affected_rows>0){
				System.out.println("Inserted Successfully");
			}
			else{
				System.out.println("Cannot be Inserted");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}