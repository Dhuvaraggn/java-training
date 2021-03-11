package day4;

public class Ques18 {
	public static void main(String[] args) {
		int n=121;
		int nu[]=new int[3];
		int i=0;
		while(n/10>=0 && n>0) 
		{
			if(n>9) {
			nu[i]=n%10;
			n=(n-nu[i])/10;}
			else {
				nu[i]=n;
				n=0;
			}
			i++;
		}
		String s="";
		for(int j:nu) {
			switch(j) {
			case 0:
				s=s+"zero ";
				break;
			case 1:
				s=s+"one ";
				break;
			case 2:
				s=s+"two ";
			}
		}
		System.out.print(s);
	}
}
