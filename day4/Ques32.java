package day4;

public class Ques32 {
	static {
		System.out.print("static block called");
	}
	public static void main(String[] arg) {
		Staticdemo s1=new Staticdemo();
		Staticdemo s2=new Staticdemo();
	}
}
class Staticdemo{
	static {
		System.out.print("child static block called");
	}
	public Staticdemo(){
		System.out.print("A obj created");
	}
}