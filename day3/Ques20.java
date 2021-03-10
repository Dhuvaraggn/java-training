package day3;

public class Ques20 {
	public void amethod(int i) {
		
	}
}
public class scope extends Ques20{
	public static void main(String[] args)
	{
	}
		//void amethod(int i) throws Exception {}  no
	void amethod(long i)throws Exception {} //yes
	 //void amethod(long i){} //yes

	 //public void amethod(int i) throws Exception {} no
 
}