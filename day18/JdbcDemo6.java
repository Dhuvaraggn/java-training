package day18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemo6 {
	public static void main(String [] args) throws SQLException {
		try {
		Connection con=DBUtility.getConnection();
		PreparedStatement st=con.prepareStatement("select * from users where uid=?");
		Scanner s=new Scanner(System.in);
		int userid=s.nextInt();
		st.setInt(1, userid);
		ResultSet rs=st.executeQuery();
		ResultSetMetaData rmd=rs.getMetaData();
		int c=rmd.getColumnCount();
		for(int i=1;i<=c;i++) {
			System.out.print(rmd.getColumnName(i));
		}
		while(rs.next()) {
			//System.out.println("\n"+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			for(int i=1;i<=c;i++) {
			System.out.print(rs.getString(i));
			}
		}
		DBUtility.closeConnection(null, null);
		}catch(Exception e) {
			DBUtility.closeConnection(e, null);
		}
	}
}
