package day15;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PipedDemo {
	public static void main(String [] args) throws Exception {
		PipedInputStream pin=new PipedInputStream();
		PipedOutputStream pop=new PipedOutputStream(pin);
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->
		{	int i=0;
			try {
				while((i=pin.read())!=-1)
				{
					System.out.print((char)i);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		es.execute(()->{
			while(true) {
				try {
					pop.write("i am ajith".getBytes());
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
	}
}
