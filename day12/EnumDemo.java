package day12;

public class EnumDemo {
	public static void main(String [] args) {
		Cars c;
		c=Cars.audi;
		met(c);
		c.prize=1000;
		Cars cc[]=c.values();
		for(Cars ci:cc) {
			System.out.print(ci+"prize is"+ci.getPrize()+"\n");
		}
		
		
	}
	public static void met(Cars c) {
		switch(c) {
		case maruthi:
			System.out.print("maruthi car ...\n");
			break;
		case audi:
			System.out.print("audic arsfjsflsfjlf \n");
			break;
		}
	}
}
enum Cars
{
	maruthi(100),suzuki,audi,benz;
	int prize;
	Cars()
	{
		System.out.print("cons called...\n");
	}
	Cars(int p){
		System.out.print(this+" car prize is "+p);
		this.prize=p;
	}
	public int getPrize()
	{
		return this.prize;
	}
}