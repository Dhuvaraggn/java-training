package day6;

public class ObjectCreateDemo {
	public static void main(String [] args) throws Exception{
		MyBusiness b1=MyBusiness.createObject();
		b1.str="ajith";
		MyBusiness b2=MyBusiness.createObject();
		b2.str="raj";
		System.out.print(b2.str);
		
	}
}
class MyBusiness implements Cloneable{
	String str;
	private MyBusiness() throws Exception {
		System.out.print("cons called");
	}
	private static  MyBusiness myobj;
	public static MyBusiness createObject() throws Exception {
		if(myobj==null) {
			myobj=new MyBusiness();
		}
		return myobj.createClone();
	}
	public MyBusiness createClone() throws Exception{
		return (MyBusiness)super.clone();
	}
}
/*public class ObjectCreateDemo {
	public static void main(String [] args) {
		MyBusiness b1=MyBusiness.createObject();
		b1.str="ajith";
		MyBusiness b2=MyBusiness.createObject();
		b2.str="raj";
		System.out.print(b1.str);
		
	}
}
class MyBusiness{
	String str;
	private MyBusiness() {
		System.out.print("cons called");
	}
	private static  MyBusiness myobj;
	public static MyBusiness createObject() {
		if(myobj==null) {
			myobj=new MyBusiness();
		}
		return myobj;
	}
}*/