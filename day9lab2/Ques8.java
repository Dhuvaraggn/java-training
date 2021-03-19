package day9lab2;

import java.util.Scanner;

public class Ques8 {
	public static void main(String [] arg) {
		String n="y";	
		Scanner s=new Scanner(System.in);
		String d;
		
		System.out.print("enter num and deno:");

		n=s.next();
		d=s.next();
		while((n!="q") || (n!="Q")) {
			try
			{
				System.out.print(Integer.parseInt(n)/Integer.parseInt(d));
				System.out.print("enter num and deno:");
				n=s.next();
				d=s.next();
			}
			catch(Exception e) {
				System.out.print(e);
			}
			
		}
	}
}
