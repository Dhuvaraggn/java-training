package day5;
import java.util.*;
public class Fun9 {
	public static void main(String [] arg) {
		char c='b';
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.print("vowel");
			break;
		default:
			System.out.print("not vowel");
		}
		int s=5;
		int ch=s/4+1;
	//	System.out.print(ch);
		switch(ch) {
		case 1:
			System.out.print("Spring");
			break;
		case 2:
			System.out.print("summer");
			break;
		case 3:
			System.out.print("winter");
			break;
		case 4:
			System.out.print("rainy");
			break;
		}
		System.out.print("enter 1 to add 2 to sub 3 to mul 4 to div");
		Scanner si=new Scanner(System.in);
		int av=si.nextInt();
		int bv=si.nextInt();
		int co=si1
				.nextInt();
		
		switch(co) {
			case 1:
				System.out.print(av+bv);
				break;
			case 2:
				System.out.print(av-bv);
				break;
			case 3:
				System.out.print(av*bv);
				break;
			case 4:
				System.out.print(av/bv);
				break;
	}
}
}