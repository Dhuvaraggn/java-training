package day4;

public class Ques7 {
	public static void main(String[] args) {
		int n[]=new int[] {11,2,18,1,5,3};
		for(int i=0;i<n.length;i++ ) {
			for(int j=0;j<n.length-1;j++) {
				if(n[j]>n[j+1]) {
					int temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}
		System.out.print("ascending order");
		for(int k:n) {
			System.out.print(k+"\t");
		}
		int nw[]=new int[] {11,2,18,1,5,3};
		for(int i=0;i<nw.length;i++ ) {
			for(int j=0;j<nw.length-1;j++) {
				if(nw[j]<nw[j+1]) {
					int temp=nw[j];
					nw[j]=nw[j+1];
					nw[j+1]=temp;
				}
			}
		}
		System.out.print("descending order");
		for(int k:nw) {
			System.out.print(k+"\t");
		}
	}
}
