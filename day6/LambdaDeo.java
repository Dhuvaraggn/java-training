package day6;

public class LambdaDeo {
	public static void main(String[] args)
	{String s="ajith";
		Inter1 int1=()->{
			System.out.print("first Lambda");
			System.out.print("string "+s);
		};
		//int1.fun();
		new LambdaDeo().mymethod(int1);
		Inter2 int2=(i,st)->{
			System.out.print("second lambda");
			System.out.print(i+"fdjsfdsj"+st);
		};
		int2.fun(10, "ajith");
		Inter3 int3=(str)->{
			return "ajith is good"+str;
		};
		System.out.print(int3.fun("guy"));
	}
	public void mymethod(Inter1 mi) {
		mi.fun();
	}
}
interface Inter1{
	public void fun() ;
}
interface Inter2{
	public void fun(int i,String s);
	
}
interface Inter3{
	public String fun(String s);
}