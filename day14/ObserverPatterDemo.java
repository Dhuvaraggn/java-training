package day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ObserverPatterDemo {
	public static void main(String [] args) {
		Firealarm fa=new Firealarm();
		fa.addObserver(new Student());
		fa.addObserver(new Teacher());
		fa.addObserver(new Student());
		fa.setFire();
	}
}
class ThreadObservable extends Observable{
	List<Observer> ol;
	public ThreadObservable() {
		ol=new ArrayList<>();
	}
	@Override
	public synchronized void addObserver(Observer o) {
		// TODO Auto-generated method stub
		ol.add(o);
	}
	@Override
		public void notifyObservers(Object arg) {
			// TODO Auto-generated method stub
			ExecutorService es=Executors.newFixedThreadPool(this.ol.size());
			
				for(Observer o:this.ol) {
					es.execute(()->{
						o.update(this, arg);
				});
			}
			es.shutdown();
		}
}
class Firealarm extends ThreadObservable 
{
	public void setFire(){
		setChanged();
		notifyObservers();
	}
}
class Student implements Observer{
	public void runaway() {
		System.out.println("students are running");
	}

	@Override
	public void update(Observable o, Object arg) {
		runaway();
		
	}
}
class Teacher implements Observer{
	public void runaway() {
		System.out.println("thinking");
		try {Thread.sleep(9000);}catch(Exception e) {}
		System.out.println("teachers are running");
	}

	@Override
	public void update(Observable o, Object arg) {
		runaway();
		
	}
}