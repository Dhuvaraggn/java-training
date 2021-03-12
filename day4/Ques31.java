package day4;

public class Ques31 {
public static void main(String[] args) {
	for(int i=0;i<10;i++) {
		Created c=new Created();
	}
}
}

class Created{
	static int count=0;
	public Created() {
		addCount();
	}
	void addCount() {
		this.count++;
		System.out.print(count);
	}
}