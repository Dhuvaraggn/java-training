package day10;


public class CloneDemo {
		public static void main(String [] args) throws Exception {
			
			MyBusiness myb=MyBusiness.createObj();
			myb.setDobj(DataObj.createObject());
			myb.s="ajith";
			MyBusiness myb1=MyBusiness.createObj();
			myb1.s="raj";
			myb1.setDobj(DataObj.createObject());
			myb.getDobj().st="ajith";
			myb1.getDobj().st="raj";
			System.out.print(myb.getDobj().st);
			System.out.print(myb1.getDobj().st	);
			
			System.out.print("\n"+myb1.s+" "+myb.s);
		}
	}
	class MyBusiness implements Cloneable{
		String s;
		DataObj dobj;
		
		public final DataObj getDobj() {
			return dobj;
		}
		public final void setDobj(DataObj dobj) {
			this.dobj = dobj;
		}
		private MyBusiness(DataObj d) {
			dobj=d;
		}
		private MyBusiness() {
			System.out.print("cons calleds");
		}
		private static MyBusiness myobj;
		synchronized public static MyBusiness createObj() throws Exception
		{
			if(myobj==null) {
				myobj=new MyBusiness();
			}
			return myobj.createClone();
		}
		public MyBusiness createClone() throws Exception{
			return (MyBusiness)super.clone();
		}
	}
	class DataObj implements Cloneable
	{	String st;
		private DataObj() {
			System.out.print("data obj cons called");
		}
		private static DataObj mydobj;
		synchronized public static DataObj createObject() throws Exception{
			if(mydobj==null)
			{	mydobj=new DataObj();
				}
			return mydobj.createClone();
		}
		public DataObj createClone() throws Exception{
			return (DataObj)super.clone();
		}
	}

