package day15lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableDemo {
	public static void main(String [] args) throws Exception {
		FileOutputStream fo=new FileOutputStream("emp.dat");
		ObjectOutputStream oop=new ObjectOutputStream(fo);
		Employee ob;
		for(int i=0;i<10;i++)
		{
			ob=new Employee();
			ob.setEmpid(1000+i);
			oop.writeObject(ob);
		}
		FileInputStream fi=new FileInputStream("emp.dat");
		ObjectInputStream ip=new ObjectInputStream(fi);
		try {
		while((ob=(Employee) ip.readObject())!=null) {
			ob.print();
		}}catch(Exception e) {}
		
	}
}
class Employee implements Serializable
{
	int empid;

	public final int getEmpid() {
		return empid;
	}

	public final void setEmpid(int empid) {
		this.empid = empid;
	}
	void print()
	{
		System.out.print("emp"+this.empid);
	}
}