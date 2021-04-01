package day16;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class RmiServer extends UnicastRemoteObject implements Stock {

	protected RmiServer() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public int getStockPrice(String stock) throws Exception {
		// TODO Auto-generated method stub
		if(stock.equals("coda"))
			return 100;
		else 
			return 500;
	}
	public static void main(String [] args) throws RemoteException, Exception, AlreadyBoundException {
		RmiServer s=new RmiServer();
		LocateRegistry.createRegistry(1099);
		Naming.bind("rmi://localhost/rmiservice/stock", s);
	}

}
interface Stock extends Remote
{
	public int getStockPrice(String stock) throws Exception;
}