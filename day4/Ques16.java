package day4;

public class Ques16 {
	public static void main(String[] args) {
		int n[]=new int[] {1,2,3,2,1,2,4,3,2,4,5,3,4};
		int s=2;
		int occurence=0;
		for(int k=0;k<n.length;k++) {
			if(n[k]==s) {
				occurence++;
				System.out.print(k);
			}
				
		}
		System.out.print("no of occurence of "+ s +" is "+occurence);
	}

}
