package day5;

public class Fun15 {
	int a=0;
	public static void main(String [] arg) {
			System.out.print(operation(1,2));
			System.out.print(operation(1f,2f));
			
	}
	Fun15(){
		
	}
	Fun15(int a){
		this.a=a;
	}
	static public int operation(int a,int b) {
		return a+b;
	}
	static protected float operation(float a,float b) {
		return a*b;
	}
	
}
