package daythirteen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class CollectionDemo {
	public static void main(String [] args) {
		List l=new ArrayList();
		l.add("ajith");
		l.add(21);
		l.add(new Integer(10));
		l.add('c');
		l.add(new Ajith());
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		for(Object o:l) {
			System.out.println(o);
		}
		System.out.println("****************************");
		Iterator i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.print(l.contains("ajith"));
		l.remove(0);
		System.out.print(l.contains("ajith"));
		List l1=l.subList(1, 2);
		System.out.print(l1);

		System.out.println("****************************");
		List<String> l2=new ArrayList<>();
		l2.add("ajith");
		l2.add("raj");
		l2.add("dar");
		//l2.add(new Ajith());
		
		l2.sort(new MyComparator());
		System.out.print(l2);
		l2.sort((String o1,String o2)->{return o2.compareTo(o1);});
		System.out.print(l2);
		System.out.println("****************************");
		//System.out.print(i.next());
		ListIterator li=l.listIterator();
		while(li.hasNext()){
			System.out.print(li.next());
		}
		while(li.hasPrevious()) {
			System.out.print(li.previous());
		}

		System.out.println("****************************");
		Stream s=l.stream();
		System.out.print(s.count());
	}
}
class MyComparator implements Comparator<String>{


	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
	
}
class Ajith{
	
}