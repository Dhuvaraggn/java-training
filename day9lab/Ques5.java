package day9lab;
import day9lab.ques1.Prod.*;
public class Ques5 implements Ques5Interface {

	@Override
	public void ffunc() {
		// TODO Auto-generated method stub
		System.out.print("first");
	}

	@Override
	public void sfunc() {
		// TODO Auto-generated method stub
		System.out.print("sec");
	}

	@Override
	public void tfunc() {
		// TODO Auto-generated method stub
		System.out.print("third");
	}
	public static void main(String[] args) {
		Ques5 o=new Ques5();
		o.ffunc();
	}

}
