package day5;
public class Fun4 {
	public static void main(String[] arg) {
		String str="ajith raj Is A good9879 guy:)";
		count(str);
	}
	static void count(String s) {
		char c[]=s.toCharArray();
		int letter=0;
		int digit=0;
		int space=0;
		int other=0;
		for(int i:c) {
			if(Character.isLetter(i)) {
				letter++;
			}
			else if(Character.isDigit(i)) {
				digit++;
			}
			else if (Character.isSpaceChar(i)){
				space++;
			}
			else {
				other++;
			}
		}
		System.out.print("no of letter"+ letter);

		System.out.print("no of digit"+ digit);
		System.out.print("no of space"+ space);
		System.out.print("no of other"+ other);
	}
}
