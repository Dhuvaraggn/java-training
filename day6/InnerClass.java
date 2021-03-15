package day6;

public class InnerClass {
	public static void main(String [] arg) {
		//Cola1 cola=new Campocola();
		Cola1 cola=new Kalimark1().new Campocola();
		
		Pepsi1 p=new Pepsi1();
		Kalimark1 k =new Kalimark1();
		
		Cola1 coladup=new Kalimark1().trojan();
		p.setCola(coladup);
		//p.setCola(cola);
		k.setCola(cola);
		k.sellKalimarkCola();
		p.sellPepsiCola();
	}
}
abstract class Cola1{
	public abstract void makeCola();
}
//class Campocola extends Cola1
//{
//	public void makeCola() {
//		System.out.print("Campacola is made" );
//	}
//}
class Pepsi1
{
	Cola1 cola;
	public void setCola(Cola1 cola) {
		this.cola=cola;
	}
	public void sellPepsiCola() {
		cola.makeCola();
		System.out.print("pepsi cola is created");
	}
}
class Kalimark1
{
	Cola1 cola;
	public void setCola(Cola1 cola)
	{this.cola=cola;
		}
	public void sellKalimarkCola()
	{ cola.makeCola();
		System.out.print("kalimark Cola is created");
		}
	class Campocola extends Cola1
	{
		public void makeCola() {
			System.out.print("Campacola is made in inner class" );
		}
	}
	public Cola1 trojan() {
		return new Campocola();
	}
}