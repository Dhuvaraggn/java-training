package daythirteenlab;

public class Ques2 {
	public static void main(String [] args) {
		Emp e1=new Emp();
		Emp e2=new Emp();
		System.out.print(e1.equals(e1));
		System.out.print(e1.hashCode()+" "+e1.hashCode());
	}
	 //Which statements are true about comparing two instances of the same class, given that the equals() and hashCode() methods have been properly overridden? (Choose all that apply.) 

	//Answer If the hashCode() comparison == returns true, the equals() method must return true 
}
class Emp
{
	
	
	
}