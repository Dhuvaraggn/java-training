package day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleObjectTwoThreadOneTask {
	public static void main(String [] args) {
		Gun g=new Gun();
		ExecutorService es =Executors.newFixedThreadPool(2);
		es.execute(()->{
			for(int i=0;i<5;i++) {
				try {
					g.fill();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		es.execute(()->{
			for(int i=0;i<5;i++) {
				try {
					g.shoot();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		es.shutdown();
	}
}
class Gun
{
	boolean flag;
	synchronized public void fill() throws Exception
	{
		if(flag) {
			wait();
		}
		System.out.print("fill the gun....\n");
		flag=true;
		notify();
	}
	synchronized public void shoot() throws Exception
	{
		if(!flag) {
			wait();
		}
		System.out.print("shoot with the gun...\n");
		flag=false;
		notify();
	}
	
}