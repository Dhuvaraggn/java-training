package day9lab2;

public class Ques4 {
	public static void main(String [] args) throws MyException {
		throw new MyException();
	}
}
class MyException extends Exception
{
	public MyException()
	{
		System.out.print("exception called");
	}
}