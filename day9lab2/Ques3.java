package day9lab2;

public class Ques3 {
	public void mth1()
	{
		mth2();
		System.out.print("caller");
	}
	public void mth2() {
		try
		{
			System.exit(0);
		}catch( Exception e) {
			System.out.print("catch mth2");
		}
		finally {
			System.out.print("finally");
		}
	}
	public static void main(String a[]) {
		Ques3 q=new Ques3();
		q.mth1();
	}
}
