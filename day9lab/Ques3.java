package day9lab;

public class Ques3 {
	public static void main(String [] args)
	
	{
		stack s=new FixedStack();
		s.push(5);
		s.push(10);
		s.push(3);
		s.pop();
		s.pop();
		stack s1=new DynamicStack(1);
		s1.push(10);
		s1.push(11);
		}
}
interface stack
{
	public void push(int i);
	public void pop();
}
class DynamicStack implements stack
{
	int top;
	int data[];
	int size;
	public DynamicStack(int i) {
		top=-1;
		size=i;
		data=new int[i];
	}
	
	@Override
	
	public void push(int i) {
		if(top==size-1) {
			System.out.print("no space to push");
		}
		
		else {
			top++;
		data[top]=i;
		
		}
	}

	@Override
	public void pop() {
		if(top==-1)
		{System.out.print("no element empty stack");
		}
		else
		{System.out.print(data[top]);
		top--;
		}
		}
	}
class FixedStack implements stack
{
	int top;
	int data[];
	public FixedStack() {
		top=-1;
		data=new int[5];
	}
	
	@Override
	
	public void push(int i) {
		if(top==5) {
			System.out.print("no space to push");
		}
		
		else {
			top++;
		data[top]=i;
		
		}
	}

	@Override
	public void pop() {
		if(top==-1)
		{System.out.print("no element empty stack");
		}
		else
		{System.out.print(data[top]);
		top--;
		}
		}
	}