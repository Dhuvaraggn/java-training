package day15lab;

import java.io.File;
import java.io.FilenameFilter;
class onlyext implements FilenameFilter
{
	String ext;
	public onlyext(String e) {
		ext="."+e;
	}
	public boolean accept(File dir,String name) {
		return name.endsWith(ext);
	}
}
public class Ques3 {
	public static void main(String []args) {
		String dirname="src";
		File f1=new File(dirname);
		FilenameFilter only=new onlyext("properties");
		String s[]=f1.list(only);
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]);
		}
	}
}
