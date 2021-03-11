package day4;

public class Ques17 {
	//const int a=10;

	static int b=10;
	public static void main(String[] args) {
		// const c=10;
		Ques17 q=new Ques17();
		q.func();
	}
	 void func() {
		System.out.print(b);
	}
	public Ques17(int a){
		b=a;
	}
	//says default constructor not defined
}
