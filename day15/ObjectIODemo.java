package day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectIODemo {
	public static void main(String [] args) throws Exception {
		ObjectOutputStream oop=new ObjectOutputStream(new FileOutputStream("abc.dat"));
		Employee e1=new Employee(1000);
		System.out.print(e1.salary);
		oop.writeObject(e1);
		e1.setSalary(2000);
		System.out.print(e1.salary);
		ObjectInputStream oip=new ObjectInputStream(new FileInputStream("abc.dat"));
		Employee e2=(Employee)oip.readObject();
		System.out.print(e2.salary);
	}
}	
class Employee implements Serializable
{	transient int salary;// this won't save or allow to save
	//int salary;
	public Employee(int s)
	{
		this.salary=s;
	}
	public final int getSalary() {
		return salary;
	}
	public final void setSalary(int salary) {
		this.salary = salary;
	}
}
