package day4;

public class Ques42 {
	public static void main(String[] args) {
		X x1=new X();
		X x2=new X();
		Y y1=new Y();
		y1.do2();
	}
	}

class X{
	void do1(){
		System.out.print("do1");
	}
}
class Y extends X{
	void do2(){
		System.out.print("do2");
	}
}