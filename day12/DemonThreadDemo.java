package day12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemonThreadDemo {
	public DemonThreadDemo() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.print("child thread .........");
				}
			}
		}).start();
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(()->{
			while(true) {
				System.out.print("child thread...........");
			}
		});
		
	}
	public static void main(String [] args) {
		System.out.print("start");
		try {
			Thread.sleep(1000);}
		catch(Exception e) {}	
		new DemonThreadDemo();
		System.out.print(Thread.currentThread().getName());
		System.out.print("main thread demon....\n");
		Thread.currentThread().setDaemon(true);
		
		System.exit(1);
		System.out.print("hello");
		}
	
}
