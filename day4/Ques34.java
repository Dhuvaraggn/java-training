package day4;

public class Ques34 {
public static void main(String[] args) {
	Singleton s=Singleton.createClass();
	Singleton s1=Singleton.createClass();
}
}
class Singleton{
	private static Singleton single_instance=null;
	private Singleton() {
		System.out.print("only once");
	}
	public static Singleton createClass() {
		if(single_instance==null) {
			single_instance=new Singleton();
		}
		return single_instance;
	}
}
