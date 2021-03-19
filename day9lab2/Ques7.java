package day9lab2;
import day9lab2.Ques5;
public class Ques7 {

}
 class base
{
	 public base() throws MyExcep
	 {
		 System.out.print("base classe");
	 }
}
 class derived extends base
 {

	public derived()  {
		super();
		try {
			throw new MyExcep();
		}
		catch(MyExcep e) {
		}
		
	}
 }