package day18;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo7 {
	public static void main(String [] args) throws SQLException {
		Connection con=DBUtility.getConnection();
		Statement s= con.createStatement();
		int i=s.executeUpdate("delete from users where uid=2");
		int k=s.executeUpdate("insert into users values (3,'sdsf','fdff',10000)");
		ResultSet rs=s.executeQuery("select * from users");
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		}
		
		int j=s.executeUpdate("update users set name='raj' where uid=1");
		rs=s.executeQuery("select * from users");
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		}
		
		PreparedStatement ps=con.prepareStatement("select * from users where uid= ?");
		ps.setInt(1, 3);
		rs=ps.executeQuery();
		System.out.println();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		}
		
	}
}
