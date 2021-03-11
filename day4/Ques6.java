package day4;

public class Ques6 {
	public static void main(String[] args)
	{
		int i[]=new int[] {1,2,3,4,5};
		int copy[]=new int[4];
		System.arraycopy(i, 0, copy, 0, 4);
		for(int j:copy) {
			System.out.print(j);
		}
		}
}
