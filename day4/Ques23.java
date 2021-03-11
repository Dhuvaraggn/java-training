package day4;

public class Ques23 {
	public static void main(String[] arg) {
		
				
		Ques23 q=new Ques23();
		q.func();
		Sume s1=new Sume();
		q.func2(s1);

	}
	public void func() {
		Sume s=new Sume();
		System.out.print(s.a);
		s.a=12;
		System.out.print(s.a);
		
	}
	public void func2(Sume s) {
		s.a=13;
		System.out.print(s.a);
	}
}

class Sume{
	protected int a=10;
	
}