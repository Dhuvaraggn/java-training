package day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeadLock {
	public static void main(String [] args)
	{
		Frog f=new Frog();
		Crane c=new Crane();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			c.eat(f);
		});
		es.execute(()->{
			f.escape(c);
		});
	}
}
class Frog
{
	synchronized public void escape(Crane c) {
		//System.out.print();
		c.spitfrog();
	}
	synchronized public void leavecrane()
	{}
}
class Crane
{
	synchronized public void eat(Frog f) {
		f.leavecrane();
	}
	synchronized public void spitfrog()
	{
		
	}
}