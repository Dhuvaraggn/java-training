package dayeleven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo2 {
	public static void main(String [] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		ReservationCounter mgr=new ReservationCounter();
		es.execute(()->{
			Thread.currentThread().setName("ajith");
			synchronized(mgr) {
			mgr.getTicket(1000);
			mgr.getChange();}
		});
		es.execute(()->{
			Thread.currentThread().setName("raj");
			mgr.getTicket(500);
			mgr.getChange();
		});
		
		es.shutdown();
	}
}

class ReservationCounter
{	int amt;
	//synchronized public void getTicket(int amount) 			// method lock optimistic lock
	public void getTicket(int amount)
	{
		this.amt=amount;
		Thread t=Thread.currentThread();
		System.out.print("the person "+t.getName()+" give amt:"+amt+"\n");
	}
	 public void getChange() {
		Thread t= Thread.currentThread();
		System.out.print("the person " + t.getName() + " got change amt:"+ (amt-100)+"\n");
	}
}