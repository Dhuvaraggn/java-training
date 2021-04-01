package Project1;

import java.io.FileInputStream;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Enumeration;
import java.util.Properties;

public class ControllerImpl extends UnicastRemoteObject implements Controller,Serializable {

	protected ControllerImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public Object getDynamicObject(Controller p) throws Exception{
		int count=0;
		if(p==null) {
			p=new ControllerImpl();
		}
		try {
			Properties prop=new Properties();
			prop.load(new FileInputStream("rmiservice-config.properties"));
			Enumeration counten=prop.elements();
			int noofservices=0;
			while(counten.hasMoreElements()) {
				noofservices=noofservices+1;
				System.out.println(counten.nextElement());
			}
			System.out.println("No of services...:"+noofservices);
			Class c[]=new Class[noofservices];
			Object o[]=new Object[noofservices];
			Enumeration en=prop.elements();
			while(en.hasMoreElements()) {
				String serviceConfigFile=(String)en.nextElement();
				System.out.println("service files...:"+serviceConfigFile);
				Properties servicesProp=new Properties();
				servicesProp.load(new FileInputStream(serviceConfigFile));
				String urlstr=servicesProp.getProperty("url");
				String interfacename=servicesProp.getProperty("interfacename");
				o[count]=Naming.lookup(urlstr);	
				c[count]=Class.forName(interfacename);
				//list.add(Class.forName(interfacename));
				//list.add(interfacename);
				++count;
				}
			
			Object obj=Proxy.newProxyInstance(p.getClass().getClassLoader(), 
					c,new MyInvocationHandler(o));
			//System.out.println("The object...:"+obj);
			System.out.print((Sms)obj);
			
			return obj;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void main(String [] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
		ControllerImpl c=new ControllerImpl();
		LocateRegistry.createRegistry(2000);
		Naming.bind("rmi://localhost:2000/service/controller", c);
	}
}
class MyInvocationHandler implements InvocationHandler,Serializable{
	Object obj[];
	public MyInvocationHandler(Object obj[]) {
		this.obj=obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object ret=null;
		for(Object o:obj) {
			if(o!=null) {
			Method m[]=o.getClass().getDeclaredMethods();
			for(Method mm:m) {
				mm.setAccessible(true);
			}
			try {
				System.out.println("method invoked...");
				ret=method.invoke(o, args);
			}catch(Exception e) {
				//e.printStackTrace();
			}
			}
		}
		return ret;
	}
}