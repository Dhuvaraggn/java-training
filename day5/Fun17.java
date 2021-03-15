package day5;

public class Fun17 {
public static void main(String[] args) {
	Ba b=new Ba();
	b.func();
}
}
class Aa 
{
	int a=10;
	public Aa(){
		
	}
	public void func() {
		System.out.print(a);
	}
}
class Ba extends A{
	int b=11;
	public Ba() {
		super();
	}
	public void func() {
		
		System.out.print(a);
	}
}