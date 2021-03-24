package daythirteenlab;
import java.util.*;
public class Ques11 {
	public static void main(String [] args) {
		TreeSet<String> s = new TreeSet<String>(); 
		TreeSet<String> subs = new TreeSet<String>(); 	
		 s.add("a"); s.add("b"); s.add("c"); s.add("d"); s.add("e"); 
		 subs = (TreeSet)s.subSet("b", true, "d", true); 
		 System.out.print(subs);
		 s.add("g"); 
		 System.out.print(s.pollFirst()); 	//this removes the first ele
		 System.out.print(s.pollFirst()); 
		 s.add("c2");
		 System.out.print(subs);
		 System.out.println(s.size() +" "+ subs.size());
	}
}
