package day5;

public class Fun12 {
	public static void main(String[] arg) {
		int n=6;
		int f=0;
		int s[]=new int[n];
		s[0]=f;s[1]=1;
		int t=2;
		while(t<n) {
			s[t]=s[t-1]+s[t-2];
			t++;
		}
		for(int j:s) {
			System.out.print(j);
		}
		
		do {
			f++;
			System.out.print(f+"*"+n+"="+f*n+"\n");
		}while(f<=10);
		f=1;
		for(int j=1;j<=4;j++) {
			for(int k=0;k<j;k++) {
				System.out.print(f);
				++f;
			}
			System.out.print("\n");
		}
		
		for(int j=1;j<=4;j++) {
			for(int k=0;k<j;k++) {
				System.out.print("0");
				++f;
			}
			System.out.print("\n");
		}}
	}


