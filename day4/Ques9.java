package day4;

public class Ques9 {
public static void main(String[] arg) {
	int n[]=new int[] {1,2,3,4,5,6,7};
	int r[]=new int[7];
	int rl=n.length-1;
	for(int i=0;i<n.length;i++)
	{r[rl]=n[i];
	rl=rl-1;
	}
	for(int k:r) {
		System.out.print(k);
	}
}
}