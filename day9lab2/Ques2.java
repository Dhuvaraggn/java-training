package day9lab2;

public class Ques2 {
	public void mth1()
	{
		mth2();
		System.out.print("caller");
	}
	public void mth2() {
		try
		{
			return;
		}catch( Exception e) {
			System.out.print("catch mth2");
		}
		finally {
			System.out.print("finally");
		}
	}
	public static void main(String a[]) {
		Ques2 q=new Ques2();
		q.mth1();
	}
}
