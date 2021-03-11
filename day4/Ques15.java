package day4;

public class Ques15 {
	public static void main(String[] args) {
		for(int n=1;n<=100;n++) {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					break;
				}
				else if(i==n/2 && n%i!=0) {
					System.out.print(n+"   ");
				}
				else {
					continue;
				}
				
			}
		}
		int arm=121;
		int cpy=arm;
		int nu[]=new int[3];
		int rn=0;
		int i=0;
		while(arm/10>=0 && arm>0) 
		{
			if(arm>9) {
			rn=rn*10+arm%10;
			//nu[i]=arm%10;
			arm=(arm-nu[i])/10;}
			else {
				rn=rn*10+arm;
				//nu[i]=arm;
				arm=0;
			}
			i++;
		}
		System.out.print(rn);
		if(rn==cpy) {
			System.out.print("the number"+ cpy + " is armstrong number");
		}
		else {
			System.out.print("The number "+ cpy + " is not armstrong number");
		}
		//for(int k:nu) {
		//System.out.print("f"+k);}
	}

}
