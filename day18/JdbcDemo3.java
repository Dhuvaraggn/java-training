package day18;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.DatabaseMetaData;

public class JdbcDemo3 {
	public static void main(String [] args) throws SQLException {
		Connection con=DBUtility.getConnection();
		con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
		DatabaseMetaData dmd=(DatabaseMetaData) con.getMetaData();
		System.out.println(dmd.getDatabaseMajorVersion());
		System.out.print(dmd.getDatabaseProductName());
		dmd.supportsTransactionIsolationLevel(Connection.TRANSACTION_SERIALIZABLE);
		System.out.print(dmd.getDefaultTransactionIsolation());
		System.out.print(con.getTransactionIsolation());
	}
}
