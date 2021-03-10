package day2;
import day3.AccessDemo;
public class AccessDemoDiffPackSub extends AccessDemo {
	public void display() {
		System.out.print(pub);
		//System.out.print(pri);
		System.out.print(pro);
		//System.out.print(nomod);
	}
}
class AccessDemoDiffPackNoSub {
	AccessDemo obj= new AccessDemo();
	public void display() {
		System.out.print(obj.pub);
		//System.out.print(obj.pri);
		//System.out.print(obj.pro);
		//System.out.print(obj.nomod);
	}
}