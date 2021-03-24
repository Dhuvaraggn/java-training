package daythirteenlab;
import java.util.*;
public class Ques3 {
	public static void main(String [] args) {
		before();
	}
	public static void before() { 
		Set set = new TreeSet(); 
		set.add("2"); 
		set.add(3); 
		set.add("1"); 
		Iterator it = set.iterator(); 
		while (it.hasNext()) 
		System.out.print(it.next() + " "); }
	}

//Answer  The before() method will throw an exception at runtime 
