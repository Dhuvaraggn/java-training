package day3;

public class Ques35 {
	    public static void main(String argv[]){ 
	        Ques35 c=new Ques35(); 
	        String s=new String("ello"); 
	        c.amethod(s); 
	    } 
	public void amethod(String s){ 
	    char c='H'; 
	    c+=s; //char and string or 16 and 32 bit
	    System.out.println(c); 
	    } 
	}

//Ans compile time error
