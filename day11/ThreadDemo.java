package day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {
	public ThreadDemo() {
		//Thread t=new Thread(new MyThreadWork());				///Old way 
		//t.start();
		ExecutorService es=Executors.newFixedThreadPool(1);		//new Way
		es.execute(new MyThreadWork());
		es.shutdown();
	}
	public static void main(String [] args) throws Exception {
		new ThreadDemo();
		Thread t=Thread.currentThread();
		//System.out.print(t);
		t.setName("ajith");
		t.setPriority(10);
		//System.out.print(t);
		for(int i=0;i<5;i++)
			{
		//	Thread.sleep(1000);
			System.out.print(i);
			}
			}
}
class MyThreadWork implements Runnable
{
	@Override
	public void run() {
		System.out.print("child thread caled");
	}
}