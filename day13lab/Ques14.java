package day13lab;
 import java.util.*; 
public class Ques14 {
	public static void main(String[] args) { 
		TreeMap<String, String> myMap = new TreeMap<String, String>(); 
			myMap.put("a", "apple"); 
			myMap.put("d", "date"); 
			myMap.put("f", "fig"); 
			myMap.put("p", "pear");
			System.out.println(myMap);
			System.out.println("1st after mango: " + // sop 1		//this print p
			myMap.higherKey("f"));
			System.out.println(myMap);
			System.out.println("1st after mango: " + // sop 2
			myMap.ceilingKey("d"));
			System.out.println(myMap);
			System.out.println("1st after mango: " + // sop 3
			myMap.floorKey("f"));
			System.out.println(myMap);
			
			SortedMap<String, String> sub = new TreeMap<String, String>();
			sub = myMap.tailMap("f"); 
			System.out.println(myMap);
			System.out.println("1st after mango: " + // sop 4
			sub.firstKey());}
}

