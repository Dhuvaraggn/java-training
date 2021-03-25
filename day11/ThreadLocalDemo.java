package day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalDemo {
	public static void main(String [] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			Resource r=ThreadLocalUtility.getResource("ajith");
			//Resource r=new Resource("ajith");
			System.out.print(r);
			//r=new Resource("raj");
			r=ThreadLocalUtility.getResource("raj");
			System.out.print(r);
		});
		es.execute(()->{
			Resource r=ThreadLocalUtility.getResource("scnd");
			System.out.print(r);
		});
	}
}
class ThreadLocalUtility{

	static ThreadLocal localt=new ThreadLocal();
	public static Resource getResource(String name) {
		Resource r=(Resource)localt.get();
		if(r==null) {
			r=new Resource(name);
			localt.set(r);
		}
		r.name=name;
		return r;
	}
	public static void closeResource()
	{
		Resource r=(Resource)localt.get();
		if(r!=null) {
			localt.remove();
		}
	}
}
class Resource 
{
	String name;
	Resource(String n) {
		System.out.print("obj created\n");
		this.name=n;
	}
	public String toString() {
		return name+"\n";

	}
}