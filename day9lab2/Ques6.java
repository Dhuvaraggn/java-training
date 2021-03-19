package day9lab2;
import day9lab2.Ques5;
public class Ques6 {
	public static void main(String ar[]) throws MyExcep {
		exc e=new exc();
		e.method();
	}
}
class exc 
{
	public void method() throws MyExcep {
		throw new MyExcep();
	}
}