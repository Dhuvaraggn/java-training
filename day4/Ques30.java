package day4;
import java.util.*;
public class Ques30 {
	public static void main(String[] args) {
		int stack[]=new int[10];
		int top=-1;
		int ch=0;
		while(ch!=3) {
		System.out.print("enter 1 to push 2 to remove top");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		switch(ch)
		{
		case 1:
			System.out.print("enter value to push");
			int v=s.nextInt();
			if(top<10) {
				++top;
				stack[top]=v;
				
			}
			else {
				System.out.print("the stack is full");
			}
			
			break;
		case 2:
			if(top>-1) {
			System.out.print("the top"+ stack[top]+"is removed");
			top--;
			}
			else {
				System.out.print("No element to remove");
			}
			break;
		}
		}

	}
}
/*		Stack stack=new Stack(10);
		Stack top=stack;
		System.out.print("enter 1 to push enter 2 to delete");
	}
}

class Stack{
	int data;
	Stack next;
	public Stack(int a) {
		this.data=a;
		this.next=null;
	}
	void getData() {
		System.out.print(data);
	}
	
}*/