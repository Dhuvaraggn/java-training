package day4;

public class Ques37 {

	public static void main(String[] args) {
		Dc2 c=new Dc2();
	}

}
class Da2{
	int a;
	public Da2(int a){
		System.out.print("Da called");
		this.a=a;
	}
}
class Db2{
	int b;
	public Db2(int b){
		this.b=b;
		System.out.print("Db called");
	}
}
class Dc2 extends Da2{
	Db2 b=new Db2(9);
	public Dc2() {
		super(11);
		System.out.print("dc");
	}
}
