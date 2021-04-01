package day18;

import java.sql.Connection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JDBCDemo2 {
	public static void main(String [] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			Connection con1=DBUtility.getConnection();
			System.out.println(con1);
			//DBUtility.closeConnection();
			Connection con2=DBUtility.getConnection();
			System.out.println(con2);
		});
		es.execute(()->{
			Connection con3=DBUtility.getConnection();
			System.out.println(con3);
			Connection con2=DBUtility.getConnection();
			System.out.println(con2);
		});
		es.shutdown();
	}
}
