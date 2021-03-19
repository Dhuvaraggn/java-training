package day9;
import java.lang.reflect.*;
public class TryDemo2 {
	public static void main(String [] args) throws Exception{			//checked exception
		String s="Hello ajith";
		boolean yes=true;
		String name="str";
		Field f[]=s.getClass().getFields();
		for(Field fi:f) {
			if(fi.getName().equals(name)) {
				yes=false;
			}
		}
		if(yes) {
			try {
			Field fn=s.getClass().getField("name");}
			catch(Exception e) {
				System.out.print(e);
			}
		}
		else
		{
			System.out.print("field is not there");
		}
	}
}
