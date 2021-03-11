package day4;

public class Ques28 {
	public static void main(String[] args) {
	Aa aobj=new Aa();
	aobj.display();
	Change chn=new Change();
	chn.chnInt(aobj.a);
	aobj.display();
	chn.chnFloat(aobj.b);
	aobj.display();
	chn.chnDouble(aobj.c);
	aobj.display();
	chn.chnChar(aobj.d);
	aobj.display();
	chn.chnStr(aobj);
	aobj.display();
	chn.chnArr(aobj);
	aobj.display();
	}
}	
	class Aa{
	int a=10;
	float b=0.1f;
	double c=0.1;
	char d='c';
	String s="ajthifdsj";
	int arr[]=new int[] {1,2,3,4,5};
	public void display() {
		System.out.print(a+"\n");
		System.out.print(b+"\n");
		System.out.print(c+"\n");
		System.out.print(d+"\n");
		System.out.print(s+"\n");
		for(int i:arr) {
		System.out.print(i+"\n");
	}
	}}
class Change{
	public void chnInt(int a) {
		a=0;
	}
	public void chnFloat(float b) {
		b=1.00f;
	}
	public void chnDouble(Double c) {
		c=10.0;
	}
	public void chnChar(char d) {
		d='z';
	}
	public void chnStr(Aa aobj) {
		aobj.s="ajith";
	}
	public void chnArr(Aa aobj) {
		aobj.arr[1]=100;
		aobj.arr[4]=999;
	}
	}
	

