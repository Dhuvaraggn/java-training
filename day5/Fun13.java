package day5;

public class Fun13 {
public static void main(String args[])
{
	int a[]=new int[] {1,2,3,4,5};
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]);
	}
	int g=0;
	for(int k:a) {
		if(k>g) {
			g=k;
		}
	}
	System.out.print("greater"+g);
	int l=g;
	for(int k:a) {
		if(k<l) {
			l=k;
		}
	}
	System.out.print("lowest"+l);
	int b[]=new int[] {6,7,8,9,10};
	for(int i=0;i<a.length;i++) {
		a[i]=a[i]+b[i];
		b[i]=a[i]-b[i];
		a[i]=a[i]-b[i];
	}
	for(int j:a) {
		System.out.print(j);
	}
	for(int k:b) {
		System.out.print(k);
	}
}
}