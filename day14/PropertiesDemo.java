package day14;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String [] args) throws Exception {
		Properties p=new Properties();
		p.load(new FileInputStream("abc.properties"));
		/*p.put("key1", "value 1");
		p.put("key2", "value 2");
		p.put("key3", "value 3");
		*/
		Enumeration e=p.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
