package day13lab;
import java.util.PriorityQueue;
public class Ques10 {
	public static void main(String []args) {
		PriorityQueue<String> pq = new PriorityQueue<String>(); 
		pq.add("2");
		pq.add("4"); 
		System.out.print(pq.peek() + " ");
		//System.out.print(pq);
		pq.offer("1"); 
		System.out.print(pq);
		pq.add("3");

		System.out.print(pq);	
		pq.remove("1"); 
		System.out.print(pq);
		System.out.print(pq.poll() + " "); //this remvoes first
		System.out.print(pq);
		if(pq.remove("2")) 

			System.out.print(pq);
			System.out.print(pq.poll() + " "); 

			System.out.print(pq);
		System.out.println(pq.poll() + " " + pq.peek());
	}
}
//answe 2 2 3 4