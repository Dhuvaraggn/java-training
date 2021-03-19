package day9;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Scanner;

public class FactoryDyanmicBinding {
	public static void main(String [] args) throws Exception{
		ShoeSeller ss=Container.getShoeSeller();
		Shoe s=ss.sellShoe();
		Method m=ss.getClass().getSuperclass().getMethod("getName");
		System.out.print(m.invoke(ss));
		System.out.print(s);
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		Importimp imp=new Importimp();
		Object obj=Proxy.newProxyInstance(ss.getClass().getClassLoader(),
				new Class[] {ShoeSeller.class,Importer.class},
				new MyInvocationHandler(new Object[] {ss,imp}));
		Importer ajith=(Importer)obj;
		ss=(ShoeSeller)obj;
		Method ma[]=ss.getClass().getDeclaredMethods();
		for(Method me:ma) {
			System.out.print(me.getName()+"\n");
		}
		Class c[]=ss.getClass().getClasses();
		for(Class ce:c) {
			System.out.print(ce.getName());
		}
		/*Field f[]=ss.getClass().getSuperclass().getFields();
		for(Field fe:f) {
			System.out.print(fe.getName());
		}
		System.out.print(f.get(ss));
		for(Method me:mp)
		{
			System.out.print(me.getName()+"\n");
		}
		*/
		
		/*
		 * Class p=ss.getClass().getSuperclass();
		 * 
		Method mpe=p.getDeclaredMethod("getName", null);
		System.out.print(mpe.invoke(ss, args));
		Method mp[]=p.getDeclaredMethods();
		for(Method me:mp)
		{
			System.out.print(me.getName()+"\n");
		}
		System.out.print(p);
		*/
	//	m=ss.getClass().getSuperclass().getMethod("getName");
	//	System.out.pri{nt(m.invoke(ss));
		
		//ShoeSeller ssn=(ShoeSeller)obj;
		//Shoe sn=ssn.sellShoe();
		//System.out.print();
		//Method ms=ssn.getClass().getSuperclass().getMethod("getName");
		//System.out.print(ms.invoke(ssn));
		ajith.doImport();
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
		Object returnObject=null;
		for(Object o:obj) {
			Method me[]=o.getClass().getDeclaredMethods();
			for(Method m:me) {
				if(m.getName().equals(method.getName())) {
					m.setAccessible(true);
					returnObject=method.invoke(o);
				}
			}
		}
		
		return returnObject;
	}
	
}
class Container {
	public  static ShoeSeller getShoeSeller() throws Exception {
		ShoeShop s=(ShoeShop)Class.forName("day9.AjithShoeShop").getConstructor().newInstance();
		System.out.print(s);
		s.setName("ajith");
		ShoeFactory sm=(ShoeFactory)Class.forName("day9.LakhaniShoeFactory").getConstructor().newInstance();
		s.setM(sm);
		return s;
	}
}
interface Importer{
	public void doImport();
}
class Importimp implements Importer{
	public Importimp() {
	}
	@Override
	public void doImport() {
		System.out.print("doing import ..............");
	}
	
}
abstract class Shoe{
}
class LeatherShoe extends Shoe{
	
}
class SportsShoe extends Shoe{	
}

interface Manufacturer
{
	
}
interface ShoeManufacturer extends Manufacturer{
	public Shoe doShoe();
}
abstract class ShoeFactory implements ShoeManufacturer{
	public ShoeFactory() {
		
	}
	
}
class BataShoeFactory extends ShoeFactory{
	public BataShoeFactory() {
		
	}
	@Override
	public Shoe doShoe() {
		System.out.print("shoe is manufactured by bata here...........");
		return new LeatherShoe();
	}
}
class LakhaniShoeFactory extends ShoeFactory{
	public LakhaniShoeFactory() {
		
	}@Override
	public Shoe doShoe() {
		System.out.print("shoe is manufactured by lakhani here...........");
		return new SportsShoe();
	}
}

interface Seller
{
}
interface ShoeSeller extends Seller
{ 

	public Shoe sellShoe();
}
abstract class ShoeShop implements ShoeSeller
{
	private String name;
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	private ShoeFactory m;
	public final ShoeFactory getM() {
		return m;
	}
	public final void setM(ShoeFactory m) {
		this.m = m;
	}
	
	public ShoeShop()
	{
	}
	
}
class AjithShoeShop extends ShoeShop
{	
	public AjithShoeShop() {
	
}
	@Override
	public Shoe sellShoe() {
	System.out.print("sell the shoe ");
	return getM().doShoe();
}
	
}