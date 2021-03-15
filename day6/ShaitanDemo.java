package day6;
import java.util.*;
public class ShaitanDemo {
	public static void main(String[] args) {
		Shaitan shaitan=new Shaitan();
			
			shaitan.next();
		
	}
}
class Shaitan{
	int state=0;
	Shaitan(){

		System.out.print("off state");
	}
	void next() {
		Shaitan1 one=new Shaitan1();
		while(true) {
		Scanner s=new Scanner(System.in);
		s.next();
		one.next();}
		
	}
}
class Shaitan1 extends Shaitan{
	Shaitan1(){

		System.out.print("on state");
		super.state++;
	}
	void next() {
		
		Shaitan2 two=new Shaitan2();
		while(true) {
			Scanner s=new Scanner(System.in);
			s.next();
		two.next();}
	}
}
class Shaitan2 extends Shaitan1{
	Shaitan2(){

		System.out.print("medium state");
		super.state++;
	}
	void next() {
		Shaitan3 three =new Shaitan3();
		while(true) {
			Scanner s=new Scanner(System.in);
			s.next();
		three.next();}
		
	}
}
class Shaitan3 extends Shaitan2{
	Shaitan3(){

		System.out.print("high state");
		super.state++;
	}
	void next() {
		Shaitan start =new Shaitan();
		while(true) {
			Scanner s=new Scanner(System.in);
			s.next();
		start.next();}
	}
	
	
}
/*
abstract class Shaitan{
	int state=0;
	void doSwitch() {
		System.out.print(state);
		state++;
	}
}
class Change extends Shaitan{
	
}
 */