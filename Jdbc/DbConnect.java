import java.sql.*;
class DbConnect{
	public static void main(String ar[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","save");
			String query="insert into stu(sid,sname,deptname) values(108,'john','mech')";
			PreparedStatement ps=con.prepareStatement(query);
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