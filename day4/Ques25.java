package day4;

public class Ques25 {
	public static void main(String[] args) {
		dervied d=new dervied();
		d.useD();
	}

}
protected class base{// illegal modifier only public abstarct final
	String Method() {
		return "Wow";
	}
}
class dervied
{
	public void useD() {
		base z=new base();
		System.out.print("base says "+ z.Method());
	}
}