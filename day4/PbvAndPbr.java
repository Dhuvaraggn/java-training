package day4;

public class PbvAndPbr {
	public static void main(String[] args)
	{
		Laddu l=new Laddu();
		System.out.println("laddu size"+ l.size);
		PassByValue pbv=new PassByValue();
		pbv.setLaddu(l.size);
		System.out.println("laddu size"+ l.size);
		PassByRef pbr=new PassByRef();
		pbr.setLaddu(l);
		System.out.println("laddu size"+ l.size);
	}
	
}
class Laddu{
	int size=10;
}

class PassByValue{
	public void setLaddu(int size)
	{
		size=0;
	}
}
class PassByRef{
	public void setLaddu(Laddu laddu)
	{
		laddu.size=0;
	}
}