package day10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Scanner;

public class ProxyPatternDemo {

	public static void main(String [] args) {
		Object obj= new importerimp();
		
		importer ia=(importer)obj;
		ia.doimport();
		((importerimp) ia).setName("ajith");
		System.out.print(((importerimp)ia).getName());
		
		Scanner s=new Scanner(System.in);
		String st=s.next();
		
		exporter e=new exporterimp();
		obj=Proxy.newProxyInstance(ia.getClass().getClassLoader(),
				new Class[] {importer.class,exporter.class},
				new MyInvocationHandler(new Object[] {ia,e}));
		importer ia1=(importer)obj;
		ia.doimport();
		ia1.doimport();
		System.out.print(((importerimp)ia).getName());
		e.doexport();
		exporter e1=(exporter)obj;
		e1.doexport();	
	}
}
class MyInvocationHandler implements InvocationHandler
{
	Object obj[];
	public MyInvocationHandler(Object obj[]) {
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
interface importer{
	public void doimport();

	}
class importerimp implements importer
{
	
	public String name;
	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	@Override
	public void doimport() {
		System.out.print("import goods from other country");
	}
	
}
interface exporter
{
	public void doexport();
}
class exporterimp implements exporter
{

	@Override
	public void doexport() {
		System.out.print("export goods to some country");
	}
	
}