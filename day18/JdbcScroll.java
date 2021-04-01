package day18;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcScroll {
	public static void main(String [] args) throws SQLException {
		Connection con=DBUtility.getConnection();
		Statement s=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=s.executeQuery("select * from users");
		 rs.afterLast();
		  while(rs.previous())
		  {
			  System.out.print(rs.getInt(1)+" "+rs.getString(2));
		   }
		  s.close();
		  con.close();  
	}
}
