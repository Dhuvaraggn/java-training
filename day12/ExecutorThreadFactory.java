package day12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ExecutorThreadFactory {
	static Thread t;
	public static void main(String [] args) {
		ExecutorService es=Executors.newFixedThreadPool(1,new ThreadFactory() {

			@Override
			public Thread newThread(Runnable r) {

				t=Executors.defaultThreadFactory().newThread(r);
				t.setName("threadFactory thread");
				System.out.print("thread.......\n");
				return t;
			}
		});
		es.execute(()->{
				System.out.print("thread called ........\n");
		});
		System.out.print(t);
	}
}
