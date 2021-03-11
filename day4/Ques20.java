package day4;

public class Ques20 {
	public static void main(String[] args)
	{
	int n[][]=new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	int ans[]=new int[3];
	for(int i=0;i<n.length;i++) {
		int g=0;
		for(int j=0;j<n[i].length;j++) {
			if(g<n[i][j]) {
				g=n[i][j];
			}
		}
			ans[i]=g;
		}
	
	
	for ( int k : ans) {
		System.out.print(k);
	}
}}
