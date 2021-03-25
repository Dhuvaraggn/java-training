package day12;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinDemo {
	public static void main(String [] args)
	{
		String s[]= {"ajth","trichy","raj","ajith","ajith","rj","dar","ajith","ajit","daru"};
		int count=0;
		for(String st:s) {
			if(st.equalsIgnoreCase("ajith")) {
				count++;
			}
		}
		System.out.print(count);
		ForkJoinPool fjp=ForkJoinPool.commonPool();
		MyTask t1=new MyTask(s,0,3,"ajith");
		MyTask t2=new MyTask(s,3,5,"ajith");
		MyTask t3=new MyTask(s,5,7,"ajith");
		MyTask t4=new MyTask(s,7,10,"ajith");
		
		int r1=fjp.invoke(t1);
		int r2=fjp.invoke(t2);
		int r3=fjp.invoke(t3);
		int r4=fjp.invoke(t4);
		System.out.print("\n"+(r1+r2+r3+r4));
		
	}
}
class MyTask extends RecursiveTask<Integer>{

	String s[];
	int start,end;
	String f;
	public MyTask(String s[],int start,int end,String f) {
		this.s=s;
		this.start=start;
		this.end=end;
		this.f=f;
	}
	@Override
	protected Integer compute() {
		int count=0;
		for(int i=start;i<end;i++) {
			if(s[i].equalsIgnoreCase(f)) {
				count++;
			}
		}
		return count;
	}
	
	
	
}
