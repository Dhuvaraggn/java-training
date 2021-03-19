package day8;

	import java.lang.reflect.InvocationHandler;
	import java.lang.reflect.Method;
	import java.lang.reflect.Proxy;
	import java.util.*;
public class DynamicBinding {
		public static void main(String [] args) throws Exception{
			
			/*Doctor1 docajith=(Doctor1) Proxy.newProxyInstance(ajith.getClass().getClassLoader(), 
					new Class[] {Doctor1.class},
					new MyInvocationHandler(ayur));
			docajith.doCure();*/
			

			AyurvedMedcollege1 ayur = new AyurvedMedcollege1();
			FlyAcademy fly=new FlyAcademy();
			
			Object ajith=new Human1();
			
			ajith=Proxy.newProxyInstance(ajith.getClass().getClassLoader(),
					new Class[] {Doctor1.class,Pilot.class,Nurse.class,Surgeon.class}, 
					new MyInvocationHandler1(new Object[] {ajith,ayur,fly}));
			
			Doctor1 doctorAjith=(Doctor1)ajith;
			doctorAjith.doCure();
			
			Pilot pilotAjith=(Pilot)ajith;
			pilotAjith.dofly();
			
			Nurse nurseAjith=(Nurse)ajith;
			nurseAjith.doCare();
			
			
			
			Scanner s=new Scanner(System.in);
			String str=s.next();
			

			Steward st=new StewardAcademy();
			AllopathyMedcollege1 allo=new AllopathyMedcollege1();
			
			ajith=Proxy.newProxyInstance(ajith.getClass().getClassLoader(),
					new Class[] {Steward.class,Surgeon.class					}, 
					new MyInvocationHandler1(new Object[] {ajith,allo,st}));
			
			
			Steward stewardAjith=(Steward)ajith;
			stewardAjith.serve();
			
			Surgeon surgeonAjith=(Surgeon)ajith;
			surgeonAjith.doSurgery();
	}
}
	class MyInvocationHandler1 implements InvocationHandler{
		//Doctor doctor;
		Object object[];
		public MyInvocationHandler1(Object object[]) {
			this.object=object;
		}
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			Object returnObject=null;
			for(Object ob:object) {
				Method m[]=ob.getClass().getDeclaredMethods();
				for(Method mo:m) {
					if(mo.getName().equals(method.getName())) {
						mo.setAccessible(true);
						returnObject=mo.invoke(ob);
					}
				}
			}
			return returnObject;
		}
	}
	interface Steward
	{
		public void serve();
	}
	class StewardAcademy implements Steward{

		@Override
		public void serve() {
			System.out.print("serving...............");
		}
			
	}
	interface Pilot{
		public void dofly();
	}
	class FlyAcademy implements Pilot
	{

		@Override
		public void dofly() {
			System.out.print("flying..........");	
			}
	
	}
	interface Doctor1
	{	public void doCure();
	}
	interface Nurse{
		public void doCare();
	}
	interface Surgeon{
		public void doSurgery();
	}
	class Human1{
		
	}
	class AllopathyMedcollege1 implements Doctor1,Surgeon,Nurse{
		@Override
		public void doCure() {
			System.out.print("allopathy medical cure is given ........");
		}

		@Override
		public void doCare() {
			System.out.print(" ajith will do nursing ");
			
		}

		@Override
		public void doSurgery() {
			System.out.print("ajith will surge u");
			
		}
	}
	class AyurvedMedcollege1 implements Doctor1,Nurse{
		@Override
		public void doCure()
		{
			System.out.print("ayurved medical treatment is given ..........");
			}

		@Override
		public void doCare() {

			System.out.print("ayur nursing will be done");
		}
		}

		
