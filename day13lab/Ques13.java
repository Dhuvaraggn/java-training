package day13lab;
import java.util.*; 
class Turtle { 
	int size; 
	public Turtle(int s) { size = s; } 
	public boolean equals(Object o) {
		return (this.size == ((Turtle)o).size); }
	 //public int hashCode() { return size/5; }  
	 // no hashCode method declared 

 }


public class Ques13 {
	public static void main(String[] args) { 
		LinkedHashSet<Turtle> t = new LinkedHashSet<Turtle>(); 
		t.add(new Turtle(1)); t.add(new Turtle(2)); t.add(new Turtle(1));
	
		System.out.println(t.size()); 
	}
}
// answer 1 inserted meanns 2 is answer 2 inserved meand 3 is output
