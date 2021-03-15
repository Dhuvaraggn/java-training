package day6;

import java.util.Scanner;

public class FanDemo {
	public static void main(String[] args) {

		Fan f=new Fan();
		while(true) {
			Scanner s=new Scanner(System.in);
			s.next();
			f.pull();
		}
	}
}
class Fan{
	State s;
	public final void setState(State s) {
		this.s=s;
	}
	Fan(){
		s=new State1();
	}
	public void pull() {
		s.pull(this);
	}
}

abstract class State{
	public abstract void pull(Fan f);
	
}
class State1 extends State{
	public  void pull(Fan f) {
		System.out.print("off state");
		f.setState(new State2());
	}
}
class State2 extends State{
	public void pull(Fan f) {
		System.out.print("low state");
		f.setState(new State3());
	}
	
}
class State3 extends State{
	public void pull(Fan f) {
		System.out.print("medium state");
		f.setState(new State4());
	}
	
}class State4 extends State{
	public void pull(Fan f) {
		System.out.print("high state");
		f.setState(new State1());
	}
	
}