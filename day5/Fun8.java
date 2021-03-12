package day5;

public class Fun8 {
	public static void main(String[] args) {
		int r=1;
		int h=1;
		System.out.print(Math.PI*Math.pow(r, 2)+2*Math.PI*r*h);
		square s=new square(4);
		Rect re=new Rect(2,3);
		System.out.print(s.area()+" "+s.perimeter());		
		System.out.print(re.area()+" "+re.perimeter());

	}
}
class square {
	int l;
	public square(int l) {
		this.l=l;
	}
	public int area() {
		return l*l;
	}
	public int perimeter() {
		return 4*(l);
	}
}
class Rect{
	int l;
	int b;
	public Rect(int l,int b) {
		this.l=l;
		this.b=b;
	}
	public int area() {
		return l*b;
	}
	public int perimeter() {
		return 2*(l+b);
	}
}