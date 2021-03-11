package day4;

public class StaticDemo {
	public static void main(String[] args) {
		System.out.println("main method call");
		A a=new A();
		StaticDemo s=new StaticDemo();
		s.met();
		A.met2();
	}
	public static void main(int[] a) {
		//super.toString();
		//this.i=0;
		System.out.println("another static called ");
	}
	void met() {
		main(new int[] {1,2,3,4,5});
	}
}
class A{
	static {  	// static block this will be called when object in created 
		System.out.println("static block callled");
	}
	public static void main(String[] arg) {
		System.out.println("A class main called");
		}
	static void met2() {
		System.out.println("static method2 called");
	}
}