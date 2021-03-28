package day15lab;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.io.StringBufferInputStream;

public class Ques8 {
	public static void main(String [] args) throws Throwable {
		ByteArrayInputStream bis=new ByteArrayInputStream("Ajithraj".getBytes());
		StringBufferInputStream sbis=new StringBufferInputStream("Information");
		SequenceInputStream sis=new SequenceInputStream(bis,sbis);
		int ch;
		while((ch=sis.read())!=-1)
		{
			System.out.print((char)ch);
		}
	}
}
