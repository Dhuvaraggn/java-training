package day14;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class WeakHashDemo {

	public static void main(String [] args) {
		Emp e1=new Emp();
		Emp e2=new Emp();
		Emp e3=new Emp();
		Map<Emp,String> wm=new WeakHashMap<Emp,String>();
		wm.put(e1, "ajti");
		
		wm.put(e2, "raj");
		wm.put(e3,"dar");
		System.out.print(wm);
		Set<Map.Entry<Emp,String>> s=wm.entrySet();
		Iterator<Map.Entry<Emp,String>> i=s.iterator();
		while(i.hasNext()) {
			Map.Entry<Emp, String> me=i.next();
			System.out.print(me.getValue()+" "+me.getKey());
		}
		e2=null;
		System.out.print(wm);
		System.gc();
		System.out.print(wm);
	}
}
class Emp
{
	int e;
}