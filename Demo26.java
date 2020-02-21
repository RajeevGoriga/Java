import java.sql.*;
public class Demo26 {

	public static void main(String[] args)throws SQLException {
		ResultSet rs=null;
		PreparedStatement ps=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rajiv","root","root");
			System.out.println("connected");
			ps=con.prepareStatement("update Stud set elsalary=? where elName=? and elId=?");	
			ps.setInt(1,23000);
			ps.setString(2,"rajesh");
			ps.setInt(3,105);
		    ps.executeUpdate();
		}
		catch(ClassNotFoundException se)
		{
			System.out.println(se);
		}

	}

}
