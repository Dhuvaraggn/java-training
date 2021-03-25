package day11;

public class TwoThreadDemo {
	public static void main(String [] args) throws Exception
	{
		System.out.print("first line");
		met();
		new Thread(()->{try {
			met();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}).start();
		System.out.print("third lime");
	}
	static void met() throws Exception {
try{Thread.sleep(1000);}catch(Exception e) {
			
		}
		System.out.print("scnd line");
		
	}
}
