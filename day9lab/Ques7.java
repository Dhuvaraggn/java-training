package day9lab;
import day9labQues7Vehicle.*;
public class Ques7 {
	public static void main(String [] args) {
		car c=new car();
		c.method();
	}
}

class car extends fourwheeler{
	public car() {
		System.out.print("car cons called");
	}
}