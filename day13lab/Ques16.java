package day13lab;
import java.util.*;
public class Ques16 {
	public static void main(String[] args) { 
		String[] s = {"map", "pen", "marble", "key"};
		Othello o = new Othello(); 
		//Arrays.sort(s); 

		for(String s2: s) 
			System.out.print(s2 + " "); 			
		System.out.println(Arrays.binarySearch(s, "map"));
		}
	static class Othello implements Comparator<String> { 
		public int compare(String a, String b) { return b.compareTo(a); } 
	}
	}
	


/*public class Ques16 {
	public static void main(String [] args) {
		//answer java.util.HashSet 
		/* java.util.LinkedHashSet
		 java.util.List
		  java.util.ArrayList 
		  java.util.PriorityQueue
	*/
		
*/
