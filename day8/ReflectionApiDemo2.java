package day8;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class ReflectionApiDemo2 {
	public static void main(String[] args) throws Exception{
		Demo d=(Demo)Class.forName("day8.Demo").getConstructor().newInstance();
		
		Demo d1=(Demo)Class.forName("day8.Demo").getConstructor(String.class).newInstance("ajith");
		
		Method ma[]=d.getClass().getMethods();
		for(Method m:ma) {
			System.out.print(m.getName()+"\n");
		}
		Field fa[]=d1.getClass().getFields();
		for(Field f:fa) {
			System.out.print(f.getName()+"\n");
		}
		
		//Method testMethod=d.getClass().getMethod("test",new Class[] {String.class,Integer.class});
		//result=(String) testMethod.invoke(d, new Object[] {"ramu",Integer.valueOf(20)})
		
		Method m=d.getClass().getMethod("Demomethod", String.class,int.class);
		String s=(String)m.invoke(d,"dar",21);
		System.out.print(s);
		
		Method parentm=d.getClass().getSuperclass().getMethod("parentd");
		parentm.invoke(d);	
		
		Method pmarg=d1.getClass().getSuperclass().getDeclaredMethod("pmethod", String.class,int.class);
		pmarg.setAccessible(true);
		String st=(String)pmarg.invoke(d1, "ajtih",1);
		System.out.print(st);
	}
}
class Parent{
	public void parentd() {
		System.out.print("parent Method caleds");
	}
	private String pmethod(String s,int i) {
		return "the string "+s+" intege "+i;
	}
}
class Demo extends Parent{
	public String name,colg,decs;
	public Demo() {
		System.out.print("demo cons called ");
	}
	public Demo(String s) {
		System.out.print("demo with string "+s);
	}
	public String Demomethod(String s,int i) {
		return "Demo with name "+s+" age is"+ i;
	}
	
}