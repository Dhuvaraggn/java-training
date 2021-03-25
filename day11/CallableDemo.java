package day11;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	public static void main(String [] args) throws Exception{
		ExecutorService es=Executors.newFixedThreadPool(1);
		Thread.sleep(1000);
		Future f=es.submit(new MyCallable());
		Thread.sleep(1000);
		String s=(String)f.get();
		System.out.print(s+"\n");
		System.out.print("main");
		es.shutdown();
	}
}
class MyCallable implements Callable{
	MyCallable()
	{
		System.out.print("call cons\n");
	}
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		//Thread.sleep(1000);
		System.out.print("call called\n");
		
		return "hello world";
	}
	
}