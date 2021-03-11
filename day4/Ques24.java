package day4;

public class Ques24 {
	public static void main(String[] args) {
		Quadratic q=new Quadratic(2,3,4);
		q.getVal();
		System.out.print(q.compute(1));
		q.setVal(10, 110, 190);
		q.getVal();
		System.out.print(q.compute(0.1f));
		
	}
}

class Quadratic{
	int a;
	int b;
	int c;
	public Quadratic(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public Quadratic(){
		a=1;b=1;c=1;
	}
	public void getVal() {
		System.out.print(this.a);
		System.out.print(this.b);
		System.out.print(this.c);
	}
	public void setVal(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	public float compute(float x)
	{
		return a*x*x+b*x+c;
	}
}