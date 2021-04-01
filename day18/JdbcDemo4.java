package day18;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class JdbcDemo4 {
	public static void main(String [] args) throws SQLException
	{
		Connection con=DBUtility.getConnection();
		Statement stm=con.createStatement();
		Savepoint s=null;Savepoint s1=null;
		//int i=stm.executeUpdate("create table users (uid int(5),name varchar(20),addr varchar(20),sal int(6))");
		//System.out.print(i);
		try {
		int i =stm.executeUpdate("insert into users values(1,'ajith','trichy',1000)");
		s=con.setSavepoint("first");
		
		i=stm.executeUpdate("insert into users values(2,'dar','ddf',4309834)");
		s1=con.setSavepoint("sec");
		
		i=stm.executeUpdate("insert into user values(3,,'aff',10)");
		DBUtility.closeConnection(null, null);
		}
		catch(Exception e) {
			
			DBUtility.closeConnection(e,s1);
			e.printStackTrace();
		}
	}
}
