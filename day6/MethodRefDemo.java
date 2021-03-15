package day6;

public class MethodRefDemo {
	public MethodRefDemo()
	{
		
	}
	public void func() {
		System.out.print("method ref to function");
	}
	public  MethodRefDemo(int i,String s) {
		System.out.print(i+"slfjslf"+s);
	}
	public static String func2(String s) {
		return "my name is "+s;
	}
	public static void main(String[] args) {
		Inter1 int1=new MethodRefDemo()::func;
		int1.fun();
		Inter2 my2=MethodRefDemo::new; // this will point to the constructor....
		my2.fun(10,"ajith");
		
		Inter3 my3= MethodRefDemo::func2; // static method association..
		System.out.println(my3.fun("ajith"));
		
	}
}
