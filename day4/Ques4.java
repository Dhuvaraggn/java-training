package day4;

public class Ques4 {
	public static void main(String[] args)
	{
		int n=9;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println("not a prime number");
				break;
			}
			else if(i==n/2 && n%i!=0) {
				System.out.print("prime no");
			}
			else {
				continue;
			}
			
		}
	}
}
