package day4;

public class Ques19 {
	public static void main(String[] args) {
		int n[][]=new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int r[][]=new int[3][4];
		for(int i=0;i<n.length;i++) {
			int k=n[i].length-1;
			for(int j=0;j<n[i].length;j++) {
				r[i][k]=n[i][j];
				k--;
			}
		}
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				System.out.print(r[i][j]+"\n");
			}
		}
	}

}
