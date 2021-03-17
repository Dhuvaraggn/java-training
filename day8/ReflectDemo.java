package day8;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		Police p=new Police();
		Politician po=new Politician();
	//	Doctor doc=new Doctor();
		p.arrest(po);
	}
}
class Police{
	//public void arrest(Politician p) {
	//System.out.print(p.name);
	//p.doWork();
	//}
	
	public void arrest(Object o) throws Exception{
		//Politician pol=(Politician)o;
		//System.out.print(pol.name);
		Class c=o.getClass();
		Field f=c.getField("name");
		System.out.print(f.get(o));
		
		Method m=c.getMethod("doWork");
		m.invoke(o);
		
		//torture or Interrogation
		
		Field pf=c.getDeclaredField("secretName");
		//System.out.print(f.get(o));
		pf.setAccessible(true);
		//pf.set(o, "ajith is great");
		System.out.print(pf.get(o));
		
		Method pm=c.getDeclaredMethod("secretWork");
		pm.setAccessible(true);
		pm.invoke(o);
	}
}
class Politician
{
	public String name="good guy ajith";
	private String secretName="dhuvaraggn";
	public void doWork()
	{
		System.out.print("help people from proverty make the country progress");
	}
	private void secretWork() {
		System.out.print("cheat people and earn money");
	}
}
//class Doctor{
	//String name="good doctor";
//}
