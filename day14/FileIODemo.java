package day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIODemo {
	public static void main(String [] args) throws Exception {
		FileInputStream fin=new FileInputStream("abc.properties");
		FileOutputStream fos=new FileOutputStream("copyabc.properties",true);
		//System.out.print(fin.available());
		byte b[]=new byte[fin.available()];
		int i=0;
		while((i=fin.read(b))!=-1) {
			String s=new String(b,0,i);
			System.out.println(s);
			fos.write(b,0,i);
		}
		FileInputStream fin1=new FileInputStream("copyabc.properties");
		fin1.read(b);
		System.out.println("fin1"+new String(b,0,8));
		/*FileWriter fw=new FileWriter("copyabc.properties");
		FileReader fr=new FileReader("abc.properties");
		char c[]=new char[8];
		fr.read(c);
		System.out.println(c);
		fw.write(c);
		fw.close();
		FileReader fr1=new FileReader("copyabc.properties");
		
		fr1.read(c);
		System.out.println(c);
		*/
		try(FileWriter fw=new FileWriter("copyabc.properties");
		FileReader fr=new FileReader("abc.properties");
				){
		char c[]=new char[8];
		fr.read(c);
		System.out.println("trywithresource block we don't need to add close it will autoclose");
		System.out.println(c);
		fw.write(c);
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
}
