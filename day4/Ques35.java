package day4;

public class Ques35 {
	public static void main(String[] args) {
		B b=new B();
	}
}

class Ai{

	public int a=10;
	private int b=11;
	protected int c=12;
	int d=13;

}
 class B extends Ai{
	public int a2=14;
	private int b2=15;
	protected int c2=16;
	int d2=17;
	public B() {
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		System.out.print(d);
		System.out.print(a2);
		System.out.print(b2);
		System.out.print(c2);
		System.out.print(d2);
	}
	
}