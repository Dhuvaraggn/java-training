package day4;

public class ArrayDemo {
	public static void main(String[] args) {
	int a[]=new int[5];
	for(int i:a) {
		System.out.println(i);
	}
	int arr[]= {1,2,3,4,5};
	for(int j:arr) {
		System.out.println(j);
	}
	int copy[]=new int[5];
	System.arraycopy(arr, 0, copy, 0, arr.length);
	ArrayDemo ar=new ArrayDemo();
	ar.setArray(copy);
	for(int k:copy) {
		System.out.print(k);
	}
	}
	public void setArray(int[] i) {
		i[0]=100;
		i[4]=99;
	}

}
