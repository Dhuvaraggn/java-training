package day4;

public class Ques36 {
	public static void main(String[] args) {
		Dc c=new Dc();
	}

}
class Da{
	public Da(){
		System.out.print("Da called");
	}
}
class Db{
	public Db(){
		System.out.print("Db called");
	}
}
class Dc extends Da{
	Db b=new Db();
	public Dc() {
		System.out.print("dc");
	}
}