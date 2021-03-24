package daythirteen;
import java.util.*;
public class SetDemo {
	public static void main(String [] args) {
		//Set<String> s=new HashSet<>();
		Set<String> s=new TreeSet<>();
		s.add("zzz");
		s.add("aaa");	
		s.add("bbb");
		System.out.print(s);
		
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.print(i.next());
		}
		
		Set<Student> s1=new TreeSet<Student>((Student so,Student s1o)->{return so.compareTo(s1o);});
		s1.add(new Student(450));
		s1.add(new Student(2334));
		s1.add(new Student(111));
		s1.add(new Student(55));
		System.out.print(s1);
	}
}
class Student implements Comparable<Student>{
	Integer marks;
	public Student(Integer m) {
		this.marks=m;
	}
	@Override
	public int compareTo(Student o) {
		return marks.compareTo(o.marks);
	}
	public String toString()
	{
		return ""+this.marks;
	}
}
