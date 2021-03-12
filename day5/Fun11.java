package day5;

public class Fun11 {
public static void main(String[] args)
{ int n=12345;
  int d[]=new int[10];
  int i=0;
  while(n>=10)
  { d[i]=n%10;
  n=(n-d[i])/10;
  i++;
	  }
  d[i]=n;
  System.out.print("sum");
  int sum=0;
  for(int j:d) {
	  System.out.print(j);
	  sum+=j;
  }
  System.out.print(sum);
  }
}
