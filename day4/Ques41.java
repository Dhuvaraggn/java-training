package day4;

public class Ques41 {
	public static void main(String[] args) {
		House h=new House(1,2,3,4,5,6);
		System.out.print(h.wc);
		System.out.print(h.dc);
	}
}
class House{
	int wc;
	int dc;
	public House(int dw,int dh,int dc,int ww,int wh,int wc)
	{
		Door d=new Door(dw,dh,dc);
		this.dc=d.dcost();
		Window w =new Window(ww,wh,wc);
		this.wc=w.wcost();
	}
	
}
class Door{
	int w,h,c;
	int cost=10;
	public Door(int w,int h,int c) {
		this.w=w;this.h=h;this.c=c;
	}
	public int dcost() {
		int area=w*h;
		return cost*area*c;
	}
}
class Window{
	int w,h,c;
	int cost=15;
	public Window(int w,int h,int c) {
		this.w=w;this.h=h;this.c=c;
	}
	public int wcost()
	{int area=w*h;
	 return cost*area*c;
	}
	
}