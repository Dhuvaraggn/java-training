package day15lab;

import java.io.File;

public class Ques2 {
	public static void main(String args[]) {
		String dirname="src";
		File f1=new File(dirname);
		if(f1.isDirectory()) {
			String s[]=f1.list();
			for(int i=0;i<s.length;i++) {
				System.out.println(s[i]);
			}
		}
	}
}
