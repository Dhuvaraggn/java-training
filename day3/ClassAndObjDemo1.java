package day3;

public class ClassAndObjDemo1 {
public static void main(String[] args)
{
	Shoe shoe=new LetherShoe();
	LetherShoe ls=new LetherShoe();
	shoe.met();
	ls.met();
	
	
}
}
class Shoe{
	public Shoe() {
		System.out.println("shoe cons called...");
	}
	public void met() {
		System.out.println("parent method");
	}
	public void met1(int a) {
		System.out.println("parent method with parameters");
	}
}
class LetherShoe extends Shoe{
	public LetherShoe() {
		super();
		System.out.println("lethershoe cons called ...");
	}
	//override method
	@Override
	public  void met() {
		super.met();
		System.out.println("child override method");
	}
	
}