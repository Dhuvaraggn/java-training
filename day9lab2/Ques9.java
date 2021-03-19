package day9lab2;

import java.util.Scanner;

import day3.scope;

public class Ques9 {
	public static void main(String [] args)
	{
		int s[]=new int[5];
		int q=1;
		Scanner sc=new Scanner(System.in);
		while(q!=0) {
			System.out.print("enter the student marks");
			
			for(int i=0;i<5;i++) {
				try {
				s[i]=sc.nextInt();
				if((s[i]<0 )||( s[i]>100)) {
					i--;
					throw new NumberException();
				}
				}
				catch(Exception e) {
					System.out.print(e);
				}
			}
			int sum=0;
			for(int i:s) {
				sum+=i;
			}
			System.out.print(sum/5);
			System.out.print("enter 0 to quit");
			q=sc.nextInt();
	}
}
}
class NumberException extends Exception
{
	public NumberException() {
		System.out.print("number should be bw 1 and 100");
	}
}
