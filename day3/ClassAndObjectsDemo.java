package day3;

public class ClassAndObjectsDemo {
	public static void main(String[] arg) {
	Employee obj;
	new Employee();
	Employee e=new Employee();
	e.setName("ajith");
	System.out.println(e.getName());
	e.met();
	e.met(10);
	}
}

class Employee{
	//Constructor or method overload
	public Employee() {
		System.out.println("constructor");
	}
	public Employee(String s) {
		System.out.println("parameteric constructor");
	}
	String name;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void met() {
	System.out.println("no parameter");
	}
	public void met(int a)
	{System.out.println("parameter");
	}
	}
	
