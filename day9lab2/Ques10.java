package day9lab2;

import java.util.Scanner;

public class Ques10 {
	public static void main(String [] args) {
	int s[]=new int[5];
	int q=1;
	Scanner sc=new Scanner(System.in);
	while(q!=0) {
		System.out.print("enter the student marks");
		
		for(int i=0;i<5;i++) {
			try {
			s[i]=sc.nextInt();
			if(s[i]<0) {
				i--;
				Excep e=(Excep) Class.forName("day9lab2.Neg").getConstructor().newInstance();
				e.execute();
			}
			else if(s[i]>100) {
				i--;
			Excep e=(Excep)Class.forName("day9lab2.Range").getConstructor().newInstance();
			e.execute();
			
			}
			}
			catch(Exception e) {
				System.out.print(e);
			}
		}
		int sum=0;
		for(int i:s) {
			sum+=i;
		}
		System.out.print(sum/5);
		System.out.print("enter 0 to quit");
		q=sc.nextInt();
}
}
}
abstract class Excep
{
	abstract public void execute() throws NumberExcep;
}
class Neg extends Excep
{
	public Neg() {
		
	}
	@Override
	public void execute() throws NumberExcep {
		throw new NegException();
		
	}
	
}
class Range extends Excep
{
	public Range() {
		
	}
	@Override
	public void execute() throws NumberExcep {
		// TODO Auto-generated method stub
		throw new RangeException();
	}
	
}
abstract class NumberExcep extends Exception
{
	public abstract void execute();
}
class NegException  extends NumberExcep
{
	public NegException()
	{
		System.out.print("neg exception called");
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
	
}
class RangeException extends NumberExcep
{
	public RangeException()
	{
		System.out.print("range exception calle");
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
	
}