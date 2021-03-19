package day9lab2;

public class Ques5 {
	public static void main(String[] arg) {		
		try {
			throw new MyExcep();
		}catch(MyExcep e) {
			System.out.print("exception called");
		}
		
	}
}
class MyExcep extends Exception
{
	public MyExcep()
	{System.out.print("myexcep is bla bala sflsjflsfdjslfjslfjsa;lfajf;lfj;l");
	}
}