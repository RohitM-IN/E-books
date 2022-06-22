import java.sql.*;
class DbInsert{
	public static void main(String ar[]){
		try{
		    int eid=106;
			String ename="Harry";
			double sal=35000;
			int dno=3;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db","root","");
			String query="insert into emp(eid,ename,sal,dno) values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1,eid);
			ps.setString(2,ename);
			ps.setDouble(3,sal);
			ps.setInt(4,dno);
			
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