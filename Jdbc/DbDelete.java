import java.sql.*;
class DbDelete{
	public static void main(String ar[]){
		try{
		   
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db","root","save");
			String query="delete stid from emp where stid=1";
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				String stid=rs.getString("stid");
				String stname=rs.getString("stname");
				String depname=rs.getString("depname");
				String rollno=rs.getString("rollno");
			    System.out.println(stid+" "+stname+" "+depname+" "+rollno);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}