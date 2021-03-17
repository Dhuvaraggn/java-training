package day7;

public class GovernmentDemo {
	public static void main(String [] args)
	{
		RevenueOffice r=new RevenueOffice();
		Hospital h=new Hospital();
		PoliceStation p=new PoliceStation();
		FoodDept f=new FoodDept();
		Service s=new Service();
		AadhaarSeva a=new AadhaarSeva(p,h,r,f);
		s.setS(1,a);
		MedicalSeva m=new MedicalSeva(p,h,r,f);
		s.setS(2, m);
		RegistrationSeva re=new RegistrationSeva(p,h,r,f);
		s.setS(3, re);
		s.setService(3	);
	}
}
class Service{
	Seva s[]=new Seva[5];
	public Service() {
	for(int i=0;i<5;i++) {
		s[i]=new DummySeva();
	}
	}
	public final Seva getS(int i) {
		return s[i];
	}
	public void setService(int i) {
		s[i].provide();
	}
	public final void setS(int i,Seva s) {
		this.s[i] = s;
	}
	
}

abstract class Seva{
	public final PoliceStation getP() {
		return p;
	}
	public final Hospital getH() {
		return h;
	}
	public final RevenueOffice getR() {
		return r;
	}
	public final FoodDept getF() {
		return f;
	}
	private PoliceStation p;
	private Hospital h;
	private RevenueOffice r;
	private FoodDept f;
	public Seva()
	{
	}
	public Seva(PoliceStation p,Hospital h,RevenueOffice r,FoodDept f) {
		this.p=p;
		this.r=r;
		this.h=h;
		this.f=f;
	}
	public abstract void provide();
}
class DummySeva extends Seva{
	public DummySeva()
	{
		//System.out.print("dummy seva called");
	}
	public void provide() {
		System.out.print("dummy seva called");
	}
}
class PattaSeva extends Seva{
	public PattaSeva(PoliceStation p,Hospital h,RevenueOffice r,FoodDept f) 
		{
		 super(p,h,r,f);
		}
	@Override
	public void provide()
	{
		System.out.print("seva got the request for patta certificate");
		getR().pattaClear();
	}
}
class MedicalSeva extends Seva{
	public MedicalSeva(PoliceStation p,Hospital h,RevenueOffice r,FoodDept f) 
		{
		 super(p,h,r,f);
		}

	public void provide() {
		System.out.print("REquests for medical cert is given");
		getH().medClear();
	}
}
class RegistrationSeva extends Seva
{	public RegistrationSeva(PoliceStation p,Hospital h,RevenueOffice r,FoodDept f) {
	
		 super(p,h,r,f);
		}
	public void provide()
	{
		System.out.print("Registration for land is submitted  to seva");
		getR().regCert();
	}
}
class AadhaarSeva extends Seva
{	public AadhaarSeva(PoliceStation p,Hospital h,RevenueOffice r,FoodDept f) {
	super(p,h,r,f);
		}
	public void provide()
	{
		System.out.print("the request for aadhar is submitnted");
		getR().adhaarClear();
	}
}	
class PoliceStation
{
	
	public void policeClear() {
		System.out.print("police has approved the clearance for ........");
	}
}
class Hospital{
	public void medClear() {
		System.out.print("no problem or morbidity..........");}
	
}
class RevenueOffice{
	public void pattaClear() {
		System.out.print("patta is issued for him  on 2309343204");

	}
	public void regCert()
	{
		System.out.print("landregistration will be done");
	}
	public void adhaarClear() {
		System.out.print("adhaar card is issed to this person with adhaar no ");
	}
}

class FoodDept{
	public void foodClear(){
		System.out.print("these company has good safety norms on production so food dept clearance cert");
	}
}
