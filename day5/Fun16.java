package day5;

public class Fun16 {
	public static void main(String[] args) {
		System.out.print(volume(9,8,7));
		C c=new C();
	}
	
	static float volume( int a,int b,int c) {
		return a*b*c;
	}
}
class A
{
	int a=10;
}
class B extends  A
{
	int b=11;
}
class C extends B{
	int c=12;
	public C()
	{
		System.out.print(a+" "+b+" "+c);}
}
