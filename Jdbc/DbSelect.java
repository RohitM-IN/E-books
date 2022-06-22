import java.sql.*;
class DbSelect{
	public static void main(String ar[]){
		try{
		   
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db","root","");
			String query="select * from emp";
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				String eid=rs.getString("eid");
				String ename=rs.getString("ename");
				String sal=rs.getString("sal");
				String dno=rs.getString("dno");
			    System.out.println(eid+" "+ename+" "+sal+" "+dno);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}