import java.sql.*;

public class Jdbc1 {

	public static void main(String[] args)throws SQLException {
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rajiv","root","root");
			System.out.println("connected");
		PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
		ps.setInt(1,46465);
		ps.setString(2,"T");
		ps.setInt(3, 10);
		ps.setFloat(4, 10000f);
		ps.executeUpdate();
		ps.close();		
		ps=con.prepareStatement("select *from employee");
		
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt("eno"));
			System.out.println(rs.getString("ename"));
            System.out.println(rs.getInt("deptno"));
            System.out.println(rs.getFloat("esal"));

		}
		}
		catch(ClassNotFoundException se)
		{
			System.out.println(se);
		}
		finally
		{
			con.setAutoCommit(false);
			con.commit();
		}

	}

}
