package day4;

public class Ques8 {
	public static void main(String[] arg) {
		int n[]=new int[] {1,2,3,4,5,6};
		
		int f=4;
		for(int i=0;i<n.length;i++) {
			if(n[i]==f) {
				System.out.print(i);
			}
		}
	}
}
