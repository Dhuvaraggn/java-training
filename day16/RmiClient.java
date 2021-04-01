package day16;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RmiClient {
	public static void main(String [] args) throws Exception, RemoteException, NotBoundException {
		Stock s=(Stock)Naming.lookup("rmi://localhost/rmiservice/stock");
		System.out.print(s.getStockPrice("press"));
	}
}
