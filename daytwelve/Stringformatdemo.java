package daytwelve;

public class Stringformatdemo {
	public static void main(String [] args) {
		System.out.printf("%d has a name %s \n",20,"ajith");
		System.out.printf("%-20s%-20s%-20s","col1","col2","col3");
		met(10,20,30,40);
	}
	public static void met(int... i) {
		for(int j:i) {
			System.out.print(j);
		}
	}
}
