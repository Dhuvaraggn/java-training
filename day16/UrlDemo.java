package day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlDemo {
	public static void main(String [] args) throws Exception {
		URL url=new URL("https://www.google.com/index.html");
		URLConnection urlcon=url.openConnection();
		BufferedReader br=new BufferedReader(new InputStreamReader(urlcon.getInputStream()));	
		char c[]=new char[256];
		int i=0;
		File f=new File("google.html");
		FileWriter fw=new FileWriter("google.html");
		System.out.print(f.getPath());
		while((i=br.read(c))!=-1) {
			//System.out.print(new String(c,0,i));
			fw.write(c,0,i);
		}
		fw.close();
	}
}
