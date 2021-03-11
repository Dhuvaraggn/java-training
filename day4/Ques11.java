package day4;

public class Ques11 {
	public static void main(String[] args) {
		int n[][]=new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		for(int i=0;i<n.length;i++)
		{
			for(int j=0;j<i+1;j++) {
			System.out.print(n[i][j]+"\t")	;
			}
			System.out.print("\n");
			}
		}

}
