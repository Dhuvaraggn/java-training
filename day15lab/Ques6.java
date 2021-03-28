package day15lab;
import java.io.*;
public class Ques6 {
	public static void main(String [] args) throws Exception{
		String s1="ajith raj got 75 % cgpa in his & = 8sem";
		String s="99% is  &approx; equal to 100   but this is &approx not;";
		byte b[]=s.getBytes();
		ByteArrayInputStream in=new ByteArrayInputStream(b);
		BufferedInputStream bin=new BufferedInputStream(in);
		int c;
		
		char a=247;
		boolean marked=false;
		while((c=bin.read())!=-1){
			switch(c) {
			case '&':
				if(!marked) {
					bin.mark(32);
					marked=true;
				}
				else {
					marked=false;
					
				}
				break;
			case ';':
				if(marked)
				{
					marked=false;
					System.out.print(a);
				}
				else
				{	System.out.print((char)c);
				}
				break;
			case ' ':
				if(marked)
				{
					marked=false;
					bin.reset();
					System.out.print("&");
				}
				else
				{System.out.print((char)c);
				}
				break;
			default:
				if(!marked) {
					System.out.print((char)c);
				}
				break;
			}
		}
		
	}
}
