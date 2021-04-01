package day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerDemo {
	ServerSocket ss;
	Socket s;
	public ServerDemo() throws Exception {
		System.out.print("server ready");
		ss=new ServerSocket(2000);
		List<Socket> sl=new ArrayList<>();
		ExecutorService es=Executors.newFixedThreadPool(10);

		while(true) {
			//System.out.print(s);

			s=ss.accept();
			if(sl.contains(s))
			{Thread t=Thread.currentThread();
			 t.run();
			}
			else
			{
			es.execute(()->{

			try {
				sl.add(s);
				while(true) {
			PrintWriter pr=new PrintWriter(s.getOutputStream(),true);
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter msg to sent to server : ");
			String st=in.readLine();
			pr.println(st);
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println("msg form client"+br.readLine());
			}
			}catch(Exception e) {
				
			}
			});
			es.shutdown();
			//BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			//System.out.print("msg from client"+br.readLine());
			}
			}
	}
	public static void main(String [] args) throws Exception {
		new ServerDemo();
	}
}
