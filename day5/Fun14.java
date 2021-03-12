package day5;

public class Fun14 {
	public static void main(String[] arg) {
		Account a=new Account("vimal",2,'s',200f);
		a.deposit(100f);
		a.display();
	}
}
class Account{
	String name;
	int accno;
	char typeofacc;
	float balance;
	public Account()
	{
		name="ajith";
		accno=1;
		typeofacc='s';
		balance=0;
		
	}
	public Account(String name,int accno,char typeofacc,float balance) {
		this.name=name;
		this.accno=accno;
		this.typeofacc=typeofacc;
		this.balance=balance;
		
	}
	public void deposit(float a) {
		balance+=a;
		System.out.print("the present balance"+ balance);
	}
	public void display() {
		System.out.print(name);
		System.out.print(accno);
		System.out.print(typeofacc);
		System.out.print(balance);
	}
}