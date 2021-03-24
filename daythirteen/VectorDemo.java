package daythirteen;

import java.util.*;

public class VectorDemo {
	public static void main(String [] args) {
	//Vector<String> v=new Vector<>(10,5);
	LinkedList<String> v=new LinkedList<>();
	v.add("ajith");
	v.add("raj");
	v.add("dar");
	Iterator<String> i=v.iterator();
	//v.add("sas");
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
	/*Enumeration<String> e=v.elements();
	v.add("sas");
	while(e.hasMoreElements()) {
		System.out.print(e.nextElement());
	}*/
	}
}
