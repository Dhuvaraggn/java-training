package day3;

public class AccessDemo {
	public int pub;
	private int pri;
	protected int pro;
	int nomod;

	public void display() {
		System.out.print(pub);
		System.out.print(pri);
		System.out.print(pro);
		System.out.print(nomod);
	}
}
 class AccessDemoSub extends AccessDemo{
	 public void display() {
			System.out.print(pub);
			//System.out.print(pri);
			System.out.print(pro);
			System.out.print(nomod);
		}
}
 class AccessDemoNoSub{
	 AccessDemo obj = new AccessDemo();
	 public void display() {
			System.out.print(obj.pub);
			//System.out.print(obj.pri);
			System.out.print(obj.pro);
			System.out.print(obj.nomod);
		}
	 
 }