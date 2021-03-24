package daythirteenlab;
import java.util.*;  

public class Ques9 {
	public static void main(String[] args) { 
			Object o = new Object(); 
			// Set s = new HashSet();
			// TreeSet s = new TreeSet();   it won't run as treeset is comparable of 2 diff types
			LinkedHashSet s = new LinkedHashSet(); 
			s.add("o"); 
			s.add(o); 
			System.out.print(s);
 } 
 

}
