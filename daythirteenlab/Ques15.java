package daythirteenlab;
import java.util.*; 
	class Dog implements Comparable<Dog>
 	{ Integer size; 
	Dog(Integer s)
	{ size = s; }

	@Override
	public int compareTo(Dog o) {

		return o.size.compareTo(size);
	} }
	public class Ques15{ 
		public static void main(String[] args) {
			TreeSet<Integer> i = new TreeSet<Integer>();
			TreeSet<Dog> d = new TreeSet<Dog>();
			d.add(new Dog(1)); d.add(new Dog(2)); d.add(new Dog(1));
			i.add(1); i.add(2); i.add(1); 	
			System.out.println(d.size() + " " + i.size()); 
		}
	}

// 2 2