package day15lab;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Ques5 {
	public static void main(String [] args) throws Exception {
		String temp="abcdef";
		byte b[]=temp.getBytes();
		ByteArrayInputStream in1=new ByteArrayInputStream(b);
		ByteArrayInputStream in2=new ByteArrayInputStream(b,0,3);
		int c;
		for(int i=0;i<2;i++) {
			while((c=in1.read())!=-1)
			{
				if(i==0) {
					System.out.print((char)c);
				}
				else
				{	
					System.out.print(Character.toUpperCase((char)c));
					
				}
		
			}
			in1.reset();
		}
		
		ByteArrayOutputStream f=new ByteArrayOutputStream();
		String s="hello world";
		byte bi[]=s.getBytes();
		f.write(bi);
		byte bout[]=f.toByteArray();
		for(int i=0;i<bout.length;i++)
		{
			System.out.print((char)bout[i]);
		}
	}
}
