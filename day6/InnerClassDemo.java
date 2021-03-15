package day6;

public class InnerClassDemo {
	public static void main(String[] args) {
		//Cola cola=new CampoCola();
		//Cola cola=new Kalimark().new CampoCola(); //calling inner class
		
		Pepsi p=new Pepsi();
		Kalimark k=new Kalimark();
		
		//k.setCola(cola);
		//p.setCola(cola);
		//k.setCola(cola);
		k.sellKalimarkCola();
		p.sellPepsiCola();
	}
}
/*abstract class Cola{
	public abstract void makeCola();
}
*/
interface Cola
{
	public void makeCola();
}
//class CampoCola extends Cola{
	//public void makeCola()
	//{System.out.print("the campocola is create");
	//}
//}
class Pepsi
{
	Cola cola;
	public void setCola(Cola cola) {
		this.cola=cola;
	}
	public void sellPepsiCola() {
		cola.makeCola();
		System.out.print("pepsi cola is created");
	}
}
class Kalimark{
	Cola cola;
	public void setCola(Cola cola) {
		this.cola=cola;
	}
	public static void makeBovontaCola()
	{
		System.out.print("method reference function is called");
	}
	public void sellKalimarkCola() {
		//class CampoCola extends Cola{
	//		@Override				//method Inner class public 
	//		public void makeCola()
	//		{System.out.print("the campocola is created inside a methods");
		//	}
		//}
		
	/*	new Cola() {  //ANONYMOUS INNER CALLSS 1
			@Override
			public void makeCola() {
				System.out.print("anonymous inner class is called");
			}
		}.makeCola(); 
	*/	
		
		//Cola cola=Kalimark::makeBovontaCola; 	//method refrencing  2
		
		Cola cola=()->{System.out.print("lambda inner calss caslled");
		};																//Lambda inner class 3
		
		
		//setCola(new CampoCola()); // TO CALL METHOD INNER CLASS
		 	cola.makeCola();
		
		System.out.print("kalimark cola is created" );
	}
/*	class CampoCola extends Cola{
		@Override//Inner class public 
		public void makeCola()
		{System.out.print("the campocola is create");
		}
	}*/
}