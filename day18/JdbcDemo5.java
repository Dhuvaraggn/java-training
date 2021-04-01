package day18;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo5 {
	public static void main(String [] args) throws SQLException
	{
		Connection con=DBUtility.getConnection();
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from users");
		ResultSetMetaData rmd=rs.getMetaData();
		int c=rmd.getColumnCount();
		for(int i=1;i<=c;i++) {
			System.out.print(rmd.getColumnName(i));
		}
		while(rs.next()) {
			System.out.println("\n"+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		}
		DBUtility.closeConnection(null, null);
	}
}
