package day9;

public class TryDemo {
	public static void main(String[] args) {
		try {
		int i=1/Integer.parseInt("0");
		}
		catch(ArithmeticException e) {
			System.out.print(e);
		}
		catch(NumberFormatException ne) {
			System.out.print(ne);
		}
		System.out.print("end");
	}
}
