package day8;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class InterfaceDemo {
	public static void main(String [] args) {
		AllopathyMedcollege allo=new AllopathyMedcollege();
		AyurvedMedcollege ayur = new AyurvedMedcollege();
		Human ajith=new Human();
		Doctor docajith=(Doctor) Proxy.newProxyInstance(ajith.getClass().getClassLoader(), 
				new Class[] {Doctor.class},
				new MyInvocationHandler(ayur));
		docajith.doCure();
		}
}
class MyInvocationHandler implements InvocationHandler{
	Doctor doctor;
	public MyInvocationHandler(Doctor doctor) {
		this.doctor=doctor;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.print("invoke method caled");
		return method.invoke(doctor);
	}
}
interface Doctor
{	public void doCure();
}
class Human {
	
}
class AllopathyMedcollege implements Doctor{
	@Override
	public void doCure() {
		System.out.print("allopathy medical cure is given ........");
	}
}
class AyurvedMedcollege implements Doctor{
	@Override
	public void doCure()
	{
		System.out.print("ayurved medical treatment is given ..........");
		}
	}

	