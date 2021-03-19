package day10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Scanner;


public class ProxySingletoDemo {
	public static void main(String [] args) throws Exception{
		Object obj= importerimp1.createObject();
		
		importer1 ia=(importer1)obj;
		ia.doimport();
		((importerimp1) ia).setName("ajith");
		System.out.print(((importerimp1)ia).getName());
		
		Scanner s=new Scanner(System.in);
		String st=s.next();
		
		exporter1 e=exporterimp1.createObject();
		exporter1 e1=exporterimp1.createObject();
		obj=Proxy.newProxyInstance(ia.getClass().getClassLoader(),
				new Class[] {importer1.class,exporter1.class},
				new MyInvocationHandler1(new Object[] {ia,e,e1}));

		importer1 ia1=(importer1)obj;
		ia1.doimport();
		System.out.print(((importerimp1)ia).getName());
		ia.doimport();
		e.doexport();
		e1.doexport();	
	}
}
class MyInvocationHandler1 implements InvocationHandler
{
	Object obj[];
	public MyInvocationHandler1(Object obj[]) {
		this.obj=obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object returnObj=null;
		for(Object o:obj)
		{
			Method m[]=o.getClass().getDeclaredMethods();
			for(Method me:m) {
				if(me.getName().equals(method))
				{	me.setAccessible(true);
					returnObj=me.invoke(o, args);
				}
			}
		}
		return returnObj;
	}
	
}
interface importer1{
	public void doimport();

	}
class importerimp1 implements importer1,Cloneable
{
	
	public String name;
	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}
	private importerimp1()
	{
		System.out.print("importer cons called");
		
	}
	private static importerimp1 impobj;
	synchronized public static importerimp1 createObject() throws Exception
	{
		if(impobj==null) {
			impobj=new importerimp1();
		}
		return impobj.createClone();
	}
	private importerimp1 createClone() throws Exception{
		// TODO Auto-generated method stub
		return (importerimp1)super.clone();
	}

	@Override
	public void doimport() {
		System.out.print("import goods from other country");
	}
	
}
interface exporter1
{
	public void doexport();
}
class exporterimp1 implements exporter1,Cloneable
{
	private exporterimp1()
	{
		System.out.print("exporter cons called");
	}
	private static exporterimp1 expobj;
	synchronized public static exporterimp1 createObject() throws Exception{
		if(expobj==null)
		{	expobj=new exporterimp1();
			}
		return expobj.createClone();
	}
	private exporterimp1 createClone() throws Exception {
		// TODO Auto-generated method stub
		return (exporterimp1)super.clone();
	}
	@Override
	public void doexport() {
		System.out.print("export goods to some country");
	}
	
}
