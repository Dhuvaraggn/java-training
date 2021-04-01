package day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PipedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientDemo {
	public ClientDemo() throws Exception
	{	while(true) {
		Socket s=new Socket("localhost",2000);
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		char c[]=new char[256];int i=0;
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("msg fro mserver:  "+br.readLine());
		System.out.print("\nenter msg to sent to server: ");
		String st=in.readLine();
		PrintWriter pr=new PrintWriter(s.getOutputStream(),true);
		pr.println(st);
	}
	}
	public static void main(String [] args)  throws Exception{
		new ClientDemo();
	}
}
