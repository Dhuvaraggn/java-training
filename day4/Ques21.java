package day4;

public class Ques21 {
	public static void main(String[] args) {
		int y=2005;
		int month[]= new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
		switch(y%4) {
		case 0:
			for(int m:month) {
			switch(m)
			{case 2: 
				System.out.print("28 days");
				break;
			default:
				if(m%2==0) {
				System.out.print("30 days");}
				else {
					System.out.print("31 days" );
				}
			
				break;
			}
			break;}
		default:
			for(int m:month)
			switch(m%2) {
			case 0:
				System.out.print("30 days");
				break;
			case 1:
				System.out.print("31 days");
				break;
			}
		}
	}

}
