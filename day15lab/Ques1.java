package day15lab;

import java.io.File;

public class Ques1 {
	static void p(String s) {
		System.out.println(s);
		}
		public static void main(String args[]){
		File f1=new File("abc.txt");
		System.out.print(f1.canRead());
		p("file name :"+f1.getName());
		File f2=new File("ajith.txt");
		f1.renameTo(f2);
		p("file name :"+f1.getName());
		p("path :"+f1.getPath());
		p(f1.exists() ? "exists":"does not exist");
		p(f1.canWrite() ? "is writable":"is not writable");
		p(f1.isDirectory() ?" is a dir":"is not a directory");
		f1.delete();
		}

}
