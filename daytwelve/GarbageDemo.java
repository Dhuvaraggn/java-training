package daytwelve;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class GarbageDemo {
	public static void main(String [] args)
	{
		Runtime r=Runtime.getRuntime();
		System.out.print(r.freeMemory()+"\n");
		Gfather tatha=new Gfather();
		System.out.print(r.freeMemory()+"\n");
		
	//	tatha=null;			//object will still live inmem
		//System.out.print(r.freeMemory()+"\n");
//		System.out.print(tatha.location+"\n");
		
		WeakReference wr=new WeakReference(tatha); //it will certify object for garbage Collection
		System.out.print(r.freeMemory()+"\n");
		System.out.print(tatha.location+"\n");
		
	//	SoftReference sr=new SoftReference(tatha); //this is just for asssign on particular time
	//	System.out.print(r.freeMemory()+"\n");
	//	System.out.print(tatha.location+"\n");
		
		r.gc(); /// garbage collection

//		System.out.print(tatha.location+"\n");
		
	//	tatha=(Gfather)sr.get();
	//System.out.print(tatha.location+"\n");
		System.out.print(r.freeMemory()+"\n");
		
	}
}

class Gfather{
	String name;
	String location="india";
	Gfather()
	{
		for(int i=0;i<10000;i++) {
			name=new String("......"+i);
		}
	}
	@Override
	public void finalize() throws Throwable{
		System.out.print("finalize method called");
	}
}
