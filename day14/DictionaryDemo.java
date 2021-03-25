package day14;

import java.util.Locale;
import java.util.ResourceBundle;

public class DictionaryDemo {
	public static void main(String [] args) {
		Locale l=Locale.getDefault();
		System.out.println(l);
		Locale.setDefault(new Locale("te"));		// this represnt the lang ta tamil te telugu
		System.out.println(Locale.getDefault());
		ResourceBundle rb=ResourceBundle.getBundle("dictionary",Locale.getDefault()); //this will retrieve file with dict as prefix with locale as suffix
		System.out.println(rb.getString("username"));
		ResourceBundle rb1=ResourceBundle.getBundle("Dictionary",Locale.getDefault());
		System.out.print(rb1.getString("username"));
	}
}
