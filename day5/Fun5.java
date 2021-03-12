package day5;

public class Fun5 {
	public static void main(String[] arg) {
		int cnt=0;
		for(int i=1;i<=4;i++) {
			for (int j=1;j<=4;j++) {
				for(int k=1;k<4;k++) {
					if(i!=j && k!=j && k!=i) {
						cnt++;
						System.out.print(i+" "+j+" "+k+"\n");
					}
				}
			}
		}
		System.out.print(cnt);
	}
}
