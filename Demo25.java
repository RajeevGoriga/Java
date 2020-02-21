import java.sql.*;
import java.util.Scanner;

public class Demo25 {

	public static void main(String[] args)throws SQLException {
		Scanner s=new Scanner(System.in);
		ResultSet rs=null;
		PreparedStatement ps=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rajiv","root","root");
			System.out.println("connected");
			System.out.println("1-read 2-update 3-delete");
			int a=s.nextInt();
			
			switch(a)
			{
		case 1:	
	    ps=con.prepareStatement("select *from Element");	
		rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt("Atomicweight")+" "+rs.getString("Name")+" "+rs.getString("Chemicalsymbol"));
		}
		break;
		case 2:
	    ps=con.prepareStatement("update Element set Chemicalsymbol=? where Name=? and Atomicweight=?");	
		ps.setString(1,"c");
		ps.setString(2,"carbon");
		ps.setInt(3,12);
	    ps.executeUpdate();
		break;
	   case 3:
		ps=con.prepareStatement("delete from Element  where Chemicalsymbol=?");
			ps.setString(1, "he");		
			ps.executeUpdate();
			break;
		}
		con.close();
		}
		catch(ClassNotFoundException se)
		{
			System.out.println(se);
		}
		
	}

}
