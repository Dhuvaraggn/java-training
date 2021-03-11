package day4;

public class Ques5 {
	public static void main(String[] args) {
		int i[]=new int[]{1,2,3,4,5};
		System.out.print(avg(i));
		
	}
	static int avg(int[] i) {
		int sum=0;
		for(int n:i) {
			sum+=n;
		}
		int avg=sum/i.length;
		return avg;
	}
}
