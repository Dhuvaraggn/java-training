package day12;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringDemo {
	public static void main(String [] args) {
		String s="ajith";
		String ss=new String("raj");
		
		StringJoiner joinstr=new StringJoiner(",");
		joinstr.setEmptyValue("it is a embpyt str");
		System.out.print(joinstr);
		
		joinstr.add("raj");
		joinstr.add("dar");
		System.out.print(joinstr);
		
		StringTokenizer st=new StringTokenizer(joinstr.toString(),",");
		while(st.hasMoreElements()) {
			System.out.print(st.nextToken());
		}
		
		joinstr=new StringJoiner(",","[","]");
		joinstr.add("ajith");
		joinstr.add("raj");
		System.out.print(joinstr);
		
		StringBuffer sbf=new StringBuffer(); //synchronized
		sbf.append("hello");
		System.out.print(sbf);
		StringBuilder sb=new StringBuilder(); //nonsync
		sb.append("hai");
		System.out.print(sb);
	}
}		
