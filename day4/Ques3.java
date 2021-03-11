package day4;

public class Ques3 {
	int i=1;
	char c='a';
	float f=0.1f;
	String s=new String("ajith");
	double d=1.1111111;
	Ques3(){
		i=c;
		System.out.print(i);
		i=f;
		System.out.print(i);
		i=s;
		System.out.print(i);
		i=d;
		System.out.print(i);
		c='a';
		c=i;
		System.out.print(c);
		c=f;
		System.out.print(c);
		c=d;
		System.out.print(c);
		c=s;
		System.out.print(c);
		f=0.1f;
		f=i;
		f=c;
		f=s;
		f=d;
		s=new String("ajith");
		s=i;
		s=c;
		s=f;
		s=d;
		d=1.1111111;
		d=i;
		d=c;
		d=f;
		d=s;}
	public static void main(String[] args)
{
		Ques3 q=new Ques3();
		}
}
