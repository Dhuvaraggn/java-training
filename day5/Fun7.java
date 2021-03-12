package day5;

public class Fun7 {
	public static void main(String arg[])
	{System.out.print(22.25%10);
	int a=1;
	a+=10;
	System.out.print(a);
	a-=10;
	System.out.print(a);
	a*=10;
	System.out.print(a);
	a/=10;
	System.out.print(a);

	 int b = 2;
	 int c;
	 int d;
	 c = ++b;
	 System.out.print("\n"+c+" ");

	 d = a++;
	 System.out.print(c+" "+d);

	 c++; 
	 System.out.print(c+" "+d);
 
	 boolean bc1=4<1;
	 System.out.print(bc1);
	 int  done=0;	
	 if(done==0) {
	}
	 boolean bdone=true;
	 if(!bdone) {}
	 if(bdone) {}
	 
	 boolean ba=true;
	 boolean bb=false;
	 boolean bc,bd,be,bf,bg;
	 bc=ba|bb;
	 bd=ba&bb;
	 be=ba^bb;
	 bf=(!ba&bb)|(ba&!bb);
	 bg=!ba;
	 System.out.println(bc+" "+bd+be+bf+bg);
	 
	 a = 20; b = 10;
	 int x = a>b? a:b;
	 System.out.print(x);
	}}
	
