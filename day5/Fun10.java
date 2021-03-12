package day5;

public class Fun10 {
public static void main(String[] args) {
	int n=7;
	int i=2;
	while(i<=n/2) {
		if(n%i==0) {
			System.out.print("not a prime no");
			break;
		}
		else if(i==n/2 && n%i!=0) {
			System.out.print("prime no ");
			}
		
		++i;
}}
}
