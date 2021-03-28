package day15lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ques4 {
	public static void main(String[] args) throws Exception {
		final int eof=-1;
		byte[] b=new byte[8];
		FileInputStream in=new FileInputStream("abc.txt");
		FileOutputStream out=new FileOutputStream("ajith.txt");
		
		int i;
		while((i=in.read(b))!=eof)
		{	
			out.write(b);
		}
	}
}
