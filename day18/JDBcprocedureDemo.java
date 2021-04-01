package day18;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import com.mysql.cj.jdbc.CallableStatement;

public class JDBcprocedureDemo {
	public static void main(String [] args) throws SQLException {
		try {
		Connection con=DBUtility.getConnection();
	/*	CallableStatement cs=(CallableStatement) con.prepareCall("{ call proc2()}");
		int i=cs.executeUpdate();
		System.out.print(i);
	*/
		
	/*	CallableStatement cs=(CallableStatement) con.prepareCall("{call proc3(?,?)}");
		cs.setInt(2, 1000);
		cs.setString(1, "ajith");
		int i=cs.executeUpdate();
	*/
		CallableStatement cs=(CallableStatement) con.prepareCall("{call proc4(?,?)}");
		cs.setString(1, "dar");
		cs.registerOutParameter(2, Types.INTEGER);
		cs.execute();
		System.out.print(cs.getInt(2));
		DBUtility.closeConnection(null, null);
		}
		catch(Exception e) {
			DBUtility.closeConnection(e, null);
			e.printStackTrace();
		}
		}
}
