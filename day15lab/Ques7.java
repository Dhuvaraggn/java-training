package day15lab;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class Ques7 {
	public static void main(String [] args) throws Exception {
		ByteArrayInputStream bin=new ByteArrayInputStream("sajiht".getBytes());
		PushbackInputStream pis=new PushbackInputStream(bin);
		int ch=0;
		while((ch=pis.read())!=-1) {
			if((char)ch=='s')
				pis.unread('S');
			else
				System.out.print((char)ch);
		}
	}
}
